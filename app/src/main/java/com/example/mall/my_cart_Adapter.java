package com.example.mall;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class my_cart_Adapter extends RecyclerView.Adapter {

    private List<my_cart_model> my_cart_modelList;

   /* public my_cart_Adapter(List<my_cart_model> my_cart_modelList) {
        this.my_cart_modelList = my_cart_modelList;
    }

    @Override
    public int getItemViewType(int position) {
        switch (my_cart_modelList.get(position).getType()) {
            case 0:
                return my_cart_model.cartItem;
            case 1:
                return my_cart_model.total_cart;
            default:
                return -1;


        }


    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == my_cart_model.cartItem) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_cart_layout, viewGroup, false);
            return new viewHolder(view);
        } else {
            return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int icon = my_cart_modelList.get(i).getIcon();
        String productname = my_cart_modelList.get(i).getProduct_name();
        String coupons = my_cart_modelList.get(i).getCoupons();
        String cut = my_cart_modelList.get(i).getCutted_price();
        String price = my_cart_modelList.get(i).getPrice();
        int quantity = my_cart_modelList.get(i).getQuantity();
        int offer = my_cart_modelList.get(i).getOfferes();
        int copapplied = my_cart_modelList.get(i).getCoupons_applied();
        ((viewHolder) viewHolder).setAll(icon, productname, coupons, cut, price, quantity, offer, copapplied);
       /* String totalitems=""+my_cart_modelList.get(i).getTotal_items();
        String totalamt=my_cart_modelList.get(i).getTotalAmount();
        String del=my_cart_modelList.get(i).getDelivery_price();
        String save=my_cart_modelList.get(i).getSavedamt();
        //int t=(Integer.parseInt(my_cart_modelList.get(i).getDelivery_price()))+(Integer.parseInt(my_cart_modelList.get(i).getTotalAmount()));
        ((viewHolder) viewHolder).settotalitems(totalitems,totalamt,del,totalamt+del,save);*/



   /* @Override
    public int getItemCount() {
        return my_cart_modelList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private TextView product_title;
        private TextView freecoupons;
        private TextView cuttedprice;
        private TextView price;
        private TextView quantity;
        private TextView offerApplied;
        private TextView couponsApplied;
        private ImageView productIcon;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            productIcon = itemView.findViewById(R.id.product_icon_cart);
            product_title = itemView.findViewById(R.id.product_name_cart);
            freecoupons = itemView.findViewById(R.id.no_of_coupons_cart);
            cuttedprice = itemView.findViewById(R.id.cutted_price_cart);
            price = itemView.findViewById(R.id.product_price_cart);
            quantity = itemView.findViewById(R.id.product_quantity_cart);
            offerApplied = itemView.findViewById(R.id.offers_applied_cart);
            couponsApplied = itemView.findViewById(R.id.couponsApplied_cart);


        }

        public void setAll(int productIcon_name, String product_titlename, String freecoupons_name, String cuttedprice_name, String price_name, int quantity_name, int offerApplied_name, int couponsApplied_name) {
            productIcon.setImageResource(productIcon_name);
            product_title.setText(product_titlename);
            freecoupons.setText(freecoupons_name);
            cuttedprice.setText(cuttedprice_name);
            price.setText(price_name);
            quantity.setText("" + quantity_name);
            offerApplied.setText(""+offerApplied_name);
            couponsApplied.setText(""+couponsApplied_name);

        }
    }
}*/
       /* private TextView totalitems;
        private TextView price;
        private TextView deliveryprice;
        private TextView totalamount;
        private TextView savedAmount;

        public viewHolder(@NonNull View itemView) {

            super(itemView);
            totalitems=itemView.findViewById(R.id.total_item_cart);
            price=itemView.findViewById(R.id.total_items_price_cart);
            deliveryprice=itemView.findViewById(R.id.delivery_price_cart);
            totalamount=itemView.findViewById(R.id.total_amount_cart);
            savedAmount=itemView.findViewById(R.id.saved_amount_cart);
        }
        public void settotalitems(String totalitems_name,String  price_name,String deliveryprice_name,String totalamount_name,String savedAmount_name)
        {
            totalitems.setText("Price ("+totalitems_name+")items");
            price.setText(price_name);
            deliveryprice.setText(deliveryprice_name);
            totalamount.setText(totalamount_name);
            savedAmount.setText(savedAmount_name);
        }
    }
    }*/
  public my_cart_Adapter(List<my_cart_model> my_cart_modelList) {
        this.my_cart_modelList = my_cart_modelList;
    }

    @Override
    public int getItemViewType(int position) {
        switch (my_cart_modelList.get(position).getType())
        {
            case 0:
                 return my_cart_model.cartItem;
            case 1:
                Log.i("getitemmmmm",""+000001000);

                return my_cart_model.total_cart;
                default:
                    return -1;
        }
       // return super.getItemViewType(position);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        switch (i)
        {
            case my_cart_model.cartItem:
                View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_cart_layout,viewGroup,false);
                return new cartItemViewHolder(view);
            case my_cart_model.total_cart:
                View totalview= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cart_total_amount_layout,viewGroup,false);
                return new cartTotalViewHolder(totalview);


        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        switch (my_cart_modelList.get(i).getType())
        {
            case my_cart_model.cartItem:
                int icon=my_cart_modelList.get(i).getIcon();
                String productname=my_cart_modelList.get(i).getProduct_name();
                String coupons=my_cart_modelList.get(i).getCoupons();
                String cut=my_cart_modelList.get(i).getCutted_price();
                String price=my_cart_modelList.get(i).getPrice();
                int quantity=my_cart_modelList.get(i).getQuantity();
                int offer=my_cart_modelList.get(i).getOfferes();
                int copapplied=my_cart_modelList.get(i).getCoupons_applied();
               ((cartItemViewHolder)viewHolder).setAll(icon,productname,coupons,cut,price,quantity,offer,copapplied);
                break;
            case my_cart_model.total_cart:
                //int t=(Integer.parseInt(my_cart_modelList.get(i).getDelivery_price()))+(Integer.parseInt(my_cart_modelList.get(i).getTotalAmount()));
               // ((cartTotalViewHolder)viewHolder).settotalitems(my_cart_modelList.get(i).getTotal_items()+"",my_cart_modelList.get(i).getTotalAmount(),my_cart_modelList.get(i).getDelivery_price(),"",my_cart_modelList.get(i).getSavedamt());
                String totalitems=""+my_cart_modelList.get(i).getTotal_items();
                String totalamt=my_cart_modelList.get(i).getTotalAmount();
                String del=my_cart_modelList.get(i).getDelivery_price();
                String save=my_cart_modelList.get(i).getSavedamt();
                //int t=(Integer.parseInt(my_cart_modelList.get(i).getDelivery_price()))+(Integer.parseInt(my_cart_modelList.get(i).getTotalAmount()));
                ((cartTotalViewHolder) viewHolder).settotalitems(totalitems,totalamt,del,totalamt+del+"j",save);
                break;
                default:
                    return;
        }

    }

    @Override
    public int getItemCount() {
        return my_cart_modelList.size();
    }
    public class cartItemViewHolder extends RecyclerView.ViewHolder
    {
        private TextView product_title,freecoupons,cuttedprice,price,quantity,offerApplied,couponsApplied;
        private ImageView productIcon;
        public cartItemViewHolder(@NonNull View itemView) {
            super(itemView);
            productIcon=itemView.findViewById(R.id.product_icon_cart);
            product_title=itemView.findViewById(R.id.product_name_cart);
            freecoupons=itemView.findViewById(R.id.no_of_coupons_cart);
            cuttedprice=itemView.findViewById(R.id.cutted_price_cart);
            price=itemView.findViewById(R.id.product_price_cart);
            quantity=itemView.findViewById(R.id.product_quantity_cart);
            offerApplied=itemView.findViewById(R.id.offers_applied_cart);
            couponsApplied=itemView.findViewById(R.id.couponsApplied_cart);


        }
        public void setAll(int productIcon_name,String product_titlename,String freecoupons_name,String cuttedprice_name,String price_name,int quantity_name,int offerApplied_name,int couponsApplied_name)
        {
            productIcon.setImageResource(productIcon_name);
            product_title.setText(product_titlename);

            freecoupons.setText(freecoupons_name+" coupon");
            cuttedprice.setText(cuttedprice_name);
            price.setText(price_name);
            quantity.setText("Qty"+quantity_name);

            offerApplied.setText(offerApplied_name+"offer");

            couponsApplied.setText(couponsApplied_name+"offer");
        }
    }
    public class cartTotalViewHolder extends RecyclerView.ViewHolder {
       private TextView totalitems;
       private TextView price;
       private TextView deliveryprice;
       private TextView totalamount;
       private TextView savedAmount;

       public cartTotalViewHolder(@NonNull View itemView) {
           super(itemView);
            totalitems=itemView.findViewById(R.id.total_item_cart);
            price=itemView.findViewById(R.id.total_items_price_cart);
            deliveryprice=itemView.findViewById(R.id.delivery_price_cart);
            totalamount=itemView.findViewById(R.id.total_amount_cart);
            savedAmount=itemView.findViewById(R.id.saved_amount_cart);
        }
        public void settotalitems(String totalitems_name,String  price_name,String deliveryprice_name,String totalamount_name,String savedAmount_name)
        {
            totalitems.setText("Price ("+totalitems_name+")items");
            price.setText(price_name);
            deliveryprice.setText(deliveryprice_name);
            totalamount.setText(totalamount_name);
            savedAmount.setText(savedAmount_name);
        }
       }
   }
