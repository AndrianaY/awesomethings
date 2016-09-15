package eckel.exercises.reusingclasses.exercise1617;
//Exercise 16: (2) Create a class called Amphibian. From this, inherit a class called
//        Frog. Put appropriate methods in the base class. In main( ), create a Frog and upcast it to
//        Amphibian and demonstrate that all the methods still work.
//        Exercise 17: (1) Modify Exercise 16 so that Frog overrides the method definitions from
//        the base class (provides new definitions using the same method signatures). Note what
//        happens in main( ).

import eckel.exercises.reusingclasses.exercise1617.Amphibian;

/**
 * Created by Andriana on 12.09.2016.
 */


public class Frog extends Amphibian {
    @Override
    public void breath(Amphibian amphibian){
        System.out.println(amphibian + " still can breath");
    }
}
