package com.example.ladan.avoda4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);

    }

    public void count(View view) {
        i++;
        btn1.setText("This is click number: "+i);
        if(i%7==0 || i%10==7){
            btn1.setText("BOOM!");
        }

    }
}
