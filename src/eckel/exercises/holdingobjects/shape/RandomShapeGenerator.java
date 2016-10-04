//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
//(3) Modify polymorphism/shape/RandomShapeGenerator.java to
//        make it Iterable. You’ll need to add a constructor that takes the number of elements that
//        you want the iterator to produce before stopping. Verify that it works

package eckel.exercises.holdingobjects.shape;
import pets.Pet;

import java.util.*;

public class RandomShapeGenerator implements Iterable<Shape>{
  private Random rand = new Random(47);
  private Shape[] shapes;
  public Shape next() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
    }
  }

  @Override
  public Iterator<Shape> iterator() {
    return new Iterator<Shape>() {
      private int index = 0;
      public boolean hasNext() {
        return index < shapes.length;
      }
      public Shape next() { return shapes[index++]; }
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }

  public RandomShapeGenerator(int i){
    shapes = new Shape[i];
    for(int k = 0; k < i; k++)
      shapes[k] = next();
  }

  public static void main(String[] args) {
    RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator(10);
    for (Shape s:randomShapeGenerator) {
      System.out.println(s.getClass().getSimpleName());
    }
  }
} ///:~
