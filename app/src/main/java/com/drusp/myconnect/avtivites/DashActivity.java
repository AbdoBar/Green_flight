package com.drusp.myconnect.avtivites;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.drusp.myconnect.R;
public class DashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imgNature = findViewById(R.id.img_nature);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})ImageView imgVr = findViewById(R.id.img_vr);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})ImageView imgGmae = findViewById(R.id.img_game);
        ImageView imgMenu = findViewById(R.id.img_menu);
        ImageView imgChat = findViewById(R.id.img_chat);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})ImageView imgTravel = findViewById(R.id.img_travel);

        imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your action for generalButton2 here
                // For example:
                 Intent intent = new Intent(DashActivity.this, Menu_Activity.class);
                 startActivity(intent);
            }
        });

        imgChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your action
                Intent intent = new Intent(DashActivity.this, ChatActivity.class);
                startActivity(intent);
            }
        });

        imgTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashActivity.this, TravelActivity.class);
                startActivity(intent);
            }
        });

        imgGmae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashActivity.this, ExtActivity.class);
                startActivity(intent);
            }
        });

        imgNature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your action for imgChat here
                Intent intent = new Intent(DashActivity.this, Green_Activity.class);
                startActivity(intent);
            }
        });

        imgVr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your action for generalButton7 here
                Intent intent = new Intent(DashActivity.this, Vr_Activity.class);
                startActivity(intent);
            }
        });
    }
}
