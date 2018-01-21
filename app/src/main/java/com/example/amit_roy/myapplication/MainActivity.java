package com.example.amit_roy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mylibrary.showdata;
public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.text1);
    }

    public void showdata(View v)
    {
        showdata obj = new showdata();
        obj.setdata("PrashantK");
        String str = obj.getdata();
        textView.setText(str);
    }


}
