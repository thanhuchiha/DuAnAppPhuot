package com.uchiha.thanh.duanappphuot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtEmail,edtPass;
    Button btnDangNhap;
    TextView txtDangKy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPass = (EditText) findViewById(R.id.edtPass);
        btnDangNhap = (Button) findViewById(R.id.btnDangNhap);
        txtDangKy = (TextView) findViewById(R.id.txtDangKy);
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , StartActitvity.class);
                String email = edtEmail.getText().toString();
                String pass = edtPass.getText().toString();
                if(email.equals("admin") && pass.equals("12345")){
                    intent.putExtra("hoten",email);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"Sai tên đăng nhập hoặc mật khẩu",Toast.LENGTH_LONG).show();
                }
            }
        });
        txtDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,register.class);
                startActivity(intent);
            }
        });

    }
}
