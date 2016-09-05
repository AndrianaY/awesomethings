package eckel.exercises.initializationcleanup;
//Create a class with a constructor that takes a String argument. During
//        construction, print the argument. Create an array of object references to this class, but don’t
//        actually create objects to assign into the array. When you run the program, notice whether
//        the initialization messages from the constructor calls are printed.
//        Exercise 18: (1) Complete the previous exercise by creating objects to attach to the array
//        of references.
/**
 * Created by Andriana on 05.09.2016.
 */
public class Exercise1718 {
    Exercise1718(String arg){
        System.out.println(arg);
    }

    public static void main(String[] args) {

        Exercise1718[] arr = new Exercise1718[3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new Exercise1718(i + " member");
        }

    }
}
