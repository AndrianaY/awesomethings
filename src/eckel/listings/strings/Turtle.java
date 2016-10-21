package eckel.listings.strings;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Created by Andriana_Yarmoliuk on 10/21/2016.
 */
public class Turtle {
    private String name;
    private Formatter f;
    public Turtle(String name, Formatter f){
        this.name = name;
        this.f = f;
    }
    public void move(int x, int y){
        f.format("%s The turtle is at (%d, %d)\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.err;
        Turtle tommy = new Turtle("Tommy", new Formatter(outAlias));
        Turtle terry = new Turtle("Terry", new Formatter(outAlias));
        tommy.move(0,0);
        terry.move(4,8);
        tommy.move(5,9);
        terry.move(1,4);
        tommy.move(7,2);
        terry.move(3,3);
    }
}
