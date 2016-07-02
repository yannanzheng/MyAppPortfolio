package com.jephy.www.myappportfolio;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_1.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                Toast.makeText(getApplicationContext(),"This button will launch my pupular movies",Toast.LENGTH_LONG).show();
                break;
         case R.id.btn_2:
                Toast.makeText(getApplicationContext(),"This button will launch stock hawk",Toast.LENGTH_LONG).show();
                break;
         case R.id.btn_3:
                Toast.makeText(getApplicationContext(),"This button will build in bigger",Toast.LENGTH_LONG).show();
                break;
         case R.id.btn_4:
                Toast.makeText(getApplicationContext(),"This button will launch make your app material",Toast.LENGTH_LONG).show();
                break;
         case R.id.btn_5:
                Toast.makeText(getApplicationContext(),"This button will launch go ubiqutous",Toast.LENGTH_LONG).show();
                break;
         case R.id.btn_6:
                Toast.makeText(getApplicationContext(),"This button will launch capstone",Toast.LENGTH_LONG).show();
                break;

        }

    }
}
