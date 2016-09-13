package eckel.exercises.polymorphism.exercise14;

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
