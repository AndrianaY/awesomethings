package eckel.exercises.reusingclasses;
//(1) Create a base class with only a non-default constructor, and a derived
//class with both a default (no-arg) and non-default constructor. In the derived-class
//constructors, call the base-class constructor.
/**
 * Created by Andriana on 09.09.2016.
 */
class First{
    First(int i){
        System.out.println("fist class init value is " + i);
    }
}
public class Exercise8 extends First{

    Exercise8(){
        super(55);
    }
    Exercise8(int i) {
        super(i);
    }

    public static void main(String[] args) {
        Exercise8 ex1 = new Exercise8(100);
        Exercise8 ex2 = new Exercise8();
    }
}
