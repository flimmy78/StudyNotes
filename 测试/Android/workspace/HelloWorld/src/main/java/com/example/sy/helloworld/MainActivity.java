package com.example.sy.helloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		textView = (TextView)findViewById(R.id.textView);
       	textView.setBackgroundColor(Color.BLUE);
        textView.setText("哈哈哈");
    }
}
