package eckel.exercises.holdingobjects;
//(2) Modify innerclasses/Sequence.java so that you can add any number
//        of elements to it.

//Exercise 9: (4) Modify innerclasses/Sequence.java so that Sequence works with an
//        Iterator instead of a Selector.

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Andriana on 25.09.2016.
 */
//: innerclasses/Sequence.java
// Holds a sequence of Objects.

public class SequenceIter {
    private ArrayList<Object> items;
    private int next = 0;

    public SequenceIter() { items = new ArrayList<>(); }
    public void add(Object x) {
        items.add(x);
    }

    public void display(){
        Iterator iterator = items.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.print(o + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        SequenceIter sequence = new SequenceIter();
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        sequence.display();

    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~

