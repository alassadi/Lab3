package com.company.lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText user_name, user_password;
    Button singIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setControlView();
        setClickForView();
    }

    public void setControlView(){
        user_name=findViewById(R.id.userName);
        user_password=findViewById(R.id.password);
        singIn=findViewById(R.id.signButton);

    }
    public void setClickForView(){
        singIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //method to check user in database returns boolean
                //username password paramethers

                if (true){
                    Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);

                }
            }
        });
    }

}
