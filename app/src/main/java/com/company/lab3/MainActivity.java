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
    private TextView newbalance;
    private Account mAccount;
    Database sqliteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sqliteHelper = new Database(this);

        balance = (TextView)findViewById(R.id.balance);

        balance.setText(sqliteHelper.getBalance());

        withdrawMoney = (EditText)findViewById(R.id.edittext);


        withdraw = (Button)findViewById(R.id.withdraw);

        newbalance = (TextView) findViewById(R.id.newbalance);

        withdraw.setOnClickListener( new View.OnClickListener(){
            public void onClick (View v){
                newbalance.setText(withdraw());
                //updateDatabase();
                //Set new balance to Textview from com.company.lab3.Database
                //activity refresh the balance/activity
            }
        });

    }


    public String withdraw() {
        double balance1 = Double.parseDouble(sqliteHelper.getBalance());
        double withdraw1 = Double.parseDouble(withdrawMoney.getText().toString());

        double sum = balance1 - withdraw1;

        return String.valueOf(sum);

    }
    //update com.company.lab3.Database with new Balance


}
