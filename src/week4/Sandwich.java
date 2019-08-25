package week4;

import java.awt.desktop.SystemEventListener;

public class Sandwich {

    String mainIngredient;
    String breadType;
    double price;


    public void setMainIngredient(String ingredient){
        mainIngredient = ingredient;
    }

    public void setBreadType(String breadTy){
        breadType = breadTy;
    }

    public void setPrice(double totalPrice){
        price = totalPrice;
    }

    public String getMainIngredient(){
        return mainIngredient;
    }

    public String getBreadType(){
        return breadType;
    }

    public double getPrice(){
        return price;
    }





}
