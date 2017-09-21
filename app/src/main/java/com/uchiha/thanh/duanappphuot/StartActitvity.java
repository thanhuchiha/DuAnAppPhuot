package com.uchiha.thanh.duanappphuot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StartActitvity extends AppCompatActivity {

    TextView txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_actitvity);
        txtName = (TextView) findViewById(R.id.txtname);
        Intent intent = getIntent();
        String name = intent.getStringExtra("hoten");
        txtName.setText(name);

    }
}
