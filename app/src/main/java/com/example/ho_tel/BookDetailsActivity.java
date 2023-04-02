package com.example.ho_tel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class BookDetailsActivity extends AppCompatActivity {

    Button btn;
    SimpleAdapter sa;
    ListView lst;
    ArrayList list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        btn = findViewById(R.id.buttonBDBack);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BookDetailsActivity.this, FindRoomActivity.class));
            }
        });
        Database db = new Database(getApplicationContext(),"Ho_tel😛",null,1);
        SharedPreferences sharedpreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedpreferences.getString("username","").toString();
        ArrayList dbData = db.getOrderData(username);


    }
}