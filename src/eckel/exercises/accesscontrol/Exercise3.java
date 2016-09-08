package eckel.exercises.accesscontrol;
//(2) Create two packages: debug and debugoff, containing an identical class
//with a debug( ) method. The first version displays its String argument to the console, the
//        second does nothing. Use a static import line to import the class into a test program, and
//        demonstrate the conditional compilation effect.

import eckel.exercises.accesscontrol.debugoff.SomeClass;

/**
 * Created by Andriana_Yarmoliuk on 9/7/2016.
 */
public class Exercise3 {
    public static void main(String[] args) {
        SomeClass sc = new SomeClass();
        sc.debug("debug mode");
    }
}
