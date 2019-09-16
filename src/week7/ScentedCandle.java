package week7;

public class ScentedCandle extends Candle{
    String scent;

    public String getScent(){
        return scent;
    }

    public void setScent(String fiScent){
        scent = fiScent;
    }
    @Override
    public void setHeight(int fiHeight){
        super.setHeight(fiHeight);
        price = fiHeight * 3;
    }

}
