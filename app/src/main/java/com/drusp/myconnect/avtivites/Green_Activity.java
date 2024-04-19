package com.drusp.myconnect.avtivites;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.adedom.library.Dru;
import com.adedom.library.ExecuteUpdate;
import com.drusp.myconnect.ConnectDB;
import com.drusp.myconnect.R;

public class Green_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green);
        //status bar color
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(Green_Activity.this,R.color.AirGreen));
        }

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btngreen=findViewById(R.id.btn_Green);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText edtFreen=findViewById(R.id.Edt_green);
        btngreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String image = edtFreen.getText().toString().trim();

                String sql = "INSERT INTO `user`(`image`) VALUES ('"+image+"')";
                Dru.connection(ConnectDB.getConnection())
                        .execute(sql)
                        .commit(new ExecuteUpdate() {
                            @Override
                            public void onComplete() {
                                //todo insert success

                                //clear text
//                                mEtName.setText("");
//                                mEtImage.setText("");

                                Toast.makeText(getBaseContext(), "Insert success", Toast.LENGTH_SHORT).show();
                            }
                        });



            }
        });
    }
}