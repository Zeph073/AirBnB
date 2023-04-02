package com.example.ho_tel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FindRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_room);
        CardView exit = findViewById(R.id.cardFDBack);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindRoomActivity.this, HomeActivity.class));
            }
        });

        CardView SingleRoom = findViewById(R.id.cardFDSingleRoom);
        SingleRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindRoomActivity.this, RoomDetailsActivity.class);
                it.putExtra("title", "Single Room");
                startActivity(it);
            }
        });

        CardView LivingRoom = findViewById(R.id.cardFDLivingRoom);
        LivingRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindRoomActivity.this, RoomDetailsActivity.class);
                it.putExtra("title", "Living Room");
                startActivity(it);
            }
        });

        CardView SinglePacking = findViewById(R.id.cardFDSingleParking);
        SinglePacking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindRoomActivity.this, RoomDetailsActivity.class);
                it.putExtra("title", "Single Room + Packing");
                startActivity(it);
            }
        });

        CardView LivingRoomPacking = findViewById(R.id.cardFDLivingRoomParking);
        LivingRoomPacking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindRoomActivity.this, RoomDetailsActivity.class);
                it.putExtra("title", "Living Room + Packing");
                startActivity(it);
            }
        });

        CardView CustomerCare = findViewById(R.id.cardFDCustomerCare);
        CustomerCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindRoomActivity.this, CustomerCareActivity.class);
                it.putExtra("title", "Customer Care");
                startActivity(it);
            }
        });

        CardView BookDetails = findViewById(R.id.cardFDOrderDetails);
        BookDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindRoomActivity.this, BookDetailsActivity.class));
            }
        });

        CardView GoogleMaps = findViewById(R.id.cardFDGoogleMaps);
        GoogleMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindRoomActivity.this, GoogleMapsActivity.class);
                it.putExtra("title", "Google Maps");
                startActivity(it);
            }
        });

        TextView RateUs = findViewById(R.id.titleRateUs);
        RateUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindRoomActivity.this, RateUSActivity.class);
                it.putExtra("title", "Rate Services");
                startActivity(it);
            }
        });


    }
}