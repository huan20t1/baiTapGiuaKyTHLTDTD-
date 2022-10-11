package com.example.baitapgiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class home extends AppCompatActivity {

    ImageView imageprofile, imagepayment, imagehistory, imageexchange, imagecard,imagetrasation,imagefriend,imageaccount,imagebill;
    Button btnlogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imageprofile = findViewById(R.id.imgprofile);
        btnlogout = findViewById(R.id.btsignout);
        imagepayment = findViewById(R.id.imgpayment);
        imagehistory = findViewById(R.id.imghistory);
        imageexchange = findViewById(R.id.imgexchange);
        imagecard = findViewById(R.id.imgcard);
        imagetrasation = findViewById(R.id.imgtransaction);
        imagefriend = findViewById(R.id.imgfriend);
        imageaccount = findViewById(R.id.imgaccount);
        imagebill = findViewById(R.id.imgbill);


        imageprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(home.this, profile.class);
                startActivity(i);
            }
        });

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(home.this, MainActivity.class);
                startActivity(i);
            }
        });
        imagepayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Chức năng đang phát triển",Toast.LENGTH_LONG).show();
            }
        });
        imagehistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Chức năng đang phát triển",Toast.LENGTH_LONG).show();
            }
        });
        imageexchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Chức năng đang phát triển",Toast.LENGTH_LONG).show();
            }
        });
        imagecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Chức năng đang phát triển",Toast.LENGTH_LONG).show();
            }
        });
        imagetrasation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(home.this,listfood.class);
                startActivity(i);
            }
        });
        imagefriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Chức năng đang phát triển",Toast.LENGTH_LONG).show();
            }
        });
        imageaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Chức năng đang phát triển",Toast.LENGTH_LONG).show();
            }
        });
        imagebill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Chức năng đang phát triển",Toast.LENGTH_LONG).show();
            }
        });
    }
}