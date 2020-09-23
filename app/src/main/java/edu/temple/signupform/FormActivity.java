package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String passwordConfirmToast = "The two passwords do not match.";
        final String passwordToast = "You need to enter a password.";
        final String emailToast = "You need to enter an email.";
        final String nameToast = "You need to enter a name.";

        final EditText name = findViewById(R.id.editTextName);
        final EditText email = findViewById(R.id.editTextEmailAddress);
        final EditText password = findViewById(R.id.editTextPassword);
        final EditText passwordConfirm = findViewById(R.id.editTextPasswordConfirm);
        final Button save = findViewById(R.id.saveButton);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString() == ""){
                    Toast.makeText(FormActivity.this, nameToast, Toast.LENGTH_SHORT);
                }
                if(email.getText().toString() == ""){
                    Toast.makeText(FormActivity.this, emailToast, Toast.LENGTH_SHORT);
                }
                if(password.getText().toString() == ""){
                    Toast.makeText(FormActivity.this, passwordToast, Toast.LENGTH_SHORT);
                }
                if(passwordConfirm.getText().toString() != password.getText().toString()){
                    Toast.makeText(FormActivity.this, passwordConfirmToast, Toast.LENGTH_SHORT);
                }
            }
        });


    }
}