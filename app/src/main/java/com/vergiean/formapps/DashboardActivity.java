package com.vergiean.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView tvName = (TextView) findViewById(R.id.idTvName);
        TextView tvEmail = (TextView) findViewById(R.id.idTvEmail);
        TextView tvPhone = (TextView) findViewById(R.id.idTvPhone);

        tvName.setText(getIntent().getStringExtra(MainActivity.EXTRA_NAME));
        tvEmail.setText(getIntent().getStringExtra(MainActivity.EXTRA_EMAIL));
        tvPhone.setText(getIntent().getStringExtra(MainActivity.EXTRA_PHONE));
    }
}