package edu.temple.signupform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btnSubmit);
        //button.setOnClickListener(submitForm);
    }

    public void submitForm(View view)
    {
        EditText txtUsername = (EditText)findViewById(R.id.txtName);
        String username = txtUsername.getText().toString();
        EditText txtEmail = (EditText) findViewById(R.id.txtEmail);
        String email = txtEmail.getText().toString();
        EditText txtPassword = (EditText)findViewById(R.id.txtPassword);
        String password = txtPassword.getText().toString();
        EditText txtReenter = (EditText)findViewById(R.id.txtReenterPassword);
        String reenter = txtReenter.getText().toString();

        String foo = "";

        if (username.matches("") || email.matches("") || password.matches("") || reenter.matches(""))
        {
            foo = "please fill out all forms!";
        }
        else if (password != "" && !password.matches(reenter))
        {
            foo = "Passwords do not match!";

        }
        else
        {
            //foo = "Username: " + username + "\nPassword: " + password + "\nEmail: " + email;
            foo = "Welcome, " + username + ", to the Signup App form!";
        }
        Toast.makeText(getApplicationContext(), foo, Toast.LENGTH_LONG).show();



        //Toast.makeText(getApplicationContext(), foo, Toast.LENGTH_LONG).show();



        //else if (password != reenter)
        //{
        //    Toast.makeText(getApplicationContext(), "Passwords do not match!", Toast.LENGTH_SHORT).show();
        //}
        //else
        //{
        //    String finalMessage = "Username: " + username + " Email: " + email + " Password: " + password;
        //    Toast.makeText(getApplicationContext(), finalMessage, Toast.LENGTH_LONG).show();
        //}







    }


}
