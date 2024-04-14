package com.drusp.myconnect.avtivites;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.drusp.myconnect.R;

public class DashActivity extends AppCompatActivity {
    ImageView IMG_menu,IMG_chat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);


       // IMG_menu=(ImageView) findViewById(R.id.img_menu);
        //IMG_chat=findViewById(R.id.img_chat);
    }
}