
package com.example.taskdevc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private Button mbutton, nbutton, pbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbutton = findViewById(R.id.materialButton2);
        nbutton = findViewById(R.id.materialButton3);
        pbutton = findViewById(R.id.materialButton);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendtoaddcomment();
            }
        });

        nbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendtoaddlecture();
            }
        });

        pbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendtoaddresource();
            }
        });


    }

    private void sendtoaddresource() {
        Intent i = new Intent(MainActivity.this, addresource.class);
        startActivity(i);
    }

    private void sendtoaddlecture() {
        Intent j = new Intent(MainActivity.this, addlectures.class);
        startActivity(j);
    }

    private void sendtoaddcomment() {
        Intent k = new Intent(MainActivity.this, comments.class);
        startActivity(k);
    }

}
