package eckel.exercises.controllingexecution;

import java.util.Random;
import java.lang.Runtime;

/**
 * Created by Andriana on 31.08.2016.
 */
public class Exercise3 {

        public static void main(String[] args) {
            Random r = new Random();
            int k;
            int secVal = 0;
            while (true){
                int i = 0;
                k = r.nextInt();
                if(i == 1)    secVal = k;
                if (k > secVal)    System.out.println(k + " is greater than the second val");
                else if(k < secVal) System.out.println(k + " is less than the second val");
                else System.out.println(k + " is equal to the second val");
        }
    }
}
