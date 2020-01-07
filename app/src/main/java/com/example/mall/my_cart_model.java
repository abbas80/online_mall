package com.example.mall;

public class my_cart_model {
   public static final int cartItem=0;
   public static final int total_cart=1;

   private int type;
   /////cartitem
    private int icon;
    private String product_name;
    private String coupons;
    private String cutted_price;
    private String price;
    private int quantity;
    private int offeres;
    private int coupons_applied;

    public my_cart_model(int type, int icon, String product_name, String coupons, String cutted_price, String price, int quantity, int offeres, int coupons_applied) {
        this.type = type;
        this.icon = icon;
        this.product_name = product_name;
        this.coupons = coupons;
        this.cutted_price = cutted_price;
        this.price = price;
        this.quantity = quantity;
        this.offeres = offeres;
        this.coupons_applied = coupons_applied;
    }
    public static int getCartItem() {
        return cartItem;
    }

    public static int getTotal_cart() {
        return total_cart;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCoupons() {
        return coupons;
    }

    public void setCoupons(String coupons) {
        this.coupons = coupons;
    }

    public String getCutted_price() {
        return cutted_price;
    }

    public void setCutted_price(String cutted_price) {
        this.cutted_price = cutted_price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOfferes() {
        return offeres;
    }

    public void setOfferes(int offeres) {
        this.offeres = offeres;
    }

    public int getCoupons_applied() {
        return coupons_applied;
    }

    public void setCoupons_applied(int coupons_applied) {
        this.coupons_applied = coupons_applied;
    }

    ////total amount


    private int total_items;
    private String delivery_price;
    private String totalAmount;

    private String savedamt;

    public my_cart_model(int type, int total_items, String delivery_price, String ttotalAmount, String savedamt) {
        this.type = type;
        this.total_items = total_items;
        this.delivery_price = delivery_price;
        this.totalAmount = ttotalAmount;
        this.savedamt = savedamt;
    }

    public int getTotal_items() {
        return total_items;
    }

    public void setTotal_items(int total_items) {
        this.total_items = total_items;
    }

    public String getDelivery_price() {
        return delivery_price;
    }

    public void setDelivery_price(String delivery_price) {
        this.delivery_price = delivery_price;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSavedamt() {
        return savedamt;
    }

    public void setSavedamt(String savedamt) {
        this.savedamt = savedamt;
    }
    /////
}
