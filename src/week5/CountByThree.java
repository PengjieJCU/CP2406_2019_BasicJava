package week5;

public class CountByThree {
    public static void main(String[] args){
        for (int i = 3; i <= 300; i +=3){
            System.out.println(i + "");
            if (i % 30 == 0){
                System.out.println();
            }
        }
    }
}
