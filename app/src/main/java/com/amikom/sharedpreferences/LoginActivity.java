package com.amikom.sharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.amikom.sharedpreferences.helper.SharedPref;

public class LoginActivity extends AppCompatActivity {
    EditText edtUser, edtPass;
    Button btnLogin, btnReg, btnForgot;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUser=findViewById(R.id.edt_username);
        edtPass=findViewById(R.id.edt_password);
        btnLogin = findViewById(R.id.btn_login);
        btnReg = findViewById(R.id.btn_register);
        btnForgot = findViewById(R.id.btn_forgot);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPref.getInstance(LoginActivity.this).setLogin(true);
                edtUser.getText();

                if(edtUser.getText().equals("admin") && edtPass.getText().equals("admin123")){

                }
            }
        });
    }
}
