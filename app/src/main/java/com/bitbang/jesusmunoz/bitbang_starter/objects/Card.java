package com.bitbang.jesusmunoz.bitbang_starter.objects;

import android.databinding.BindingAdapter;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by jesuseduardomunoz on 5/30/16.
 */
public class Card{
    private long id;
    private String name;
    private int color;
    private String imageUrl;

    public Card(long id, String name, int color, String imageUrl) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.imageUrl = imageUrl;
    }

    public Card() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String url){
        Glide.with(view.getContext()).load(url).into(view);
    }

}
