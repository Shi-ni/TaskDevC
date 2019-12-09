package com.example.taskdevc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.VideoView;

public class addresource extends AppCompatActivity {

    private static final String VIDEO_SAMPLE = "video";
    private VideoView mVideoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addresource);

      /*  mVideoview = findViewById(R.id.videoView);

    }
    private Uri getMedia(String mediaName){
        return Uri.parse("android.resource://" + getPackageName() + "/raw/" + mediaName);

    }
    private void initializePlayer(){
        Uri videoUri = getMedia(VIDEO_SAMPLE);
        mVideoview.setVideoURI(videoUri);
        mVideoview.start();
    }
    private void releasePlayer(){
        mVideoview.stopPlayback();
    }
    @Override
    protected void onStart() {

        super.onStart();
        initializePlayer();
    }

    @Override
    protected void onStop() {

        super.onStop();

   releasePlayer();
    }
    @Override
    protected void onPause() {

        super.onPause();
        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.N){

            mVideoview.pause();
        }
    }*/
    }
}