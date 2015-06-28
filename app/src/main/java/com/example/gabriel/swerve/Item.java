package com.example.gabriel.swerve;

/**
 * Created by GABRIEL on 6/28/2015.
 */
public class Item {
    private String image;
    private String name;
    private float price;

    //button->image->gps
    public Item(String newImage, String newName, float newPrice) {
        image = newImage;
        name = newName;
        price = newPrice;
    }

    public String getImage(){
        return image;
    }

    public String getName(){
        return name;
    }

    public String getPrice(){
        return String.valueOf(price);
    }
}