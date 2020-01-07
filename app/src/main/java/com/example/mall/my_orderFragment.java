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
public class my_orderFragment extends Fragment {


    public my_orderFragment() {
        // Required empty public constructor
    }
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_my_order, container, false);

        recyclerView=view.findViewById(R.id.my_order_recyclerView);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);


        List<my_order_model> my_order_modelList=new ArrayList<>();

        my_order_modelList.add(new my_order_model(R.drawable.shopping,"Mi A1 (64GB)Black","Delivered on Monday,15 jan 2017",""));

        my_order_modelList.add(new my_order_model(R.drawable.shopping,"Mi A1 (64GB)Black","Delivered on Monday,15 jan 2017",""));

        my_order_modelList.add(new my_order_model(R.drawable.mi_a,"Mi 4A (32GB)white","Delivered on Monday,22 jan 2018",""));
        my_order_adapter adapter=new my_order_adapter(my_order_modelList);
        recyclerView.setAdapter(adapter);
        return view;
    }

}
