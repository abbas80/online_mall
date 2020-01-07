package com.example.mall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class categoryActivity extends AppCompatActivity {
    private RecyclerView category_RecyclerView;
    private List<slider_model> slider_modelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar_cat);
        setSupportActionBar(toolbar);
        String title=getIntent().getStringExtra("categoryName");
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowCustomEnabled(true);

        category_RecyclerView=findViewById(R.id.category_recyclerView);

        slider_modelList=new ArrayList<slider_model>();

        slider_modelList.add(new slider_model(R.drawable.ic_add_alert_black_24dp));
        slider_modelList.add(new slider_model(R.drawable.ic_close_black_24dp));


        slider_modelList.add(new slider_model(R.drawable.ic_home_black_24dp));
        slider_modelList.add(new slider_model(R.drawable.ic_card_giftcard_black_24dp));
        slider_modelList.add(new slider_model(R.drawable.logo));
        slider_modelList.add(new slider_model(R.drawable.ic_menu_gallery));
        slider_modelList.add(new slider_model(R.drawable.ic_add_alert_black_24dp));
        slider_modelList.add(new slider_model(R.drawable.ic_close_black_24dp));



        slider_modelList.add(new slider_model(R.drawable.ic_home_black_24dp));
        slider_modelList.add(new slider_model(R.drawable.ic_menu_share));


  /*      slider_adapter slider_Adapter=new slider_adapter(slider_modelList);
        banner_slider_viewpager.setAdapter(slider_Adapter);
        banner_slider_viewpager.setAdapter(slider_Adapter);
        banner_slider_viewpager.setClipToPadding(false);
        banner_slider_viewpager.setPageMargin(20);
        banner_slider_viewpager.setCurrentItem(currentPager);
        ViewPager.OnPageChangeListener onPageChangeListener=new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                currentPager=i;
            }

            @Override
            public void onPageScrollStateChanged(int i) {
                if(i==ViewPager.SCROLL_STATE_IDLE)
                {
                    pagerloop();
                }
            }
        };


        banner_slider_viewpager.addOnPageChangeListener(onPageChangeListener);
        startbannerslide();
        banner_slider_viewpager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                pagerloop();
                stopbannerslide();
                if(event.getAction()==MotionEvent.ACTION_UP)
                {
                    startbannerslide();
                }
                return false;
            }
        });
        ///
        //ad banner
        ad_icon.setImageResource(R.drawable.logo);
        ad_constraint_layout.setBackgroundColor(Color.rgb(255,255,255));
        //ad banner

        ///horizontal
       TextView ViewAll=view.findViewById(R.id.deals_of__day);
       Button viewAll=view.findViewById(R.id.horizontal_recylerView_viewall);
        horizantal_productView=view.findViewById(R.id.horizontal_recycler_view);
        LinearLayoutManager linearLayoutManager1=new LinearLayoutManager(getActivity());
        linearLayoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        horizantal_productView.setLayoutManager(linearLayoutManager1);*/

        List<horizontal_items_model> horizontal_items_models=new ArrayList<>();

        horizontal_items_models.add(new horizontal_items_model(R.drawable.mi_a,"Mi Note 6 pro","SD 625 CPU","RS 11999/-"));
        horizontal_items_models.add(new horizontal_items_model(R.drawable.shopping,"One plus 6","SD 745 CPU","RS 31999/-"));
        horizontal_items_models.add(new horizontal_items_model(R.drawable.mi_a,"Mi Note 6 pro","SD 625 CPU","RS 11999/-"));
        horizontal_items_models.add(new horizontal_items_model(R.drawable.shopping,"One plus 6","SD 745 CPU","RS 31999/-"));
        horizontal_items_models.add(new horizontal_items_model(R.drawable.mi_a,"Mi Note 6 pro","SD 625 CPU","RS 11999/-"));

        horizontal_items_models.add(new horizontal_items_model(R.drawable.mi_a,"Mi Note 6 pro","SD 625 CPU","RS 11999/-"));
        horizontal_items_models.add(new horizontal_items_model(R.drawable.shopping,"One plus 6","SD 745 CPU","RS 31999/-"));
        horizontal_items_models.add(new horizontal_items_model(R.drawable.mi_a,"Mi Note 6 pro","SD 625 CPU","RS 11999/-"));
        horizontal_items_models.add(new horizontal_items_model(R.drawable.shopping,"One plus 6","SD 745 CPU","RS 31999/-"));
        horizontal_items_models.add(new horizontal_items_model(R.drawable.mi_a,"Mi Note 6 pro","SD 625 CPU","RS 11999/-"));




     //   horizontal_recycler_adapter=new horizontal_recycler_adapter(horizontal_items_models);
       // horizantal_productView.setAdapter(horizontal_recycler_adapter);
        ///horizontal

        ///////grid view/*
       /* TextView gridlayout_title=view.findViewById(R.id.Items);
        Button viewAll_gridView=view.findViewById(R.id.grid_view_viewall);
        grid_view_adapter grid_view_adapter=new grid_view_adapter(horizontal_items_models);
        product_gridView=view.findViewById(R.id.product_gridview);
        product_gridView.setAdapter(grid_view_adapter);
        *//////*/

        /////////test
      //  RecyclerView home_RecyclerView=view.findViewById(R.id.home_RecyclerView);
        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(this);
        linearLayoutManager2.setOrientation(LinearLayoutManager.VERTICAL);
        category_RecyclerView.setLayoutManager(linearLayoutManager2);

        List<home_page_model> items=new ArrayList<home_page_model>();

        items.add(new home_page_model(1,R.drawable.logo,"#000000"));
        items.add(new home_page_model(0,slider_modelList,0));

        //items.add(new home_page_model(0,slider_modelList,0));
        //items.add(new home_page_model(1,R.drawable.ic_menu_gallery,"#FFFFFF"));
        items.add(new home_page_model(2,"items",horizontal_items_models));

        items.add(new home_page_model(3,horizontal_items_models,"Deals of the day"));

        home_page_Adapter adapter=new home_page_Adapter(items);
        category_RecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_icon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            return true;
        }
        else if (id == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
