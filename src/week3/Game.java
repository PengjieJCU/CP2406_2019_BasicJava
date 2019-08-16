package week3;

import java.util.Random;

public class Game {
    private Random random = new Random();
    int secret;
    int count;
    int wins;

    void  generateSecret(){
        this.secret = random.nextInt(10)+1;
    }
    void makeGuess(int value){
        this.count++;
        if (value == this.secret){
            this.wins++;
        }
    }
}
