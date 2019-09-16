package week7;

public class Candle {
    String color;
    int height;
    int price;

    public String getColor()
    {
        return color;
    }
    public int getHeight()
    {
        return height;
    }
    public int getPrice()
    {
        return price;
    }

    public void setColor(String fiColor){
        color = fiColor;
    }

    public void setHeight(int fiHeight){
        height = fiHeight;
        price = fiHeight * 2;
    }
}
