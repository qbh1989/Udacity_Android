package com.example.administrator.happybirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Button btn1,btn2,btn3,btn4,btn5;
    Toast tst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 =(Button)findViewById(R.id.btndianying);
        btn2 =(Button)findViewById(R.id.btngupiao);
        btn3 =(Button)findViewById(R.id.btnyueduqi);
        btn4 =(Button)findViewById(R.id.btnxinwen);
        btn5 =(Button)findViewById(R.id.btnbiye);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tst = Toast.makeText(MainActivity.this,"电影项目启动",Toast.LENGTH_SHORT);
                tst.show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tst = Toast.makeText(MainActivity.this,"股票项目启动",Toast.LENGTH_SHORT);
                tst.show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tst = Toast.makeText(MainActivity.this,"xyz阅读器项目启动",Toast.LENGTH_SHORT);
                tst.show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tst = Toast.makeText(MainActivity.this,"最新闻项目启动",Toast.LENGTH_SHORT);
                tst.show();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tst = Toast.makeText(MainActivity.this,"毕业设计项目启动",Toast.LENGTH_SHORT);
                tst.show();
            }
        });



    }

}
