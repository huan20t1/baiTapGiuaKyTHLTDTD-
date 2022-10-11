package com.example.baitapgiuaky;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<ThuVien> arraylist;

    public Adapter(Context context, int layout, List<ThuVien> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }
    public int getCount(){return arraylist.size();}

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view  = inflater.inflate(layout,null);
        ThuVien thuVien = arraylist.get(i);

        TextView textView1 = view.findViewById(R.id.txtmethod);
        TextView textView2 = view.findViewById(R.id.txtname);
        TextView textView3 = view.findViewById(R.id.txtmoney);
        ImageView imageView = view.findViewById(R.id.imgavt);

        textView1.setText(thuVien.getMethod());
        textView2.setText(thuVien.getName());
        textView3.setText(thuVien.getMoney());
        imageView.setImageResource(thuVien.getHinh());
        return view;
    }
}
