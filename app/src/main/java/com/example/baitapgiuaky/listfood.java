package com.example.baitapgiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class listfood extends AppCompatActivity {

    ListView listView;
    ArrayList<ThuVien> arrayList;
    Adapter adapter;
    ImageView imageback;
    Button btntransfer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listfood);
        getSupportActionBar().hide();

        btntransfer = findViewById(R.id.bttrasfer);

        arrayList = new ArrayList<>();
        ListView listView =(ListView)findViewById(R.id.list);
        arrayList.add(new ThuVien("An Nguyễn ","Transfer money","$2,967.6",R.drawable.friend));
        arrayList.add(new ThuVien("Thuận Diệu","Transfer money","$4,908",R.drawable.gihub));
        arrayList.add(new ThuVien("Hoài Anh","Received payment","$9,500",R.drawable.exchange));
        arrayList.add(new ThuVien("Thùy Dung","Transfer money","$785",R.drawable.history));
        arrayList.add(new ThuVien("Tiến Đạt","Transfer money","$4,908",R.drawable.payment));
        arrayList.add(new ThuVien("Anh Tuấn","Received payment","$4,908,07",R.drawable.trasaction));
        arrayList.add(new ThuVien("Văn Huấn","Transfer money","$9,908",R.drawable.profile));
        adapter = new Adapter(listfood.this, R.layout.item_listview, arrayList);
        listView.setAdapter(adapter);

        imageback = findViewById(R.id.imvback);

        imageback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(listfood.this,home.class);
                startActivity(i);
            }
        });

        btntransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Chức năng đang phát triển",Toast.LENGTH_LONG).show();
            }
        });
    }
}