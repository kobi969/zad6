package com.example.zad6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText emailInput = findViewById(R.id.emailInput);
        EditText passwordInput = findViewById(R.id.passwordInput);
        EditText confirmPasswordInput = findViewById(R.id.confirmPasswordInput);
        Button submitButton = findViewById(R.id.submitButton);
        TextView message = findViewById(R.id.message);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailInput.getText().toString();
                String password = passwordInput.getText().toString();
                String confirmPassword = confirmPasswordInput.getText().toString();


                if (!email.contains("@")) {
                    message.setText("Nieprawidłowy adres e-mail.");
                } else if (!password.equals(confirmPassword)) {
                    message.setText("Hasła się różnią.");
                } else {
                    message.setText("Witaj " + email + "!");
                }
            }
        });
    }
}
