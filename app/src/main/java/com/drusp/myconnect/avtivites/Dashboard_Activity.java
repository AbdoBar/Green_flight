package com.drusp.myconnect.avtivites;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.drusp.myconnect.R;

public class Dashboard_Activity extends AppCompatActivity {

    ImageView IMG_menu,IMG_chat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        IMG_menu=(ImageView) findViewById(R.id.img_menu);
        IMG_chat=findViewById(R.id.img_chat);

        IMG_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Log.d("ButtonClicked", "Button clicked!"); // Add this line for debugging
//                Intent intent = new Intent(Dashboard_Activity.this, ChatActivity.class);
//                startActivity(intent);
            }
        });


        IMG_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), Menu_Activity.class));
            }
        });


    }


    public void start_chat(View view) {
        Log.d("ButtonClicked", "Button clicked!"); // Add this line for debugging
        Intent intent = new Intent(Dashboard_Activity.this, ChatActivity.class);
        startActivity(intent);
    }
}