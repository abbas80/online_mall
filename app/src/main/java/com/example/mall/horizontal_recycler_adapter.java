package com.example.mall;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class horizontal_recycler_adapter extends RecyclerView.Adapter<horizontal_recycler_adapter.ViewHolder> {
    private List<horizontal_items_model> horizontal_items_models;

    public horizontal_recycler_adapter(List<horizontal_items_model> horizontal_items_models) {
        this.horizontal_items_models = horizontal_items_models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.horizontal_recycler_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        int icon=horizontal_items_models.get(i).getIcon();
        String name=horizontal_items_models.get(i).getProductname();
        String description=horizontal_items_models.get(i).getProductdescription();
        String price=horizontal_items_models.get(i).getProductprice();
        viewHolder.setProduct_icon(icon);
        viewHolder.setProduct_name(name);
        viewHolder.setProduct_description(description);
        viewHolder.setProduct_price(price);
    }

    @Override
    public int getItemCount() {
        return horizontal_items_models.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView product_icon;
        private TextView product_name;
        private TextView product_description;
        private TextView product_price;


        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
           // product_icon=itemView.findViewById(R.id.horizontal_image);
            product_icon=itemView.findViewById(R.id.horizontal__image);
            product_name=itemView.findViewById(R.id.horizontal__product);
            product_description=itemView.findViewById(R.id.horizontal_product__discription);
            product_price=itemView.findViewById(R.id.horizontal_product__price);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent productViewActivity=new Intent(itemView.getContext(),product_detail_activity.class);
                    itemView.getContext().startActivity(productViewActivity);
                }
            });
        }
        public void setProduct_icon(int icon)
        {
            product_icon.setImageResource(icon);
        }
        public void setProduct_name(String name)
        {
            product_name.setText(name);
        }
        public void setProduct_description(String description)
        {
            product_description.setText(description);
        }
        public void setProduct_price(String price)
        {
            product_price.setText(price);
        }
    }
}
