package com.example.whogoesfortakeaway;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail);
//        http://music.163.com/#/song?id=2866921
        Button button1 =(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://music.163.com/#/song?id=2866921"));
                startActivity(intent);
            }
        });
        Toast.makeText(FailActivity.this,"少侠敢作敢当！\n请以放歌助兴！",Toast.LENGTH_LONG).show();
    }
}
