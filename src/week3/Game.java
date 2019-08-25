package week3;

import java.util.Random;

public class Game {
    private Random random = new Random();
    int secret;
    int count;
    int wins;

    public Game(int min, int max){
        this.secret = random.nextInt((max - min) + 1 + min);
    }
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
