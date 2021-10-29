package com.vergiean.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
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

        Button buttonCall = (Button) findViewById(R.id.idBtnCall);
        buttonCall.setOnClickListener(v ->{
            String number = "*123#";
            Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+number));
            startActivity(callIntent);
        });
    }
}