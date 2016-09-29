package eckel.exercises.holdingobjects;
// (3) Create a class, then make an initialized array of objects of your class. Fill
//        a List from your array. Create a subset of your List by using subList( ), then remove this
//        subset from your List.

import pets.Pet;
import pets.Pets;

import javax.swing.*;
import java.util.*;

import static net.mindview.util.Print.print;

/**
 * Created by Andriana on 27.09.2016.
 */
class Test {
    String name;
    private static long counter = 0;
    private final long id = counter++;

    public Test(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
public class Exercise7 {
    public static void main(String[] args) {
        Test[] test = new Test[]{new Test("t1"), new Test("t2"), new Test("t3")};

        List<Test> listTest = Arrays.asList(test); //removeAll is not supported for this kind of instance initialization
        List<Test> subTest = listTest.subList(1, 2);
        Test t = listTest.get(0);
//        this 2 methods throw weird UnsupportedOperationExeption
//        listTest.removeAll(subTest);
//        listTest.remove(t);
        System.out.println(listTest.get(1).equals(subTest.get(0)));
        System.out.println(listTest);

        List<Test> list = new ArrayList<>(listTest); //in this case works fine
        List<Test> subTest1 = list.subList(1, 2);
        list.removeAll(subTest1);
        System.out.println(list);

        List<Test> result = new ArrayList<>();
        Collections.addAll(result, test);
        List<Test> subResultTest = result.subList(1, 2);
        result.removeAll(subResultTest);
        System.out.println(result);

//        copypasted from listing. works fine
        List<Pet> pets = Pets.arrayList(7); //this method is impleneted by using such method - Collections.addAll(result, test);
        List<Pet> sub = Arrays.asList(pets.get(1), pets.get(4));
        List<Pet> copy = new ArrayList<Pet>(pets); // Get a fresh copy
        print("sub: " + sub);
        copy.retainAll(sub);
        print("13: " + copy);
        print("***** pets" + pets);
        copy.remove(1); // Remove by index
        print("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
    }
}
