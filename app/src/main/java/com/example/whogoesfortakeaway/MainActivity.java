package com.example.whogoesfortakeaway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Random r;
    private int random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button3 =(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FailActivity.class);
                startActivityForResult(intent,5);
            }
        });
        r = new Random();
        random = r.nextInt(4);
        Log.d(TAG, "onCreate: random:"+random);

        Button button1 =(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (random==0) {
                    Intent intent = new Intent(MainActivity.this,FailActivity.class);
                    startActivityForResult(intent,5);
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
                    startActivityForResult(intent,5);
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
                    startActivityForResult(intent,5);
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
                    startActivityForResult(intent,5);
                }else{
                    Intent intent = new Intent(MainActivity.this,surviveActivity.class);
                    intent.putExtra("extra_data",4);
                    startActivityForResult(intent,4);
                }
            }
        });

        Button button6 =(Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Button button1 = (Button)findViewById(R.id.button1);
                button1.setEnabled(true);
                Button button2 = (Button)findViewById(R.id.button2);
                button2.setEnabled(true);
                Button button3 = (Button)findViewById(R.id.button3);
                button3.setEnabled(true);
                Button button4 = (Button)findViewById(R.id.button4);
                button4.setEnabled(true);
                Button button5 = (Button)findViewById(R.id.button5);
                button5.setEnabled(true);
                random = r.nextInt(4);
                Log.d(TAG, "onCreate: random:"+random);
                Toast.makeText(MainActivity.this,"游戏已重新开始",Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                    Log.d(TAG, "onActivityResult: result "+1);
                    Button button1 = (Button)findViewById(R.id.button1);
                    button1.setEnabled(false);
                break;
            case 2:
                    Log.d(TAG, "onActivityResult: result "+2);
                    Button button2 = (Button)findViewById(R.id.button2);
                    button2.setEnabled(false);
                break;
            case 3:
                    Log.d(TAG, "onActivityResult: result "+3);
                    Button button4 = (Button)findViewById(R.id.button4);
                    button4.setEnabled(false);
                break;
            case 4:
                    Log.d(TAG, "onActivityResult: result "+4);
                    Button button5 = (Button)findViewById(R.id.button5);
                    button5.setEnabled(false);
                break;
            case 5: {
                Button buttonN = (Button) findViewById(R.id.button1);
                buttonN.setEnabled(false);
                buttonN = (Button) findViewById(R.id.button2);
                buttonN.setEnabled(false);
                buttonN = (Button) findViewById(R.id.button3);
                buttonN.setEnabled(false);
                buttonN = (Button) findViewById(R.id.button4);
                buttonN.setEnabled(false);
                buttonN = (Button) findViewById(R.id.button5);
                buttonN.setEnabled(false);
                Toast.makeText(MainActivity.this,"少侠为何回来了？",Toast.LENGTH_SHORT).show();
            }
            default:
        }
    }
}
