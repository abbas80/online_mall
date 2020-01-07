package com.example.mall;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Wishlist_adapter extends RecyclerView.Adapter<Wishlist_adapter.ViewHolder> {
    private List<wishlist_item_model> wishlist_item_modelList;

    public Wishlist_adapter(List<wishlist_item_model> wishlist_item_modelList) {
        this.wishlist_item_modelList = wishlist_item_modelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wishlist_item_layout,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ( (ViewHolder)viewHolder).setdata(wishlist_item_modelList.get(i).getProduct_icon(),wishlist_item_modelList.get(i).getProduct_title(),wishlist_item_modelList.get(i).getFree_coupons(),wishlist_item_modelList.get(i).getAvg_rating(),wishlist_item_modelList.get(i).getTotal_rating(),wishlist_item_modelList.get(i).getPrice(),wishlist_item_modelList.get(i).getCutted_price());

    }

    @Override
    public int getItemCount() {
        return wishlist_item_modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView product_image;
        private TextView product_title,free_coupons,rating_avg,total_ratings,price,cutted_price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            product_image=itemView.findViewById(R.id.product_image_wishlist);
            product_title=itemView.findViewById(R.id.wishlist_title);
            free_coupons=itemView.findViewById(R.id.free_coupons_wishlist);
            rating_avg=itemView.findViewById(R.id.rating_wishlist);
            total_ratings=itemView.findViewById(R.id.total_ratings_wishlist);
            price=itemView.findViewById(R.id.price_wishlist);
            cutted_price=itemView.findViewById(R.id.cutted_price_wishlist);
        }
        public void setdata(int product_image_data,String product_title_data,String free_coupons__data,String rating_avg_data,String total_ratings_data,String price_data,String cutted_price_data)
        {
         product_image.setImageResource(product_image_data);
         product_title.setText(product_title_data);
         free_coupons.setText(free_coupons__data);
         rating_avg.setText(rating_avg_data);
         total_ratings.setText(total_ratings_data);
         price.setText(price_data);
         cutted_price.setText(cutted_price_data);
        }
    }
}
