package eckel.exercises.reusingclasses;
//: (2) Prove that the base-class constructors are (a) always called and (b) called
//        before derived-class constructors.
/**
 * Created by Andriana on 09.09.2016.
 */
class FirstClass{
    FirstClass(){
        System.out.println("first class constructor");
    }
}
class SecondClass extends FirstClass{
    SecondClass(){
        System.out.println("second class constructor");
    }
}
public class Exercise4 extends SecondClass{
    Exercise4(){
        System.out.println("third class constructor");
    }

    public static void main(String[] args) {
       Exercise4 ex = new Exercise4();
    }
}
