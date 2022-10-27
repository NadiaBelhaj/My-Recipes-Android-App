package com.nadiabelhaj.myrecipes;

public class Exp {

    private String recipe, details, id, date;

    public Exp() {
    }

    public Exp(String recipe, String details, String id, String date) {
        this.recipe = recipe;
        this.details = details;
        this.id = id;
        this.date = date;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
