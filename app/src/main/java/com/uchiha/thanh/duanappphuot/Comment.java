package com.uchiha.thanh.duanappphuot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.uchiha.thanh.duanappphuot.model.CmtRating;

import java.util.ArrayList;

public class Comment extends Activity {


    RatingBar ratingBar;
    ImageView imageView;
    EditText editText;
    TextView binhluan, diemTb;
    Button btnsubmit;
    float diem;
    float TB;
    int cmtCount;

    ListView listView;

    ArrayList<CmtRating> arraycmt = new ArrayList<CmtRating>();
    ArrayAdapter<CmtRating> adapter;


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
        listView = (ListView) findViewById(R.id.listview);
        adapter = new ArrayAdapter<CmtRating>(this, android.R.layout.simple_list_item_1, arraycmt);
        listView.setAdapter(adapter);
        tinhTBdiem();
        demCmt();

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                diem= rating*2;
            }
        });
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noidung = editText.getText()+ "";
                Toast.makeText(Comment.this, noidung , Toast.LENGTH_LONG).show();
                CmtRating cmtRating = new CmtRating(noidung, diem);
                arraycmt.add(cmtRating);
                adapter.notifyDataSetChanged();
                ratingBar.setRating(0);
                editText.setText("");
                tinhTBdiem();
                demCmt();
            }
        });
    }

    public  void tinhTBdiem(){
        float i=0 , sum=0;
        for (CmtRating cmtRating: arraycmt) {

            sum+= cmtRating.getDiem();
            i++;

        }
        TB =  sum/i;
        TB = Math.round(TB);

        diemTb.setText(TB+"");
    }
    public void demCmt(){
        int dem=0 ;
        for (CmtRating cmtRating: arraycmt) {
            dem++;
        }
        cmtCount= dem;
        binhluan.setText(cmtCount +"");
    }
}
