package com.example.congtrinh.event2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtSoa, edtSob;
    TextView tvKetQua;
    Button btnTong2so;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSoa = (EditText) findViewById(R.id.edtSoa);
        edtSob = (EditText) findViewById(R.id.edtSob);
        tvKetQua = (TextView) findViewById(R.id.tvKetQua);
        btnTong2so = (Button) findViewById(R.id.btnTong2so);

        btnTong2so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edtSoa.getText() + "");
                int b = Integer.parseInt(edtSob.getText() + "");
                tvKetQua.setText((a + b) + "");
            }
        });
    }


}
