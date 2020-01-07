package com.example.mall;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class discription_product_adaptor extends FragmentPagerAdapter {

    private int totalTable;

    public discription_product_adaptor(FragmentManager fm, int totalTable) {
        super(fm);
        this.totalTable = totalTable;
    }

    @Override
    public Fragment getItem(int i) {
       switch (i)
       {
           case 0:
            return new product_discriptionFragment();
           case 1:
               return new product_specificationFragment();
               case 2:
                   return new product_discriptionFragment();

               default:
                   return null;
       }
    }

    @Override
    public int getCount() {
        return totalTable;
    }
}
