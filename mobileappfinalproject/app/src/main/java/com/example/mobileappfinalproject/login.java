package com.example.mobileappfinalproject;
import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class login extends AppCompatActivity {
    Button btnlogin;
    EditText etLoginEmail, etLoginPassword;
    TextView signupRedirect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signupRedirect = findViewById(R.id.tvSingUpRedirect);
        etLoginEmail = findViewById(R.id.etLoginEmail);
        etLoginPassword = findViewById(R.id.etLoginPassword);
        btnlogin = findViewById(R.id.btnLogin);

        btnlogin.setOnClickListener(view -> {
            if(!validateCredentials()){
                Toast.makeText(login.this, "Credentials are wrong", Toast.LENGTH_LONG).show();
            } else {
                checkCredentials();
                Intent intent = new Intent(login.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        signupRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, signup.class);
                startActivity(intent);
            }
        });
    }

    public Boolean validateCredentials() {
        String valEmail = etLoginEmail.getText().toString().trim();
        String valPassword = etLoginPassword.getText().toString().trim();
        if (valEmail.isEmpty() || valPassword.isEmpty()) {
            Toast.makeText(login.this, "Credentials can't be empty", Toast.LENGTH_LONG).show();
            return false;
        } else {
            etLoginPassword.setError(null);
            etLoginEmail.setError(null);
            return true;
        }
    }

    public void checkCredentials(){
        String checkEmail = etLoginEmail.getText().toString().trim();
        String checkPassword = etLoginPassword.getText().toString().trim();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");
        Query checkDatabase = reference.orderByChild("email").equalTo(checkEmail);

        checkDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot userSnapshot : snapshot.getChildren()) {
                    String passwordFromDB = userSnapshot.child("password").getValue(String.class);
                    if (passwordFromDB != null && passwordFromDB.equals(checkPassword)) {
                        Intent intent = new Intent(login.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                        return;
                    }
                }
                //etLoginEmail.setError("User doesn't exist");
                //etLoginEmail.requestFocus();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {}
        });
    }
}
