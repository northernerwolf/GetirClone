package com.example.getir.getir.models;

public class Special_offer_model {

    private String title;
    private String cost;
    private String weight;
    private int imgproduct;

    public Special_offer_model() {
    }

    public Special_offer_model(String title, String cost, String weight, int imgproduct) {
        this.title = title;
        this.cost = cost;
        this.weight = weight;
        this.imgproduct = imgproduct;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getImgproduct() {
        return imgproduct;
    }

    public void setImgproduct(int imgproduct) {
        this.imgproduct = imgproduct;
    }
}
