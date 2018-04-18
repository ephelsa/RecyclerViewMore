package com.ingdisconsistemas.teach;

import android.graphics.drawable.Drawable;

public class RecyclerModel {

    private Drawable photo = null;
    private String name;

    public RecyclerModel(Drawable photo, String name) {
        this.photo = photo;
        this.name = name;
    }

    public RecyclerModel(String name) {
        this.name = name;
    }

    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
