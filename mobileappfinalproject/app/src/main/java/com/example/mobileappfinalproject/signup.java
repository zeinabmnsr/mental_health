package com.example.mobileappfinalproject;
import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobileappfinalproject.UserAccount;
import com.example.mobileappfinalproject.login;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference reference;
    Button btnSignup;
    TextView LoginRedirectText;
    EditText signupEmail, signupPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btnSignup = findViewById(R.id.btnSignup);
        LoginRedirectText = findViewById(R.id.tvLoginRedirect);
        signupEmail = findViewById(R.id.etSignupEmail);
        signupPassword = findViewById(R.id.etSignupPassword);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users");

                String email = signupEmail.getText().toString().trim();
                String password = signupPassword.getText().toString().trim();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(signup.this, "All fields are required", Toast.LENGTH_LONG).show();
                    return;
                }

                UserAccount userAccount = new UserAccount(email, password);

                reference.child(email).setValue(userAccount).addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        Toast.makeText(signup.this, "Signup Successful!", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(signup.this, MainActivity.class);
                        startActivity(intent);
                        //startActivity(new Intent(signup.this, login.class));
                        finish();
                    } else {
                        Toast.makeText(signup.this, "Signup Failed: " + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                    }
                });

            }
        });

        LoginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signup.this, login.class);
            }
        });
    }
}
