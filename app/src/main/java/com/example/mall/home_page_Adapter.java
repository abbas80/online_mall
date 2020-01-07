package com.example.mall;

import android.graphics.Color;
import android.os.Handler;
import android.support.animation.DynamicAnimation;
import android.support.animation.FlingAnimation;
import android.support.annotation.NonNull;
//import android.support.v7.app.AlertController;
import android.support.constraint.ConstraintLayout;
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
import android.widget.Switch;
import android.widget.TextView;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class home_page_Adapter extends RecyclerView.Adapter {

    private List<home_page_model> home_page_modelList;

    public home_page_Adapter(List<home_page_model> home_page_modelList) {
        this.home_page_modelList = home_page_modelList;
    }

    @Override
    public int getItemViewType(int position) {

        switch (home_page_modelList.get(position).getType()) {
            case 0:
                return home_page_model.BannnerSlider;
            case 1:
                return home_page_model.StripadBannnerSlider;
            case 2:
                return home_page_model.HorizontalView;
            case 3:
                return home_page_model.GRIDView;
            default:
                return -1;
        }
        /*return super.getItemViewType(position);*/
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        switch (i) {
            case home_page_model.BannnerSlider:
                View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.banner_slider_layout, viewGroup, false);
                return new BannerSliderViewHolder(view);
            case home_page_model.StripadBannnerSlider:
                View adview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.slide_ad_layout, viewGroup, false);
                return new adbannerViewHolder(adview);
            case home_page_model.HorizontalView:
                View horizontalview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.horizontal_recyler_view, viewGroup, false);
                return new HorizontalViewHolder(horizontalview);
            case home_page_model.GRIDView:
                View Gridview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_gridview, viewGroup, false);
                return new GridViewViewHolder(Gridview);

            default:
                return null;

        }
        //return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        switch (home_page_modelList.get(i).getType()) {
            case home_page_model.BannnerSlider:
                List<slider_model> slider_modelList = home_page_modelList.get(i).getSlider_modelList();
                ((BannerSliderViewHolder) viewHolder).bannerSliderCode(slider_modelList);
                break;
            case home_page_model.StripadBannnerSlider:
                //List<slider_model> slider_modelList=home_page_modelList.get(i).getSlider_modelList();
                int resource = home_page_modelList.get(i).getResource();
                String background = home_page_modelList.get(i).getBackgroundcolor();
                ((adbannerViewHolder) viewHolder).setStripad(resource, background);
                break;
            case home_page_model.HorizontalView:
                String title=home_page_modelList.get(i).getTitle();
                List<horizontal_items_model> horizontal_items_model_list=home_page_modelList.get(i).getHorizontal_items_models();
                ((HorizontalViewHolder) viewHolder).sethorizontalView(horizontal_items_model_list,title);
                break;
            case home_page_model.GRIDView:
                String Gridtitle=home_page_modelList.get(i).getGRIDTitle();
                List<horizontal_items_model> Grid_list=home_page_modelList.get(i).getGridView_items_models();
                ((GridViewViewHolder) viewHolder).setGrid_View(Grid_list,Gridtitle);
                break;
            default:
                return;
        }
    }

    @Override
    public int getItemCount() {
        return home_page_modelList.size();
    }

    public class BannerSliderViewHolder extends RecyclerView.ViewHolder {
        private ViewPager banner_slider_viewpager;
        //private List<slider_model> slider_modelList;
        private int currentPager = 2;
        private Timer timer;

        public BannerSliderViewHolder(@NonNull View itemView) {
            super(itemView);
            banner_slider_viewpager = itemView.findViewById(R.id.banner_slider_viewpager);
            // bannerSliderCode(slider_modelList);
        }

        public void bannerSliderCode(final List<slider_model> slider_modelList) {
            slider_adapter slider_Adapter = new slider_adapter(slider_modelList);
            banner_slider_viewpager.setAdapter(slider_Adapter);
            banner_slider_viewpager.setAdapter(slider_Adapter);
            banner_slider_viewpager.setClipToPadding(false);
            banner_slider_viewpager.setPageMargin(20);
            banner_slider_viewpager.setCurrentItem(currentPager);
            banner_slider_viewpager.setPageTransformer(true,new ZoomOutPageTransformer());
            ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int i, float v, int i1) {

                }

                @Override
                public void onPageSelected(int i) {
                    currentPager = i;
                }

                @Override
                public void onPageScrollStateChanged(int i) {
                    if (i == ViewPager.SCROLL_STATE_IDLE) {
                        pagerloop(slider_modelList);
                    }
                }
            };


            banner_slider_viewpager.addOnPageChangeListener(onPageChangeListener);
            startbannerslide(slider_modelList);
            banner_slider_viewpager.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    pagerloop(slider_modelList);
                    stopbannerslide();
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        startbannerslide(slider_modelList);
                    }
                    return false;
                }
            });

        }

        public void pagerloop(List<slider_model> slider_modelList) {
            if (currentPager == slider_modelList.size() - 2) {
                currentPager = 2;
                banner_slider_viewpager.setCurrentItem(currentPager, false);
            }
            if (currentPager == 1) {
                currentPager = slider_modelList.size() - 3;
                banner_slider_viewpager.setCurrentItem(currentPager, false);
            }
        }

        public void startbannerslide(final List<slider_model> slider_modelList) {
            final Handler handler = new Handler();
            final Runnable update = new Runnable() {
                @Override
                public void run() {
                    if (currentPager >= slider_modelList.size()) {
                        currentPager = 1;
                    }
                    banner_slider_viewpager.setCurrentItem(currentPager++, true);
                }
            };
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    handler.post(update);
                }
            }, 3000, 3000);
        }

        public void stopbannerslide() {
            timer.cancel();
        }

    }

    public class adbannerViewHolder extends RecyclerView.ViewHolder {
        private ImageView ad_icon;
        private ConstraintLayout ad_constraint_layout;


        public adbannerViewHolder(@NonNull View itemView) {
            super(itemView);
            //ad banner
            ad_icon = itemView.findViewById(R.id.ad_icon);
            ad_constraint_layout = itemView.findViewById(R.id.ad_constraint);

            //ad banner
        }

        public void setStripad(int resource, String background) {
            ad_icon.setImageResource(resource);
            ad_constraint_layout.setBackgroundColor(Color.parseColor(background));

        }

    }


    public    class HorizontalViewHolder extends RecyclerView.ViewHolder {

        ///horizontal
        private RecyclerView horizantal_productView;
        private horizontal_recycler_adapter horizontal_recycler_adapter;

        private TextView deal_of_day;//=view.findViewById(R.id.deals_of__day);
       private Button viewAll;//=view.findViewById(R.id.horizontal_recylerView_viewall);

        // /horizontal

        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);
            horizantal_productView=itemView.findViewById(R.id.horizontal_recycler_view);

            deal_of_day=itemView.findViewById(R.id.deals_of__day);
             viewAll=itemView.findViewById(R.id.horizontal_recylerView_viewall);


        }
        public void sethorizontalView(List<horizontal_items_model> horizontal_items_models,String title)
        {
            deal_of_day.setText(title);
            if(horizontal_items_models.size()>8){
                viewAll.setVisibility(View.VISIBLE);
            }
            else
            {
                viewAll.setVisibility(View.INVISIBLE);

            }
            //horizantal_productView=view.findViewById(R.id.horizontal_recycler_view);
            LinearLayoutManager linearLayoutManager1=new LinearLayoutManager(itemView.getContext());
            linearLayoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
            horizantal_productView.setLayoutManager(linearLayoutManager1);
            horizontal_recycler_adapter=new horizontal_recycler_adapter(horizontal_items_models);
            horizantal_productView.setAdapter(horizontal_recycler_adapter);
        }
    }
    public class GridViewViewHolder extends RecyclerView.ViewHolder{
        private GridView product_gridView;
        private TextView gridlayout_title;//=view.findViewById(R.id.Items);
        private Button viewAll_gridView;//=view.findViewById(R.id.grid_view_viewall);

        public GridViewViewHolder(@NonNull View itemView) {
            super(itemView);
            gridlayout_title=itemView.findViewById(R.id.Items);
            viewAll_gridView=itemView.findViewById(R.id.grid_view_viewall);
            product_gridView=itemView.findViewById(R.id.product_gridview);
        }
        public void setGrid_View(List<horizontal_items_model> horizontal_items_models,String title)
        {
            gridlayout_title.setText(title);
            if(horizontal_items_models.size()>4)
            {
                viewAll_gridView.setVisibility(View.VISIBLE);
            }
            else
            {
                viewAll_gridView.setVisibility(View.INVISIBLE);
            }
            grid_view_adapter grid_view_adapter=new grid_view_adapter(horizontal_items_models);
            //product_gridView=view.findViewById(R.id.product_gridview);
            product_gridView.setAdapter(grid_view_adapter);
        }
    }

}



