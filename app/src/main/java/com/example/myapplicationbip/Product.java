package com.example.myapplicationbip;

import java.util.ArrayList;

public class Product {

    private String nickName;
    private String chatDescription;
    private int imageID;

    public Product() {

    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getChatDescription() {
        return chatDescription;
    }

    public void setChatDescription(String chatDescription) {
        this.chatDescription = chatDescription;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public static ArrayList<Product> getData() {
        ArrayList<Product> productList = new ArrayList<Product>();
        int productImages[] = {R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground};
        String[] productNames = {"Test 6566", "Test 4659", "Test 8256","Ceo","Test Tuğba","Test elif","Test sena","Test sinan","Test furkan","Test Göknur","Test Öznur"};

        for (int i = 0; i < productImages.length; i++) {
            Product temp = new Product();
            temp.setImageID(productImages[i]);
            temp.setNickName(productNames[i]);
            temp.setChatDescription("Hadi konuşmaya devam");

            productList.add(temp);

        }
        return productList;
    }

}
