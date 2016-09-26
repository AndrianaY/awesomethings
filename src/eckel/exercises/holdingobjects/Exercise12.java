package eckel.exercises.holdingobjects;
// (3) Create and populate a List<Integer>. Create a second List<Integer>
//of the same size as the first, and use ListIterators to read elements from the first List and
//        insert them into the second in reverse order. (You may want to explore a number of different
//        ways to solve this problem.)

import java.util.*;

/**
 * Created by Andriana on 27.09.2016.
 */
public class Exercise12 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> integers1 = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            integers.add(i);
        }
        ListIterator<Integer> backward = integers.listIterator(integers.size());
        System.out.println(integers);
        while (backward.hasPrevious()){
            integers1.add(backward.previous());
        }
        System.out.println(integers1);


    }

}
