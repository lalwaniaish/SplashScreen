package com.example.aishlalwani.finish;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout rel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Reemove ttile bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        rel = (RelativeLayout) findViewById(R.id.rel);
        rel.setBackgroundResource(R.drawable.a);
        final Handler handler = new Handler();
        final Runnable r = new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,homepage.class);
                startActivity(i);
            }
        };
        handler.postDelayed(r, 5000);
    }
}
