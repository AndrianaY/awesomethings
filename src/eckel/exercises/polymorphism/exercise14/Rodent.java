package eckel.exercises.polymorphism.exercise14;

/**
 * Created by Andriana on 13.09.2016.
 */
public class Rodent {
    SharedObject sharedObject;

    private String name = "Rodent";

    public Rodent(SharedObject sharedObject){
        this.sharedObject = sharedObject;
        this.sharedObject.addRef();
        System.out.println("base-class Rodent init. using " + sharedObject);
    }
    public void printName(){
        System.out.print("This is the " + name);
    }
    public void eat(){

    }
    public void move(){

    }
}
