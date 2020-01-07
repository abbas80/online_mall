package com.example.mall;

import android.support.constraint.ConstraintLayout;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class home_page_model {
    private int type;
    public static final int BannnerSlider=0;
    public static final int StripadBannnerSlider=1;
    public static final int HorizontalView=2;
    public static final int GRIDView=3;
    ////////bannerSlider
    private List<slider_model> slider_modelList;
    public home_page_model(int type, List<slider_model> slider_modelList,int k) {
        this.type = type;
        this.slider_modelList = slider_modelList;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public List<slider_model> getSlider_modelList() {
        return slider_modelList;
    }
    public void setSlider_modelList(List<slider_model> slider_modelList) {
        this.slider_modelList = slider_modelList;
    }
    ////////

    ////ad strip
    private int resource;
    private String backgroundcolor;
    //private ImageView ad_icon;
    //private ConstraintLayout ad_constraint_layout;

    public static int getBannnerSlider() {
        return BannnerSlider;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public String getBackgroundcolor() {
        return backgroundcolor;
    }

    public void setBackgroundcolor(String backgroundcolor) {
        this.backgroundcolor = backgroundcolor;
    }

    public home_page_model(int type, int resource, String backgroundcolor) {
        this.type = type;
        this.resource = resource;
        this.backgroundcolor = backgroundcolor;
    }


    ////
    /////horizontal
    private String Title;
    private List<horizontal_items_model> horizontal_items_models;

    public static int getStripadBannnerSlider() {
        return StripadBannnerSlider;
    }

    public home_page_model(int type, String title, List<horizontal_items_model> horizontal_items_models) {
        this.type = type;
        Title = title;
        this.horizontal_items_models = horizontal_items_models;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public List<horizontal_items_model> getHorizontal_items_models() {
        return horizontal_items_models;
    }

    public void setHorizontal_items_models(List<horizontal_items_model> horizontal_items_models) {
        this.horizontal_items_models = horizontal_items_models;
    }
    //////


    /////GRID VIEW

    //private GridView product_gridView;
    private   List<horizontal_items_model> GridView_items_models;
    private String GRIDTitle;

    public home_page_model(int type, List<horizontal_items_model> gridView_items_models, String GRIDTitle) {
        this.type = type;
        GridView_items_models = gridView_items_models;
        this.GRIDTitle = GRIDTitle;
    }

    public static int getHorizontalView() {
        return HorizontalView;
    }

    public List<horizontal_items_model> getGridView_items_models() {
        return GridView_items_models;
    }

    public void setGridView_items_models(List<horizontal_items_model> gridView_items_models) {
        GridView_items_models = gridView_items_models;
    }

    public String getGRIDTitle() {
        return GRIDTitle;
    }

    public void setGRIDTitle(String GRIDTitle) {
        this.GRIDTitle = GRIDTitle;
    }
    ////
}
