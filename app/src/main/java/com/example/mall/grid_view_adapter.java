package com.example.mall;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class grid_view_adapter extends BaseAdapter {
    List<horizontal_items_model> gridView_productList;

    public grid_view_adapter(List<horizontal_items_model> gridView_productList) {
        this.gridView_productList = gridView_productList;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView==null) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_recycler_item,null);
            view.setElevation(0);
            view.setBackgroundColor(Color.rgb(255,255,255));
            ImageView icon=view.findViewById(R.id.horizontal__image);
            TextView name=view.findViewById(R.id.horizontal__product);
            TextView description=view.findViewById(R.id.horizontal_product__discription);
            TextView price=view.findViewById(R.id.horizontal_product__price);

            icon.setImageResource(gridView_productList.get(position).getIcon());
            name.setText(gridView_productList.get(position).getProductname());
            description.setText(gridView_productList.get(position).getProductdescription());
            price.setText(gridView_productList.get(position).getProductprice());

        }
        else
        {
           view=convertView;
        }
        return view;
    }
}
