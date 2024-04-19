package com.drusp.myconnect.avtivites;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.drusp.myconnect.AdminActivity;
import com.drusp.myconnect.R;
import com.drusp.myconnect.RecyclerViewAndGlideActivity;

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

        Button btnadmin = findViewById(R.id.admin_menu);
        btnadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashActivity.this, AdminActivity.class);
                startActivity(intent);
            }
        });



       /* if (ConnectDB.getConnection() == null) {
            Dru.failed(getBaseContext());

//            imgChat.setVisibility(View.INVISIBLE);
//            imgMenu.setVisibility(View.INVISIBLE);
//            imgTravel.setVisibility(View.INVISIBLE);
//            imgGmae.setVisibility(View.INVISIBLE);
//            imgNature.setVisibility(View.INVISIBLE);
//            imgVr.setVisibility(View.INVISIBLE);

        } else {
            Dru.completed(getBaseContext());
        }*/



        imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your action for generalButton2 here
                // For example:
                 Intent intent = new Intent(DashActivity.this, RecyclerViewAndGlideActivity.class);
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
//                Intent intent = new Intent(DashActivity.this, Green_Activity.class);
//                startActivity(intent);
                startActivity(new Intent(getBaseContext(), Green_Activity.class));
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
