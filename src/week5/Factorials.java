package week5;

public class Factorials {
    public static void main(String[] args){
        int num;

        for (int i = 1; i <=10; i +=1){
            num = i;

            for (int a = i - 1; a > 0; --a){
                num = num * a;
                System.out.println(i + "factorial is " + num);
            }
        }
    }
}
