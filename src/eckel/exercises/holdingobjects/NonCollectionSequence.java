package eckel.exercises.holdingobjects;
//Exercise 32: (2) Following the example of MultilterableClass, add reversed( ) and
//        randomized( ) methods to NonCollectionSequence.java, as well as making
//        NonCollectionSequence implement Iterable, and show that all the approaches work in
//        foreach statements.
/**
 * Created by Andriana on 06.10.2016.
 */
//: holding/NonCollectionSequence.java

import eckel.listings.holdingobjects.InterfaceVsIterator;
import pets.Pet;
import pets.Pets;

import java.util.*;

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence implements Iterable<Pet>{
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            public boolean hasNext() {
                return index < pets.length;
            }
            public Pet next() { return pets[index++]; }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public Iterable<Pet> reversed(){
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    private int index = pets.length - 1;
                    @Override
                    public boolean hasNext() {
                        return index == 0;
                    }

                    @Override
                    public Pet next() {
                        return pets[index--];
                    }
                };
            }
        };
    }

    public Iterable<Pet> shuffled(){
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> shuff = Arrays.asList(pets);
                Collections.shuffle(shuff, new Random());
                return shuff.iterator();
            }
        };
    }
    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
//        InterfaceVsIterator.display(nc.iterator());
        for (Pet p:nc) {
            System.out.print(p.id() + ": " + p + ", ");
        }
        System.out.println();
        for (Pet p:nc.reversed()) {
            System.out.print(p.id() + ": " + p + ", ");
        }
        System.out.println();
        for (Pet p:nc.shuffled()) {
            System.out.print(p.id() + ": " + p + ", ");
        }
    }
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~

