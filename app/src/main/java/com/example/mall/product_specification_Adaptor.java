package com.example.mall;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class product_specification_Adaptor extends RecyclerView.Adapter<product_specification_Adaptor.ViewHolder> {
    private List<product_Specification_model> product_specification_models;

    public product_specification_Adaptor(List<product_Specification_model> product_specification_models) {
        this.product_specification_models = product_specification_models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        switch (i)
        {
            case product_Specification_model.Title_code:
                View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.specification_title_item_layout,viewGroup,false);
                return new ViewHolder(view);
            case product_Specification_model.spec_Code:
                View view1= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.specification_item_layout,viewGroup,false);
                return new ViewHolder(view1);
                default:
                    return null;
        }

    }

    @Override
    public int getItemViewType(int position) {
        switch (product_specification_models.get(position).getType())
        {
            case 0:
             return product_Specification_model.Title_code;

            case 1:
                return product_Specification_model.spec_Code;
            default:
                return -1;

        }
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        switch (product_specification_models.get(i).getType()) {
            case product_Specification_model.Title_code:
                String titl=product_specification_models.get(i).getTitle();
                viewHolder.setTitle(titl);
                break;

            case product_Specification_model.spec_Code:
                String featurename=product_specification_models.get(i).getFeature_name();
                String feature=product_specification_models.get(i).getFeature_Specification();
                viewHolder.setfeature(featurename,feature);
                    break;
            default:
                return;
        }
    }

    @Override
    public int getItemCount() {
        return product_specification_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView feature_name,feature;
        private TextView title_textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }


        public void setfeature(String feature_na,String feature_detail)
        {
            feature_name=itemView.findViewById(R.id.feature_name);
            feature=itemView.findViewById(R.id.feature);
            feature_name.setText(feature_na);
            feature.setText(feature_detail);
        }
        public void setTitle(String title)
        {
            title_textView=itemView.findViewById(R.id.Title_tv);
            title_textView.setText(title);
        }
    }
}
