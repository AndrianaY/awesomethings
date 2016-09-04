package eckel.exercises.initializationcleanup;

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
