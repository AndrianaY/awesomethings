package eckel.exercises.polymorphism.exercise14;

/**
 * Created by Andriana on 13.09.2016.
 */
public class Gerbil extends Rodent {
    private String name = "Gebril";
    public Gerbil(SharedObject sharedObject){
        super(sharedObject);
        System.out.println("derived-class Gebril init");
    }
    @Override
    public void printName(){
        super.printName();
        System.out.println(name);
    }
    @Override
    public void eat(){
        System.out.println("No one knows what does gerbil eat");
    }
    @Override
    public void move(){
        System.out.println("No one knows who is a Gerbil");
    }
}
