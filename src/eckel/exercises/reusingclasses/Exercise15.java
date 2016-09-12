package eckel.exercises.reusingclasses;
//Create a class inside a package. Your class should contain a protected
//method. Outside of the package, try to call the protected method and explain the results.
//        Now inherit from your class and call the protected method from inside a method of your
//        derived class.

        import eckel.exercises.reusingclasses.exercise15.BaseClass;



/**
 * Created by Andriana on 12.09.2016.
 */
public class Exercise15 extends BaseClass{
    public void usingProtected(){
        someMethod();
    }

}
