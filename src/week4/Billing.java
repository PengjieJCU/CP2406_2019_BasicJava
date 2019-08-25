package week4;

public class Billing {

    public double computeBill(double photobookPrice) {
        double totalPrice = photobookPrice * 1.08;
        return totalPrice;
    }

    public double computeBill(double photobookPrice, int photobookAount){
        double totalPrice = photobookPrice * photobookAount * 1.08;
        return totalPrice;
    }

    public double computeBill(double photobookPrice, int photobookAount, double couponValue){
       double totalPrice = ((photobookPrice * photobookAount) - couponValue) * 1.08;
       return totalPrice;
    }


}