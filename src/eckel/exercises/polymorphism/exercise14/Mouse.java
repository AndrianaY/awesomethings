package eckel.exercises.polymorphism.exercise14;

/**
 * Created by Andriana on 13.09.2016.
 */
public class Mouse extends Rodent{
    private String name = "Mouse";
    public Mouse(SharedObject sharedObject){
        super(sharedObject);
        System.out.println("derived-class Mouse init");
    }
    @Override
    public void printName(){
        super.printName();
        System.out.println(name);
    }
    @Override
    public void eat(){
        System.out.println("mouse eats cheese");
    }
    @Override
    public void move(){
        System.out.println("Mouse is very fast rodent");
    }
}
