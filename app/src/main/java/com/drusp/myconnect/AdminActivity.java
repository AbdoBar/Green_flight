package com.drusp.myconnect;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.adedom.library.Dru;
import com.adedom.library.ExecuteQuery;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminActivity extends AppCompatActivity {

    private Button mBtSelect;
    private Button mBtInsert;
    private Button mBtUpdate;
    private Button mBtDelete;
    private Button mBtRvAndGlide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);


        //status bar color
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(AdminActivity.this,R.color.white));
        }

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
                startActivity(new Intent(getBaseContext(), UpdateActivity.class));
            }
        });

        mBtDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), DeleteActivity.class));
                // startActivity(new Intent(getBaseContext(), Menu_Activity.class));
            }
        });

        mBtRvAndGlide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), RecyclerViewAndGlideActivity.class));
            }
        });
    }
}