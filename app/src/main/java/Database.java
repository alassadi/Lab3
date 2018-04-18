import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by fatih on 2018-04-18.
 */

public class Database extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="DATABASE1";
    private Context context;

    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context=context;
    }
    private static class ACCOUNT_TABLE{
        private static final String TABLE_NAME="ACCOUNT_TABLE";
        private static final String USER_ID="USER_ID";
        private static final String USER_NAME="USER_NAME";
        private static final String USER_PASSWORD="USER_PASSWORD";
        private static final String USER_BALANCE="USER_BALANCE";
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_ACCOUNT_TABLE="CREATE TABLE"
                + ACCOUNT_TABLE.TABLE_NAME+"("
                + ACCOUNT_TABLE.USER_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ACCOUNT_TABLE.USER_NAME + "VARCHAR (255), "
                + ACCOUNT_TABLE.USER_PASSWORD + "VARCHAR (255), "
                + ACCOUNT_TABLE.USER_BALANCE + "INTEGER, "
                +")";
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void createAccount(String userName, String password, int balace){

        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(ACCOUNT_TABLE.USER_NAME, userName);
        contentValues.put(ACCOUNT_TABLE.USER_PASSWORD, password);
        contentValues.put(ACCOUNT_TABLE.USER_BALANCE, balace);

        sqLiteDatabase.insert(ACCOUNT_TABLE.TABLE_NAME,null,contentValues);
        sqLiteDatabase.close();

    }
    public String[] showBalance(String userName){
        SQLiteDatabase sqLiteDatabase=this.getReadableDatabase();
        String balance=null;
        String query="SELECT * FROM " + ACCOUNT_TABLE.TABLE_NAME + "WHERE USER_NAME="+ userName;
        Cursor cursor=sqLiteDatabase.rawQuery(query,null);
        String[]balanceInfo=new String[0];
        cursor.moveToNext();

        if (cursor.getCount()>0){
            balance=cursor.getString(cursor.getColumnIndex(ACCOUNT_TABLE.USER_BALANCE));
        } else {
            Toast.makeText(context,"Try Again",Toast.LENGTH_SHORT).show();
        }
        cursor.close();
        sqLiteDatabase.close();
        return balanceInfo;
    }
    public void uppdateBalance(String userName, int balance){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(ACCOUNT_TABLE.USER_BALANCE, balance);

        sqLiteDatabase.update(ACCOUNT_TABLE.TABLE_NAME,contentValues, ACCOUNT_TABLE.USER_NAME+ "=?",new String[]{
                String.valueOf(userName)
        });
        sqLiteDatabase.close();
    }

}
