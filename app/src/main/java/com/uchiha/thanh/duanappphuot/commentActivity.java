package com.uchiha.thanh.duanappphuot;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class commentActivity extends Activity {
    RatingBar ratingBar;
    ImageView imageView;
    EditText editText;
    TextView binhluan, diemTb;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comment);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        imageView = (ImageView) findViewById(R.id.imageView3);
        editText = (EditText) findViewById(R.id.editText);
        binhluan = (TextView) findViewById(R.id.binhluan);
        diemTb = (TextView) findViewById(R.id.DiemTB);
        btnsubmit = (Button) findViewById(R.id.button);


    }
}
