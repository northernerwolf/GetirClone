package com.example.getir.getir.models;

public class GetirProduct_model {

    private String title;
    private String cost;
    private String weight;
    private int imgproduct;

    public GetirProduct_model() {
    }

    public GetirProduct_model(String title,String weight, String cost, int imgproduct) {
        this.title = title;
        this.cost = cost;
        this.imgproduct = imgproduct;
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
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

    public int getImgproduct() {
        return imgproduct;
    }

    public void setImgproduct(int imgproduct) {
        this.imgproduct = imgproduct;
    }
}
