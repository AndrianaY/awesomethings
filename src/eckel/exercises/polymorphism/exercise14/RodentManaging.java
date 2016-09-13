package eckel.exercises.polymorphism.exercise14;
//Ex 9 Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,
//        etc. In the base class, provide methods that are common to all Rodents, and override these
//        in the derived classes to perform different behaviors depending on the specific type of
//        Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call
//        your base-class methods to see what happens.
// Ex 12 Modify Exercise 9 so that it demonstrates the order of initialization of
//        the base classes and derived classes. Now add member objects to both the base and derived
//        classes and show the order in which their initialization occurs during construction.
// Exercise 14: (4) Modify Exercise 12 so that one of the member objects is a shared object
//        with reference counting, and demonstrate that it works properly

/**
 * Created by Andriana on 13.09.2016.
 */
public class RodentManaging {
    public static void main(String[] args) {
        SharedObject sO1 = new SharedObject();
        SharedObject sO2 = new SharedObject();
        Rodent[] rodents = new Rodent[]{new Mouse(sO1), new Gerbil(sO1), new Hamster(sO2)};
        for (Rodent r: rodents) {
            r.printName();
            r.eat();
            r.move();
        }

        sO1.printRefCount();
        sO2.printRefCount();
    }
}
