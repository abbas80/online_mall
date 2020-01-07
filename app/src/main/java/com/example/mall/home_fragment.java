package com.example.mall;


import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class home_fragment extends Fragment {

    private RecyclerView categoryRecyclerView;
    private category_adapter category_adapter;

    //
    private ViewPager banner_slider_viewpager;
    private List<slider_model> slider_modelList;
    private int currentPager=2;
    private Timer timer;
    //
    //
    private ImageView ad_icon;
    private ConstraintLayout ad_constraint_layout;
    //
    ///horizontal
    private RecyclerView horizantal_productView;
    private horizontal_recycler_adapter horizontal_recycler_adapter;
    // /horizontal


    ///gridview
    private GridView product_gridView;
    ///
    public home_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home_fragment2, container, false);
         //ad banner
       /* ad_icon=view.findViewById(R.id.ad_icon);
        ad_constraint_layout=view.findViewById(R.id.ad_constraint);
        *///ad banner
            categoryRecyclerView=view.findViewById(R.id.categoryRecylerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(linearLayoutManager.HORIZONTAL);
        categoryRecyclerView.setLayoutManager(linearLayoutManager);

       List<category_model> category_models=new ArrayList<category_model>();
        category_models.add(new category_model("link","Home"));
        category_models.add(new category_model("link","Electronic"));
        category_models.add(new category_model("link","Fashion"));
        category_models.add(new category_model("link","Furniture"));
        category_models.add(new category_model("link","Toys"));
        category_models.add(new category_model("link","Wall Art"));
        category_models.add(new category_model("link","Sports"));
        category_models.add(new category_model("link","Books"));
        category_models.add(new category_model("link","Shoes"));

        category_adapter=new category_adapter(category_models);

        categoryRecyclerView.setAdapter(category_adapter);
        category_adapter.notifyDataSetChanged();
        ///
//        banner_slider_viewpager=view.findViewById(R.id.banner_slider_viewpager);

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
      //  horizantal_productView.setAdapter(horizontal_recycler_adapter);
        ///horizontal

        ///////grid view/*
       /* TextView gridlayout_title=view.findViewById(R.id.Items);
        Button viewAll_gridView=view.findViewById(R.id.grid_view_viewall);
        grid_view_adapter grid_view_adapter=new grid_view_adapter(horizontal_items_models);
        product_gridView=view.findViewById(R.id.product_gridview);
        product_gridView.setAdapter(grid_view_adapter);
        *//////*/

        /////////test
        RecyclerView home_RecyclerView=view.findViewById(R.id.home_RecyclerView);
        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(getActivity());
        linearLayoutManager2.setOrientation(LinearLayoutManager.VERTICAL);
        home_RecyclerView.setLayoutManager(linearLayoutManager2);

        List<home_page_model> items=new ArrayList<home_page_model>();

        items.add(new home_page_model(1,R.drawable.logo,"#000000"));
        items.add(new home_page_model(0,slider_modelList,0));

        //items.add(new home_page_model(0,slider_modelList,0));
        //items.add(new home_page_model(1,R.drawable.ic_menu_gallery,"#FFFFFF"));
        items.add(new home_page_model(2,"items",horizontal_items_models));

        items.add(new home_page_model(3,horizontal_items_models,"Deals of the day"));


        home_page_Adapter adapter=new home_page_Adapter(items);
        home_RecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        /////////
        return view;
    }
   /* public void pagerloop()
    {
        if (currentPager==slider_modelList.size()-2) {
            currentPager=2;
            banner_slider_viewpager.setCurrentItem(currentPager,false);
        }
        if(currentPager==1)
        {
            currentPager=slider_modelList.size()-3;
            banner_slider_viewpager.setCurrentItem(currentPager,false);
        }
    }
    public void startbannerslide()
    {
         final Handler handler=new Handler();
         final Runnable update=new Runnable() {
            @Override
            public void run() {
                if(currentPager>=slider_modelList.size())
                {
                    currentPager=1;
                }
                banner_slider_viewpager.setCurrentItem(currentPager++,true);
            }
        };
        timer= new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(update);
            }
        },3000,3000);
    }
    public void stopbannerslide()
    {
        timer.cancel();
    }*/
}
