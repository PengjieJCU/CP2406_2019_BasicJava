package week7;

public class DemoCandles {
    public static void main(String[] args) {
        Candle candle = new Candle();
        candle.setColor("Blue");
        candle.setHeight(5);
        ScentedCandle scentedCandle = new ScentedCandle();
        scentedCandle.setColor("Red");
        scentedCandle.setScent("Unknown");
        scentedCandle.setHeight(5);

        System.out.println("Color: " + candle.getColor() +"\nHeight: " + candle.getHeight() + "\nPrice: " + candle.getPrice());
        System.out.println("Color: " + scentedCandle.getColor() + "\nScent: " + scentedCandle.getScent()+ "\nHeight: " + scentedCandle.getHeight() + "\nPrice: " + scentedCandle.getPrice());
    }
}
