package com.example.mall;

public class category_model {
    private String categoryiconlink;
    private String categoryname;

    public category_model(String categoryiconlink, String categoryname) {
        this.categoryiconlink = categoryiconlink;
        this.categoryname = categoryname;
    }

    public String getCategoryiconlink() {
        return categoryiconlink;
    }

    public void setCategoryiconlink(String categoryiconlink) {
        this.categoryiconlink = categoryiconlink;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}
