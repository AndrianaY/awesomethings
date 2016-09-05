package eckel.exercises.initializationcleanup;
//Create a class called Tank that can be filled and emptied, and has a
//        termination condition that it must be empty when the object is cleaned up. Write a
//        finalize( ) that verifies this termination condition. In main( ), test the possible scenarios
//        that can occur when your Tank is used.
//
/**
 * Created by Andriana on 04.09.2016.
 */
public class Tank12 {

    boolean isEmpty;
    Tank12(){
        isEmpty = true;
    }
    public void classMAnipulations(){
        Class<Tank12> tank12Class = Tank12.class;
        System.out.println(tank12Class.getConstructors());
        System.out.println(tank12Class.getCanonicalName());
    }
    void emptied(){
        isEmpty = true;

    }
    void fill(){
        isEmpty = false;
    }

    protected void finalize(){
        if (isEmpty){
            System.out.println("it is empty - can be collected");
            try {
                super.finalize();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        else {
            System.out.println("need to be empty for GC");
            return;
        }
    }

    public static void main(String[] args) {
        Tank12 t = new Tank12();
//        t.fill();
//        t = new Tank12();
//        System.gc();
        t.classMAnipulations();

    }
}
