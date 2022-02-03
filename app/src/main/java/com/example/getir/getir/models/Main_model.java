package com.example.getir.getir.models;

public class Main_model {

    private String title;
    private int image;

    public Main_model() {
    }

    public Main_model(String title, int image) {
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
