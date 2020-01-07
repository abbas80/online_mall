package com.example.mall;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class wishList_Fragment extends Fragment {


    public wishList_Fragment() {
        // Required empty public constructor
    }
    private RecyclerView wishlist_recycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_wish_list_, container, false);
        wishlist_recycler=view.findViewById(R.id.wishlist_recycler_view);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        wishlist_recycler.setLayoutManager(linearLayoutManager);

        List<wishlist_item_model> wishlist_item_modelList=new ArrayList<>();

        wishlist_item_modelList.add(new wishlist_item_model(R.drawable.shopping,"Mi A1 Black(64GB)","2 free coupons","4.5","27(rating)","RS-11999/-","RS-14999/-"));

        wishlist_item_modelList.add(new wishlist_item_model(R.drawable.shopping,"Mi A1 Black(64GB)","no free coupons","3.5","27(rating)","RS-11999/-","RS-14999/-"));

        wishlist_item_modelList.add(new wishlist_item_model(R.drawable.mi_a,"Mi 4A White(32GB)","1 free coupons","4.0","7(rating)","RS-11999/-","RS-14999/-"));

        wishlist_item_modelList.add(new wishlist_item_model(R.drawable.shopping,"Mi A1 Black(64GB)","3 free coupons","4.5","27(rating)","RS-11999/-","RS-14999/-"));
        Wishlist_adapter wishlist_adapter=new Wishlist_adapter(wishlist_item_modelList);
        wishlist_recycler.setAdapter(wishlist_adapter);
        return view;
    }

}
