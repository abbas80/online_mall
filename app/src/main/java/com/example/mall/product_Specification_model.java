package com.example.mall;

public class product_Specification_model {

    public static   final int Title_code=0;
    public static final int spec_Code=1;
    //
    private int type;
    private String title;

    private String feature_name;
    private String feature_Specification;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFeature_name() {
        return feature_name;
    }

    public void setFeature_name(String feature_name) {
        this.feature_name = feature_name;
    }

    public String getFeature_Specification() {
        return feature_Specification;
    }

    public void setFeature_Specification(String feature_Specification) {
        this.feature_Specification = feature_Specification;
    }

    public product_Specification_model(int type, String title) {
        this.type = type;
        this.title = title;
    }

    public product_Specification_model(int type, String feature_name, String feature_Specification) {
        this.type = type;
        this.feature_name = feature_name;
        this.feature_Specification = feature_Specification;
    }
}
