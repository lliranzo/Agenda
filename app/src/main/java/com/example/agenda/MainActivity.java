package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText User;
    private EditText Pass;
    private Button Login;
    private Button Clean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User = (EditText) findViewById(R.id.etuser);
        Pass = (EditText) findViewById(R.id.etpass);
        Login  = (Button) findViewById(R.id.btlogin);
        Clean = (Button) findViewById(R.id.btclean);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validar(User.getText().toString(), Pass.getText().toString());
            }
        });
        Clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User.setText("");
                Pass.setText("");
            }
        });
    }
    private void validar(String username, String pass)
    {
        if((username.isEmpty())|| pass.isEmpty())
        {
            Toast toast = Toast.makeText(getApplicationContext(),"Debe completar todos los campos",Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            if ((username.equals("unibe")) && (pass.equals("12345"))) {
                Intent intent = new Intent(MainActivity.this, ContactActivity.class);
                startActivity(intent);
            } else {
                Toast toast = Toast.makeText(getApplicationContext(), "Usuario o Password incorrecto", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    }
}
