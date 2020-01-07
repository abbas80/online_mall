package com.example.mall;

public class horizontal_items_model {
    private int icon;
    private String productname;

    private String productdescription;
    private String productprice;

    public horizontal_items_model(int icon, String productname, String productdescription, String productprice) {
        this.icon = icon;
        this.productname = productname;
        this.productdescription = productdescription;
        this.productprice = productprice;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public String getProductprice() {
        return productprice;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }
}
