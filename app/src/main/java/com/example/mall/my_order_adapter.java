package com.example.mall;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class my_order_adapter extends RecyclerView.Adapter<my_order_adapter.viewHolder> {
    List<my_order_model> my_order_modelList;

    public my_order_adapter(List<my_order_model> my_order_modelList) {
        this.my_order_modelList = my_order_modelList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_order_itemm_layout,viewGroup,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        ((viewHolder)viewHolder).setdata(my_order_modelList.get(i).product_icon,my_order_modelList.get(i).getProduct_title(),my_order_modelList.get(i).getDelivered_date());
    }


    @Override
    public int getItemCount() {
        return my_order_modelList.size();
    }
    public class viewHolder extends RecyclerView.ViewHolder {
        private TextView product_title,delivery_date;
        private ImageView product_icon;
        private RatingBar ratingBar;
        public viewHolder(@NonNull final View itemView) {
            super(itemView);
            product_title=itemView.findViewById(R.id.product_title_order);
            product_icon=itemView.findViewById(R.id.product_icon_order);

            ratingBar=itemView.findViewById(R.id.ratingBar_order);
            delivery_date=itemView.findViewById(R.id.order_delivered_date);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(itemView.getContext(),order_detail_activity.class);
                    itemView.getContext().startActivity(i);
                }
            });
        }
        public void setdata(int r,String title,String delivery)
        {
            product_icon.setImageResource(r);
            product_title.setText(title);
            delivery_date.setText(delivery);
        }
    }
}
