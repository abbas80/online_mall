package com.example.mall;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class category_adapter extends RecyclerView.Adapter<category_adapter.ViewHolder> {
    private List<category_model> category_models;

    public category_adapter(List<category_model> category_models) {
        this.category_models = category_models;
    }

    @NonNull
    @Override
    public category_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.categor_item,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull category_adapter.ViewHolder viewHolder, int i) {
        String icon=category_models.get(i).getCategoryiconlink();
        String name=category_models.get(i).getCategoryname();

        viewHolder.setIcon(name,i);
    }

    @Override
    public int getItemCount() {
        return category_models.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView iconlink;
        private TextView iconname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iconlink=itemView.findViewById(R.id.iconlink);
            iconname=itemView.findViewById(R.id.iconname);
        }
        public void setIconlink()
        {
            //set by link;
        }
        private void setIcon(final String name, final int position)
        {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(position!=0)
                    {
                        Intent intent=new Intent(itemView.getContext(),categoryActivity.class);
                        intent.putExtra("categoryName",name);
                        itemView.getContext().startActivity(intent);
                    }
                }
            });
            iconname.setText(name);
        }
    }
}
