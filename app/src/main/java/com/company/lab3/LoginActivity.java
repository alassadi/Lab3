package com.company.lab3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText user_name, user_password;
    Button singIn;
    Context mContext;
    Database mDatabase;
    String user=null, password=null;
    int userId=0, balance=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mDatabase=new Database(this);
        setControlView();
        setClickForView();

    }

    public void setControlView(){
        user_name=(EditText)findViewById(R.id.userName);
        user_password=(EditText)findViewById(R.id.password);
        singIn=findViewById(R.id.signButton);

    }

    public void setClickForView(){
        singIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String name="hannah", password="0000";


               if (user_name.getText().toString().equalsIgnoreCase(name) && user_password.getText().toString().equalsIgnoreCase(password)){
                   mDatabase.createAccount(name,password,"1000000");
                   Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                   startActivity(intent);
               }
               else {
                   //Toast.makeText(mContext,"Wrong!!",Toast.LENGTH_SHORT).show();
               }


            }
        });
    }

}
