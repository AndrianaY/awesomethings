package eckel.exercises.interfaces;
//(3) Create an abstract class with no methods. Derive a class and add a
//        method. Create a static method that takes a reference to the base class, downcasts it to the
//        derived class, and calls the method. In main( ), demonstrate that it works. Now put the
//abstract declaration for the method in the base class, thus eliminating the need for the
//        downcast.

/**
 * Created by Andriana on 16.09.2016.
 */
abstract class SomeAbstract{
    public abstract void someMethod();
}
class Utility{
    public static void doing(SomeAbstract someAbstract){
//        Exercise4 ex = (Exercise4) someAbstract;
//        ex.someMethod();

        someAbstract.someMethod();
    }
}
public class Exercise4 extends SomeAbstract{
    public void someMethod(){
        System.out.println("inside somemethod");
    }



    public static void main(String[] args) {
        Exercise4 ex = new Exercise4();
        Utility.doing(ex);

    }
}
