package com.drusp.myconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.adedom.library.Dru;
import com.adedom.library.ExecuteQuery;
import com.drusp.myconnect.avtivites.ChatActivity;
import com.drusp.myconnect.avtivites.DashActivity;
import com.drusp.myconnect.avtivites.Menu_Activity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {

    private Button mBtSelect;
    private Button mBtInsert;
    private Button mBtUpdate;
    private Button mBtDelete;
    private Button mBtRvAndGlide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        if (ConnectDB.getConnection() == null) {
//            Dru.failed(getBaseContext());
//        } else {
//            Dru.completed(getBaseContext());
//        }

        mBtSelect = (Button) findViewById(R.id.bt_select);
        mBtInsert = (Button) findViewById(R.id.bt_insert);
        mBtUpdate = (Button) findViewById(R.id.bt_update);
        mBtDelete = (Button) findViewById(R.id.bt_delete);
        mBtRvAndGlide = (Button) findViewById(R.id.bt_rv_and_glide);

        mBtSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo on click

                String sql = "SELECT * FROM user";
                Dru.connection(ConnectDB.getConnection())
                        .execute(sql)
                        .commit(new ExecuteQuery() {
                            @Override
                            public void onComplete(ResultSet resultSet) {
                                try {
                                    while (resultSet.next()) {
                                        //todo date loop row

                                        String name = resultSet.getString(2);
                                        Toast.makeText(getBaseContext(), name, Toast.LENGTH_LONG).show();

                                    }
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
            }
        });

        mBtInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), InsertActivity.class));
            }
        });

        mBtUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // startActivity(new Intent(getBaseContext(), ChatActivity.class));
                startActivity(new Intent(getBaseContext(), Menu_Activity.class));
            }
        });

        mBtDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), ChatActivity.class));
               // startActivity(new Intent(getBaseContext(), Menu_Activity.class));
            }
        });

        mBtRvAndGlide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), DashActivity.class));
            }
        });
    }
}
