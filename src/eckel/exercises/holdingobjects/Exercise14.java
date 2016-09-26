package eckel.exercises.holdingobjects;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Andriana on 27.09.2016.
 */
public class Exercise14 {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        Random random = new Random();

        for (int i = 0 ; i < 10; i++){
            integers.add(i);
        }
        System.out.println(integers);
        int index;
        for (int k = 0 ; k < 10; k++){
            index = random.nextInt(integers.size());
            if (index == 0)
                integers.add(index+1, k);
            else
                integers.add(index, k);
        }
        System.out.println(integers);
    }
}
