package com.vergiean.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    final public static String EXTRA_NAME = "extra_name";
    final public static String EXTRA_EMAIL = "extra_email";
    final public static String EXTRA_PHONE = "extra_phone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = (EditText) findViewById(R.id.idInputNama);
        EditText inputEmail = (EditText) findViewById(R.id.idInputEmail);
        EditText inputPhone = (EditText) findViewById(R.id.idInputTelephone);
        EditText inputPassword = (EditText) findViewById(R.id.idInputPassword);

        Button btnSave = (Button) findViewById(R.id.idBtnSave);
        btnSave.setOnClickListener(v -> {
            Intent loginIntent = new Intent(MainActivity.this, DashboardActivity.class);
            loginIntent.putExtra(EXTRA_NAME, inputName.getText().toString());
            loginIntent.putExtra(EXTRA_EMAIL, inputEmail.getText().toString());
            loginIntent.putExtra(EXTRA_PHONE, inputPhone.getText().toString());
            startActivity(loginIntent);
        });
    }
}