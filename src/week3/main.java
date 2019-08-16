package week3;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        game.generateSecret();

        while (true){
            System.out.print("Please enter a guess:");
            int guess = scanner.nextInt();
            game.makeGuess(guess);
            game.generateSecret();

            System.out.println("Games:" + game.count);
            System.out.println("Wins:" + game.wins);

            if (guess == 0){
                break;
            }
        }

    }
}
