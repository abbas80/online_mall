package com.example.mall;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class slider_adapter extends PagerAdapter {
    List<slider_model> slider_modelList;

    public slider_adapter(List<slider_model> slider_modelList) {
        this.slider_modelList = slider_modelList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view= LayoutInflater.from(container.getContext()).inflate(R.layout.banner_layout,container,false);
        ImageView banner_image=view.findViewById(R.id.banner_slide);
        banner_image.setImageResource(slider_modelList.get(position).getSlide());
        container.addView(view,0);
        return view;
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

       // super.destroyItem(container, position, object);
        container.removeView((View) object);
    }
    @Override
    public int getCount() {
        return slider_modelList.size();
    }
}
