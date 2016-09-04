package eckel.exercises.initializationcleanup;
//Create a class called Dog with an overloaded bark( ) method. This
//        method should be overloaded based on various primitive data types, and print different types
//        of barking, howling, etc., depending on which overloaded version is called. Write a main( )
//        that calls all the different versions.
/**
 * Created by Andriana on 04.09.2016.
 */
public class Dog5 {
    private String name;

    Dog5(String name){
        this.name = name;
    }
    Dog5(){
        this("Doggy");
    }

    public void bark(char c){
        System.out.println(this.name + " is barking");
    }
    public void bark(int i){
        System.out.println(this.name + " is howling");
    }

    public static void main(String[] args) {
        Dog5 dog = new Dog5();
        dog.bark('b');
        Dog5 dog1 = new Dog5("Puppy");
        dog1.bark(5);
    }
}
