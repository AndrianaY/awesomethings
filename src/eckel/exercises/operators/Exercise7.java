package eckel.exercises.operators;

import java.util.Random;

/**
 * Created by Andriana on 29.08.2016.
 */
//operators
public class Exercise7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int coinSide = rand.nextInt(200);
        if((coinSide % 2) == 0)
            System.out.println("Heads");
        else
            System.out.println("Tails");
    }


}
