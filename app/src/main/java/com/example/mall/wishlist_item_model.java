package com.example.mall;

public class wishlist_item_model {
    int product_icon;
    String product_title;
    String free_coupons;
    String avg_rating;
    String total_rating;
    String price;
    String cutted_price;

    public wishlist_item_model(int product_icon, String product_title, String free_coupons, String avg_rating, String total_rating, String price, String cutted_price) {
        this.product_icon = product_icon;
        this.product_title = product_title;
        this.free_coupons = free_coupons;
        this.avg_rating = avg_rating;
        this.total_rating = total_rating;
        this.price = price;
        this.cutted_price = cutted_price;
    }

    public int getProduct_icon() {
        return product_icon;
    }

    public void setProduct_icon(int product_icon) {
        this.product_icon = product_icon;
    }

    public String getProduct_title() {
        return product_title;
    }

    public void setProduct_title(String product_title) {
        this.product_title = product_title;
    }

    public String getFree_coupons() {
        return free_coupons;
    }

    public void setFree_coupons(String free_coupons) {
        this.free_coupons = free_coupons;
    }

    public String getAvg_rating() {
        return avg_rating;
    }

    public void setAvg_rating(String avg_rating) {
        this.avg_rating = avg_rating;
    }

    public String getTotal_rating() {
        return total_rating;
    }

    public void setTotal_rating(String total_rating) {
        this.total_rating = total_rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCutted_price() {
        return cutted_price;
    }

    public void setCutted_price(String cutted_price) {
        this.cutted_price = cutted_price;
    }
}
