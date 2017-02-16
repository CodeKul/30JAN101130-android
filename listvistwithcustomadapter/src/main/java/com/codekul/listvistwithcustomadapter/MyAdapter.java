package com.codekul.listvistwithcustomadapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aniruddha on 16/2/17.
 */

public class MyAdapter extends BaseAdapter{

    private final Context context;
    private final List<CustomItem> dataSet;
    private final LayoutInflater inflater;
    private OnCustomClickListener clickListener;

    public void setClickListener(OnCustomClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public MyAdapter(Context context, List<CustomItem> dataSet) {
        this.context = context;
        this.dataSet = dataSet;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public Object getItem(int position) {
        return dataSet.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position * 3;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = inflater.inflate(R.layout.cutom_item, parent, false );
        CustomItem item = dataSet.get(position);
        ((ImageView)view.findViewById(R.id.imgStngs)).setImageResource(item.img);
        ((TextView)view.findViewById(R.id.txtTtl)).setText(item.ttl);
        ((TextView)view.findViewById(R.id.txtInfo)).setText(item.info);

        //view.setOnClickListener(this::onViewClicked);
        return view;
    }

    private void onViewClicked(View view) {

    }
}
