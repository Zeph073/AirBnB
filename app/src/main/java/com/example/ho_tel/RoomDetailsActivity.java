package com.example.ho_tel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class RoomDetailsActivity extends AppCompatActivity {
    private String[][] RoomDetails1 = {
            {"Room Name: Victoria", "Room Number : 120", "Bed Size : 4 ", "Care Number : 0792744763", "100000"},
            {"Room Name: Turkana", "Room Number : 112", "Bed Size : 4 ", "Care Number : 0759595959", "250000"},
            {"Room Name: Baringo", "Room Number : 010", "Bed Size : 4 ", "Care Number : 0774839201", "110000"},
            {"Room Name: Bogoria", "Room Number : 110", "Bed Size : 4 ", "Care Number : 0738457690", "230000"},
            {"Room Name: Indian", "Room Number : 900", "Bed Size : 4 ", "Care Number : 0746578392", "549000"},
            {"Room Name: Elementaita", "Room Number : 776", "Bed Size : 4 ", "Care Number : 0776859403", "900000"},
            {"Room Name: Usot", "Room Number : 121", "Bed Size : 4 ", "Care Number : 0795877685", "870000"},
            {"Room Name: Nairobi", "Room Number : 345", "Bed Size : 4 ", "Care Number : 0785453426", "450000"},
            {"Room Name: Namibia", "Room Number :289", "Bed Size : 4 ", "Care Number : 0726475863", "50000"},
            {"Room Name: Florida", "Room Number : 101", "Bed Size : 4 ", "Care Number : 0700987583", "90000"},
    };

    private String[][] RoomDetails2 = {
            {"Room Name: Hp", "Room Number : 120", "Bed Size : 6", "Care Number : 0734758493", "10000"},
            {"Room Name: Acer", "Room Number : 120", "Bed Size : 6", "Care Number : 0712345675", "12000"},
            {"Room Name: Apple", "Room Number : 120", "Bed Size : 6", "Care Number : 0757684930", "13000"},
            {"Room Name: Lenovo", "Room Number : 120", "Bed Size : 6", "Care Number : 0728374833", "19000"},
            {"Room Name: MackBook", "Room Number : 120", "Bed Size : 6 ", "Care Number : 0792744763", "11000"},
            {"Room Name: Desktop", "Room Number : 120", "Bed Size : 6 ", "Care Number : 0792744763", "9000"},
            {"Room Name: Laptop", "Room Number : 120", "Bed Size : 6 ", "Care Number : 0792744763", "10000"},
            {"Room Name: Wifi", "Room Number : 120", "Bed Size : 6 ", "Care Number : 0792744763", "19000"},
            {"Room Name: Data", "Room Number : 120", "Bed Size : 6 ", "Care Number : 0792744763", "45000"},
            {"Room Name: Obuntu", "Room Number : 120", "Bed Size : 6 ", "Care Number : 0792744763", "100000"},
    };

    private String[][] RoomDetails3 = {
            {"Room Name: Victoria1", "Room Number : 120", "Bed Size : 1 ", "Care Number : 0792744763", "10000"},
            {"Room Name: Victoria2", "Room Number : 120", "Bed Size : 3 ", "Care Number : 0792744763", "1000"},
            {"Room Name: Victoria3", "Room Number : 120", "Bed Size : 5 ", "Care Number : 0792744763", "17000"},
            {"Room Name: Victoria4", "Room Number : 120", "Bed Size : 6 ", "Care Number : 0792744763", "109000"},
            {"Room Name: Victoria5", "Room Number : 120", "Bed Size : 9 ", "Care Number : 0792744763", "103000"},
            {"Room Name: Victoria6", "Room Number : 120", "Bed Size : 4 ", "Care Number : 0792744763", "102000"},
            {"Room Name: Victoria7", "Room Number : 120", "Bed Size : 3 ", "Care Number : 0792744763", "101000"},
            {"Room Name: Victoria8", "Room Number : 120", "Bed Size : 7 ", "Care Number : 0792744763", "109000"},
            {"Room Name: Victoria9", "Room Number : 120", "Bed Size : 4 ", "Care Number : 0792744763", "105000"},
            {"Room Name: Victoria10", "Room Number : 120", "Bed Size : 8 ", "Care Number : 0792744763", "103000"},
    };

    private String[][] RoomDetails4 = {
            {"Room Name: Chrome", "Room Number : 120", "Bed Size : 6 ", "Care Number : 0792744763", "4000"},
            {"Room Name: Fire Fox", "Room Number : 120", "Bed Size : 8 ", "Care Number : 0792744763", "900000"},
            {"Room Name: Opera Mini", "Room Number : 120", "Bed Size : 8 ", "Care Number : 0792744763", "10000"},
            {"Room Name: Avg", "Room Number : 120", "Bed Size : 9 ", "Care Number : 0792744763", "109000"},
            {"Room Name: Virus", "Room Number : 120", "Bed Size : 7 ", "Care Number : 0792744763", "107000"},
            {"Room Name: Cmd", "Room Number : 120", "Bed Size : 6 ", "Care Number : 0792744763", "105000"},
            {"Room Name: Linux", "Room Number : 120", "Bed Size : 8 ", "Care Number : 0792744763", "103000"},
            {"Room Name: Windows", "Room Number : 120", "Bed Size : 4 ", "Care Number : 0792744763", "104000"},
            {"Room Name: Avista", "Room Number : 120", "Bed Size : 3 ", "Care Number : 0792744763", "100000"},
            {"Room Name: Opim", "Room Number : 120", "Bed Size : 6 ", "Care Number : 0792744763", "105000"},
    };


    TextView tv;
    Button btn;
    String[][] room_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_details);

        tv = findViewById(R.id.textViewDDTitle);
        btn = findViewById(R.id.buttonDDBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("Single Room")==0)
            room_details = RoomDetails1;
        else
        if (title.compareTo("Living Room")==0)
            room_details = RoomDetails2;
        else
        if (title.compareTo("Single Room + Packing")==0)
            room_details = RoomDetails3;
        else
            room_details = RoomDetails4;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RoomDetailsActivity.this, FindRoomActivity.class));
            }
        });

        list = new ArrayList();
        for(int i=0;i<room_details.length;i++){
            item = new HashMap<String,String>();
            item.put("line1", room_details[i][0]);
            item.put("line2", room_details[i][1]);
            item.put("line3", room_details[i][2]);
            item.put("line4", room_details[i][3]);
            item.put("line5", "Charge Fees"+" "+room_details[i][4]+"/-");
            list.add(item);
        }
       sa = new SimpleAdapter(this,list,
            R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
             new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
     );
        ListView lst = findViewById(R.id.listViewDD);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(RoomDetailsActivity.this,BookRoomActivity.class);
                it.putExtra("text1",title);
                it.putExtra("text2",room_details[i][0]);
                it.putExtra("text3",room_details[i][1]);
                it.putExtra("text4",room_details[i][3]);
                it.putExtra("text5",room_details[i][4]);
                startActivity(it);
            }
        });


    }
}