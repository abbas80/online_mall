package com.example.mall;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class my_cart_Fragment extends Fragment {

private RecyclerView mycartrecyclerView;
private TextView checkoutprice;
private Button place_order;
    public my_cart_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_my_cart_,container,false);
        mycartrecyclerView=view.findViewById(R.id.recyclerView_mycart);
        checkoutprice=view.findViewById(R.id.checkout_total);
        place_order=view.findViewById(R.id.placeorder_btn);


        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mycartrecyclerView.setLayoutManager(linearLayoutManager);

        List<my_cart_model> my_cart_modelList=new ArrayList<>();
        my_cart_modelList.add(new my_cart_model(0,R.drawable.mi_a,"MI a1 (BLACK) 64GB","2","RS-14999/-","RS-11999/-",1,1,2));

        my_cart_modelList.add(new my_cart_model(0,R.drawable.mi_a,"MI a1 (BLACK) 64GB","1","RS-14999/-","RS-11999/-",1,0,1));

        my_cart_modelList.add(new my_cart_model(0,R.drawable.mi_a,"MI a1 (BLACK) 64GB","0","RS-14999/-","RS-11999/-",1,2,0));

        my_cart_modelList.add(new my_cart_model(1,3,"Free","RS-35997/-","RS-9000/-"));

       my_cart_Adapter adapter=new my_cart_Adapter(my_cart_modelList);
        checkoutprice.setText("RS-35997/-");
        mycartrecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
       return view;
    }
}
