package week6;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        int[] num = {6,16,26,36,46,56,66,76,86,96};
        int sum = 0;
        int average;

        //display all the integers
        System.out.println("All the integers below: ");
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }

        //display all the integers in reverse order
        System.out.println("Display all the integers in reverse order: ");
        for (int a = num.length - 1; a >= 0; --a){
            System.out.println(num[a]);

        }

        // display the sum of the integers
        System.out.println("The sum of all number is :");
        for (int b = 0; b< num.length; b++){
            sum += num[b];
        }
        System.out.println(sum);

        //display all the values less than a limiting argument
        System.out.println("All the values less than 47: ");
        for (int c = 0; c < num.length; c++){
            if (num[c] < 47){
                System.out.println(num[c]);
            }
        }

        //display all the values that are higher than the calculated average value
        System.out.println("All values that are higher than the average: ");
        for (int d = 0; d < num.length; d++){
            average = sum / 10;
            if (num[d] > average){
                System.out.println(num[d]);
            }
        }
    }
}
