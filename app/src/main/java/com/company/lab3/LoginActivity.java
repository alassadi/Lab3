package com.company.lab3;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText user_name, user_password;
    Button singIn;
    Database sqliteHelper;
    Account account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setControlView();
        setClickForView();
        sqliteHelper = new Database(this);
        account = new Account("Name", "123456", "4555");
        sqliteHelper.addUser(account);

        singIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Check user input is correct or not
                if (validate()) {

                    //Get values from EditText fields
                    String Email = user_name.getText().toString();
                    String Password = user_password.getText().toString();


                    //Authenticate user
                    Account currentUser = sqliteHelper.Authenticate(new Account(Email, Password));

                    //Check Authentication is successful or not
                    if (currentUser != null) {
                        Snackbar.make(singIn, "Successfully Logged in!", Snackbar.LENGTH_LONG).show();

                        //User Logged in Successfully Launch You home screen activity
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        intent.putExtra("USER_NAME", currentUser.getBalance());
                        startActivity(intent);
                        finish();
                    } else {

                        //User Logged in Failed
                        Snackbar.make(singIn, "Failed to log in , please try again", Snackbar.LENGTH_LONG).show();

                    }
                }
            }
        });
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

    public boolean validate() {
        boolean valid = false;

        //Get values from EditText fields
        String Email = user_name.getText().toString();
        String Password = user_password.getText().toString();

        //Handling validation for Email field
        if (Email.isEmpty()) {
            valid = false;
            Toast.makeText(this, "Enter a valid email",
                    Toast.LENGTH_LONG).show();
        } else {
            valid = true;

        }

        //Handling validation for Password field
        if (Password.isEmpty()) {
            valid = false;
            Toast.makeText(this, "Please enter valid password!",
                    Toast.LENGTH_LONG).show();

        } else {
            if (Password.length() > 5) {
                valid = true;

            } else {
                valid = false;
                Toast.makeText(this, "Password is too short!",
                        Toast.LENGTH_LONG).show();
            }
        }

        return valid;
    }

}
