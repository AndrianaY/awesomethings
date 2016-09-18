package eckel.exercises.interfaces.exercise10;
//(3) Modify Musics.java by adding a Playable interface. Move the play( )
//        declaration from Instrument to Playable. Add Playable to the derived classes by
//        including it in the implement s list. Change tune( ) so that it takes a Playable instead of
//        an Instrument.


import java.io.Serializable;

/**
 * Created by Andriana on 16.09.2016.
 */
//: polymorphism/music/Music.java
// Inheritance & upcasting.

public class Music{
    public static void tune(Playable p) {
        // ...
        p.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting
    }
} /* Output:
Wind.play() MIDDLE_C
*///:~
