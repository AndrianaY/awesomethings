package eckel.exercises.polymorphism.exercise14;

/**
 * Created by Andriana on 14.09.2016.
 */
public class SharedObject {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public SharedObject(){
        System.out.println("shared object " + id);
    }

    public void addRef(){
        refCount++;
    }
    public String toString(){
        return "shared obj " + id;
    }
    public void printRefCount(){
        System.out.println(this + " is used " + refCount + " times");
    }
}
