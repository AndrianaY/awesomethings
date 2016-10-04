package eckel.exercises.holdingobjects.exercise23;
//(4) Starting with Statistics.java, create a program that runs the test
//        repeatedly and looks to see if any one number tends to appear more than the others in the
//        results.
/**
 * Created by Andriana on 29.09.2016.
 */
//: holding/Statistics.java
// Simple demonstration of HashMap.
import java.util.*;

public class Statistics {
    public static void main(String[] args) {
        int max = 0;
        Random rand = new Random();
        Map<Integer,Integer> m =
                new HashMap<>();
        for(int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(50);
            if (m.containsKey(r)) {
                Integer freq = m.get(r);
                freq = freq + 1;
                m.put(r, freq);
                if (freq > max)
                    max = freq;
            }
            else
                m.put(r, 1);

        }
         System.out.print("max times (" + max + ") appeared following number(s): ");
         for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
              if (Objects.equals(max, entry.getValue())) {
                  System.out.print(entry.getKey() + " ");
              }
         }
        System.out.println();
        System.out.println(m);
    }
} /* Output:
{15=497, 4=481, 19=464, 8=468, 11=531, 16=533, 18=478, 3=508, 7=471, 12=521, 17=509, 2=489, 13=506, 9=549, 6=519, 1=502, 14=477, 10=513, 5=503, 0=481}
*///:~

