package com.example.recinfreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class OptionsActivity extends AppCompatActivity {
GridLayout maingird;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        Button butt1=(Button)findViewById(R.id.button);
        Button butt2=(Button)findViewById(R.id.button2);
        Button butt3=(Button)findViewById(R.id.button3);
        Button butt4=(Button)findViewById(R.id.button4);
        Button butt5=(Button)findViewById(R.id.button5);
        Button butt6=(Button)findViewById(R.id.button6);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(getApplicationContext(),PdfViewActivity.class);
                startActivity(int1);

            }
        });


        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2=new Intent(OptionsActivity.this,PdfHadisActicity.class);
                startActivity(int2);

            }
        });

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3=new Intent(OptionsActivity.this,CounterActivity.class);
                startActivity(int3);

            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4=new Intent(OptionsActivity.this,NamazActivity.class);
                startActivity(int4);

            }
        });



    }
}