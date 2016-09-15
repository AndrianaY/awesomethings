package eckel.exercises.polymorphism.exercise14;

/**
 * Created by Andriana on 13.09.2016.
 */
public class Hamster extends Rodent {
    private String name = "Hamster";
    public Hamster(SharedObject sharedObject){
        super(sharedObject);
        System.out.println("derived-class Hamster init");
    }
    @Override
    public void printName(){
        super.printName();
        System.out.println(name);
    }
    @Override
    public void eat(){
        System.out.println("Hamster eats grains");
    }
    @Override
    public void move(){
        System.out.println("Hamster is not so fast");
    }
}
