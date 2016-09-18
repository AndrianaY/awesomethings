package eckel.exercises.interfaces.exercise10;

/**
 * Created by Andriana on 16.09.2016.
 */
public class Wind extends Instrument {
    // Redefine interface method:
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
} ///:~
