package com.example.mall;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.List;

public class product_detail_activity extends AppCompatActivity {
    private ViewPager productImagepager;
    private TabLayout ViewpagerIndicator;

    private ViewPager product_detail_Viewpager;
    private TabLayout product_detail_tablayout;


    private FloatingActionButton add_to_wishlist_btn;
    private static boolean already_added_to_wishlist=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowCustomEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        add_to_wishlist_btn=findViewById(R.id.add_to_wishlist);
        productImagepager=findViewById(R.id.product_images_viewpager);
        ViewpagerIndicator=findViewById(R.id.view_pagerIndicator);


        product_detail_Viewpager=findViewById(R.id.discription_layout_pager);
        product_detail_tablayout=findViewById(R.id.product_detail_discription_tablayout);

        product_detail_Viewpager.setAdapter(new discription_product_adaptor(getSupportFragmentManager(),product_detail_tablayout.getTabCount()));

        product_detail_Viewpager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(product_detail_tablayout));
        product_detail_tablayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                product_detail_Viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        List<Integer> productImages=new ArrayList<>();
        productImages.add(R.drawable.mi_a);
        productImages.add(R.drawable.shopping);
        productImages.add(R.drawable.ic_menu_share);

        product_images_adapter p_i_adapter=new product_images_adapter(productImages);

        productImagepager.setAdapter(p_i_adapter);
        ViewpagerIndicator.setupWithViewPager(productImagepager,true);
        add_to_wishlist_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(already_added_to_wishlist==true)
                {
                    already_added_to_wishlist=false;
                    add_to_wishlist_btn.setSupportImageTintList(ColorStateList.valueOf(Color.parseColor("#979797")));
                }
                else
                {
                    already_added_to_wishlist=true;
                    add_to_wishlist_btn.setSupportImageTintList(getResources().getColorStateList(R.color.colorPrimary));
                }

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_and_cart,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id==android.R.id.home)
        {
            finish();
            return true;
        }
        else if (id == R.id.action_search) {
            return true;
        }

        else if (id == R.id.action_cart) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
