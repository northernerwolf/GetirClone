package com.example.getir.getirmore.moremodels;

public class Main_model_more {

    private String title;
    private int image;

    public Main_model_more() {
    }

    public Main_model_more(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
