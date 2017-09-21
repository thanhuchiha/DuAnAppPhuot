package com.uchiha.thanh.duanappphuot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class register extends AppCompatActivity {

    EditText edtNameDangNhap,nameHienThi,edtRePass,edtPass;
    TextView txtDangNhap;
    Button btnDangKy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edtNameDangNhap = (EditText) findViewById(R.id.edtEmailDK);
        edtPass = (EditText)findViewById(R.id.edtPassDK);
        edtRePass = (EditText) findViewById(R.id.edtDoublePassDK);
        nameHienThi = (EditText) findViewById(R.id.edtNameDK);
        btnDangKy = (Button) findViewById(R.id.btnDangKy);
        txtDangNhap = (TextView) findViewById(R.id.txtDangNhap);

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameDangNhap = edtNameDangNhap.getText().toString();
                String pass = edtPass.getText().toString();
                String rePass = edtRePass.getText().toString();
                String nameHien = nameHienThi.getText().toString();

                if(!"".equals(nameDangNhap) && !"".equals(nameHien) && !"".equals(pass) && rePass.equals(pass)){
                        Intent intent = new Intent(register.this, StartActitvity.class);
                        String name = edtNameDangNhap.getText().toString();
                        intent.putExtra("hoten", name);
                        startActivity(intent);

               }else {
                    Toast.makeText(register.this,"Thông tin đăng ký không hợp lệ. Kiểm tra lại",Toast.LENGTH_LONG).show();
                }
            }
        });
        txtDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(register.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
