package eckel.exercises.controllingexecution;

/**  A vampire number has an even number of digits and is formed by
 multiplying a pair of numbers containing half the number of digits of the result. The digits
 are taken from the original number in any order. Pairs of trailing zeroes are not allowed.
 Examples include:
 1260 = 21 * 60
 1827 = 21 * 87
 2187 = 27 * 81
 Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
 */

/**
 * Created by Andriana on 01.09.2016.
 */
public class Exercise10 {
    public static void main(String[] args) {

        int[] vN = new int[4];

        for (int i = 1000; i <= 9999; i++){
            vN[0] = i / 100 / 10;
            vN[1] = i / 100 % 10;
            vN[2] = i % 100 / 10;
            vN[3] = i % 100 % 10;

            if(((vN[0] * 10 + vN[1]) != 0) && ((vN[2] * 10 + vN[3])!= 0))
                if(((vN[0] * 10 + vN[1]) * (vN[2] * 10 + vN[3]))== i) {
                    System.out.println(i + " is vampire : " + vN[0] + vN[1] + "*" + vN[2] + vN[3]);
                    continue;
                }

            if(((vN[1] * 10 + vN[0]) != 0) && ((vN[2] * 10 + vN[3])!= 0))
                if(((vN[1] * 10 + vN[0]) * (vN[2] * 10 + vN[3]))== i) {
                    System.out.println(i + " is vampire : " + vN[1] + vN[0] + "*" + vN[2] + vN[3]);
                    continue;
                }

            if(((vN[0] * 10 + vN[1]) != 0) && ((vN[3] * 10 + vN[2])!= 0))
                if(((vN[0] * 10 + vN[1]) * (vN[3] * 10 + vN[2]))== i) {
                    System.out.println(i + " is vampire : " + vN[0] + vN[1] + "*" + vN[3] + vN[2]);
                    continue;
                }

            if(((vN[1] * 10 + vN[0]) != 0) && ((vN[3] * 10 + vN[2])!= 0))
                if(((vN[1] * 10 + vN[0]) * (vN[3] * 10 + vN[2]))== i) {
                    System.out.println(i + " is vampire : " + vN[1] + vN[0] + "*" + vN[3] + vN[2]);
                    continue;
                }



            if(((vN[0] * 10 + vN[2]) != 0) && ((vN[1] * 10 + vN[3])!= 0))
                if(((vN[0] * 10 + vN[2]) * (vN[1] * 10 + vN[3]))== i) {
                    System.out.println(i + " is vampire : " + vN[0] + vN[2] + "*" + vN[1] + vN[3]);
                    continue;
                }

            if(((vN[2] * 10 + vN[0]) != 0) && ((vN[1] * 10 + vN[3])!= 0))
                if(((vN[2] * 10 + vN[0]) * (vN[1] * 10 + vN[3]))== i) {
                    System.out.println(i + " is vampire : " + vN[2] + vN[0] + "*" + vN[1] + vN[3]);
                    continue;
                }

            if(((vN[0] * 10 + vN[2]) != 0) && ((vN[3] * 10 + vN[1])!= 0))
                if(((vN[0] * 10 + vN[2]) * (vN[3] * 10 + vN[1]))== i) {
                    System.out.println(i + " is vampire : " + vN[0] + vN[2] + "*" + vN[3] + vN[1]);
                    continue;
                }

            if(((vN[2] * 10 + vN[0]) != 0) && ((vN[3] * 10 + vN[1])!= 0))
                if(((vN[2] * 10 + vN[0]) * (vN[3] * 10 + vN[1]))== i) {
                    System.out.println(i + " is vampire : " + vN[2] + vN[0] + "*" + vN[3] + vN[1]);
                    continue;
                }



            if(((vN[0] * 10 + vN[3]) != 0) && ((vN[2] * 10 + vN[1])!= 0))
                if(((vN[0] * 10 + vN[3]) * (vN[2] * 10 + vN[1]))== i) {
                    System.out.println(i + " is vampire : " + vN[0] + vN[3] + "*" + vN[2] + vN[1]);
                    continue;
                }

            if(((vN[3] * 10 + vN[0]) != 0) && ((vN[2] * 10 + vN[1])!= 0))
                if(((vN[3] * 10 + vN[0]) * (vN[2] * 10 + vN[1]))== i) {
                    System.out.println(i + " is vampire : " + vN[3] + vN[0] + "*" + vN[2] + vN[1]);
                    continue;
                }

            if(((vN[0] * 10 + vN[3]) != 0) && ((vN[1] * 10 + vN[2])!= 0))
                if(((vN[0] * 10 + vN[3]) * (vN[1] * 10 + vN[2]))== i) {
                    System.out.println(i + " is vampire : " + vN[0] + vN[3] + "*" + vN[1] + vN[2]);
                    continue;
                }

            if(((vN[3] * 10 + vN[0]) != 0) && ((vN[1] * 10 + vN[2])!= 0))
                if(((vN[3] * 10 + vN[0]) * (vN[1] * 10 + vN[2]))== i) {
                    System.out.println(i + " is vampire : " + vN[3] + vN[0] + "*" + vN[1] + vN[2]);
                    continue;
                }
        }
    }
}
