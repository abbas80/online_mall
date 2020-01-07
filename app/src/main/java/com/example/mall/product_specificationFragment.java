package com.example.mall;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


public class product_specificationFragment extends Fragment {
    private RecyclerView specification_recycler_View;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_product_specification,container,false);
        specification_recycler_View=view.findViewById(R.id.specification_recyclerView);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(view.getContext());
        linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);
        specification_recycler_View.setLayoutManager(linearLayoutManager);


        List<product_Specification_model> product_specification_models=new ArrayList<product_Specification_model>();
        product_specification_models.add(new product_Specification_model(0,"Storage"));
        product_specification_models.add(new product_Specification_model(1,"Ram","4 GB"));
        product_specification_models.add(new product_Specification_model(1,"processor","sd 670"));
        product_specification_models.add(new product_Specification_model(1,"Internal storage","64 GB"));


        product_specification_models.add(new product_Specification_model(0,"Battery"));
        product_specification_models.add(new product_Specification_model(1,"Battery","4000 mah"));

        product_specification_models.add(new product_Specification_model(0,"other"));
        product_specification_models.add(new product_Specification_model(1,"screen","6.3 inch"));
        product_specification_models.add(new product_Specification_model(1,"Camera","48 MP"));

        product_specification_Adaptor product_specification_adaptor=new product_specification_Adaptor(product_specification_models);

        specification_recycler_View.setAdapter(product_specification_adaptor);
        product_specification_adaptor.notifyDataSetChanged();

        return view ;
    }


}
