package week6;

public class CountMovieSpaces {
    public static void main(String[] args){
        String movieQuote = "Go ahead, make my day.";
        int amountOfSpaces = 0;

        int length = movieQuote.length();

        for (int i = 0; i < length; i++){
            char achar = movieQuote.charAt(i);
            if(achar == ' '){
                amountOfSpaces++;
            }
        }
        System.out.println("The amount of spaces is " + amountOfSpaces);
    }
}
