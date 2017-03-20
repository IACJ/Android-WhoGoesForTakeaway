package com.example.whogoesfortakeaway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button3 =(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FailActivity.class);
                startActivity(intent);
            }
        });

        final int random = new Random().nextInt(4);
        Log.d(TAG, "onCreate: random:"+random);

        Button button1 =(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (random==0) {
                    Intent intent = new Intent(MainActivity.this,FailActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(MainActivity.this,surviveActivity.class);
                    intent.putExtra("extra_data",1);
                    startActivityForResult(intent,1);
                }

            }
        });
        Button button2 =(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (random==1) {
                    Intent intent = new Intent(MainActivity.this,FailActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(MainActivity.this,surviveActivity.class);
                    intent.putExtra("extra_data",2);
                    startActivityForResult(intent,2);
                }

            }
        });
        Button button4 =(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (random==2) {
                    Intent intent = new Intent(MainActivity.this,FailActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(MainActivity.this,surviveActivity.class);
                    intent.putExtra("extra_data",3);
                    startActivityForResult(intent,3);
                }

            }
        });
        Button button5 =(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (random==3) {
                    Intent intent = new Intent(MainActivity.this,FailActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(MainActivity.this,surviveActivity.class);
                    intent.putExtra("extra_data",4);
                    startActivityForResult(intent,4);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if (resultCode == RESULT_OK){
                    Log.d(TAG, "onActivityResult: result "+1);
                }
                break;
            case 2:
                if (resultCode == RESULT_OK){
                    Log.d(TAG, "onActivityResult: result "+2);
                }
                break;
            case 3:
                if (resultCode == RESULT_OK){
                    Log.d(TAG, "onActivityResult: result "+3);
                }
                break;
            case 4:
                if (resultCode == RESULT_OK){
                    Log.d(TAG, "onActivityResult: result "+4);
                }
                break;
            default:
        }
    }
}
