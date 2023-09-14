package com.example.brightreads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class RegisterActivity extends AppCompatActivity {

    EditText edUsername, edPassword, edEmailAddress, edConfirmPassword;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edUsername = findViewById(R.id.editTextRegisterUsername);
        edPassword = findViewById(R.id.editTextRegisterPassword);
        edEmailAddress = findViewById(R.id.editTextRegisterEmail);
        edConfirmPassword = findViewById(R.id.editTextRegisterConfirmPassword);
        btn = findViewById(R.id.buttonRegister);
        tv = findViewById(R.id.textViewSignIn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edUsername.getText().toString();
                String password = edPassword.getText().toString();
                String email = edEmailAddress.getText().toString();
                String confirmpassword = edConfirmPassword.getText().toString();
                if(username.length()==0 || password.length()==0 || email.length()==0 || confirmpassword.length()==0){
                    Toast.makeText(getApplicationContext(),"Complete the form!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Sign Up Successfully!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}