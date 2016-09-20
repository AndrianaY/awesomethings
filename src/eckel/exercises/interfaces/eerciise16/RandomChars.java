package eckel.exercises.interfaces.eerciise16;
//) Create a class that produces a sequence of chars. Adapt this class so
//that it can be an input to a Scanner object.


import java.util.Random;

/**
 * Created by Andriana on 20.09.2016.
 */
public class RandomChars {
    private static Random rand = new Random(47);
    public char next() { return (char) rand.nextInt(); }

    public static void main(String[] args) {
        RandomChars rd = new RandomChars();
        for(int i = 0; i < 7; i ++)
            System.out.print(rd.next() + " " + "inside main randomDoubles");

    }
}
