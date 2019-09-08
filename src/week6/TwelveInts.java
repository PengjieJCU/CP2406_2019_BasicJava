package week6;

public class TwelveInts {
    public static void main(String[] args){
        int[] num = {1,3,5,7,9,11,13,17,19,21,23,25};

        System.out.println("Display from first to last: ");
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
        System.out.println("Display from last to first: ");
        for (int i = num.length - 1; i >= 0; i--){
            System.out.println(num[i]);
        }
    }
}