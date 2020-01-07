package com.example.mall;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class product_images_adapter extends PagerAdapter {

    private List<Integer> productImage;

    public product_images_adapter(List<Integer> productImage) {
        this.productImage = productImage;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView productImageView=new ImageView(container.getContext());
        productImageView.setImageResource(productImage.get(position));
        container.addView(productImageView,0);
        return  productImageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }

    @Override
    public int getCount() {
        return productImage.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }
}
