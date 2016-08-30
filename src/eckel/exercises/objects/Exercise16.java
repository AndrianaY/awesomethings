/**
 * Created by Andriana on 29.08.2016.
 */

/** modified to demonstrate javadoc
 * @author Andriana
 * here is the original sorce code
 * @see Overloading
 * @version 1.0
 * Here is also some list of some items:
 * <ol>
 *     <li> Item one</li>
 *     <li> Item two</li>
 *     <li> Item three</li>
 * </ol>
 *
 */

package eckel.exercises.objects;

class Tree1 {
    int height;
    Tree1() {
        System.out.println("Planting a seedling");
        height = 0;
    }
    Tree1(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new Tree that is " +
                height + " feet tall");
    }
    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }
    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}
public class Exercise16 {

// Demonstration of both constructor
// and ordinary method overloading.


    public static void main(String[] args) {
            for(int i = 0; i < 5; i++) {
                Tree1 t = new Tree1(i);
                t.info();
                t.info("overloaded method");
            }
            // Overloaded constructor:
            new Tree1();

    } /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~

}
