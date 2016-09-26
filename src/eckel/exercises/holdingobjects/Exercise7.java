package eckel.exercises.holdingobjects;
// (3) Create a class, then make an initialized array of objects of your class. Fill
//        a List from your array. Create a subset of your List by using subList( ), then remove this
//        subset from your List.

import javax.swing.*;
import java.util.*;

/**
 * Created by Andriana on 27.09.2016.
 */
class Test{
    String name;
    private static long counter = 0;
    private final long id = counter++;
    public Test(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
    public boolean equals(Object o){
        if (o == this) return true;
        if (!(o instanceof Test)) {
            return false;
        }

        Test test = (Test) o;

        return test.name.equals(name);
    }
    public int hashCode(){
        int result = 17;
        result = 31 * result + name.hashCode();

        return result;
    }
}
public class Exercise7 {
    public static void main(String[] args) {
        Test[] test = new Test[]{new Test("t1"), new Test("t2"), new Test("t3")};
        List<Test> listTest = Arrays.asList(test);
        List<Test> subTest = listTest.subList(1, 2);
        List<Test> copy = new ArrayList<>();
        copy.add(new Test("t2"));
        copy.add(new Test("t4"));
        listTest.removeAll(copy);
        System.out.println(listTest);
    }
}
