package com.example.mall;

import android.support.v7.widget.RecyclerView;

public class my_order_model  {
    int product_icon;
    String Product_title;
    String delivered_date;
    String rating;

    public my_order_model(int product_icon, String product_title, String delivered_date, String rating) {
        this.product_icon = product_icon;
        Product_title = product_title;
        this.delivered_date = delivered_date;
        this.rating = rating;
    }

    public int getProduct_icon() {
        return product_icon;
    }

    public void setProduct_icon(int product_icon) {
        this.product_icon = product_icon;
    }

    public String getProduct_title() {
        return Product_title;
    }

    public void setProduct_title(String product_title) {
        Product_title = product_title;
    }

    public String getDelivered_date() {
        return delivered_date;
    }

    public void setDelivered_date(String delivered_date) {
        this.delivered_date = delivered_date;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
