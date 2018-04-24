package com.company.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button withdraw;
    private TextView balance;
    private EditText withdrawMoney;
    private Account mAccount;
    private Database sqliteHelper;
    private String balanceString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        balance = (TextView)findViewById(R.id.balance);
        withdrawMoney = (EditText)findViewById(R.id.edittext);
        sqliteHelper = new Database(this);
        balanceString = getIntent().getStringExtra("USER_NAME");
        balance.setText(balanceString);

        withdraw = (Button)findViewById(R.id.withdraw);

        withdraw.setOnClickListener( new View.OnClickListener(){
            public void onClick (View v){
                updateBalance();
                //updateDatabase();
                //Set new balance to Textview from com.company.lab3.Database
                //activity refresh the balance/activity
            }
        });
    }

    public double updateBalance(){
        double balance1 = Double.parseDouble(balance.toString());
        double withdraw1 = Double.parseDouble(withdrawMoney.toString());

        double sum = balance1 - withdraw1;

        return sum;

    }
    //update com.company.lab3.Database with new Balance

}
