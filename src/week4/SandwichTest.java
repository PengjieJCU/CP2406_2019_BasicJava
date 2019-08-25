package week4;

import static org.junit.jupiter.api.Assertions.*;

class SandwichTest {
    public static void main(String[] args){
        Sandwich sandwich = new Sandwich();
        sandwich.setBreadType("Wheat");
        sandwich.setMainIngredient("Tuna");
        sandwich.setPrice(4.99);
        sandwich.getBreadType();
        sandwich.getMainIngredient();
        sandwich.getPrice();
        System.out.println("Main ingredient: " + sandwich.mainIngredient);
        System.out.println("Bread type: " + sandwich.breadType);
        System.out.println("Cost: $" + sandwich.price);
    }

}