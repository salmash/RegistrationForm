package edu.cs.birzeit.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String data = intent.getStringExtra("DATA");

        TextView txtDisplayData = findViewById(R.id.Data);
        txtDisplayData.setText(data);
    }

    public void onClickExit(View view) {
        finishAffinity();
        System.exit(0);

    }

    public void onClickReturn(View view) {
        finish();
        System.exit(0);
    }
}