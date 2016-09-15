package eckel.exercises.polymorphism;

/**
 * Created by Andriana on 13.09.2016.
 */

//: polymorphism/PolyConstructors.java
// Constructors and polymorphism
// don't produce what you might expect.
import javax.swing.text.html.parser.Entity;

import static net.mindview.util.Print.*;

class Glyph {
    void draw() { print("Glyph.draw()"); }
    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class SquareGlyph extends Glyph {
    private int side = 10;
    SquareGlyph(int r) {
        side = r;
        print("RoundGlyph.RoundGlyph(), radius = " + side);
    }
    void draw() {
        print("RoundGlyph.draw(), radius = " + side);
    }
}

class RoundGlyph extends Glyph {

    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}



public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new SquareGlyph(20);
    }
} /* Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
*///:~


