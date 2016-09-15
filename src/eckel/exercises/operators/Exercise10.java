package eckel.exercises.operators;

/**
 * Created by Andriana on 31.08.2016.
 */
//Repeat Exercise 10 from the previous chapter, using the ternary operator
//        and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).
public class Exercise10 {
    public static void main(String[] args) {
        int bit1 = Integer.parseInt("10101010", 2);
        int bit2 = Integer.parseInt("01010101", 2);
        System.out.println(Integer.toBinaryString(bit1 & bit2));
        System.out.println(Integer.toBinaryString(bit1 ^ bit2));
        System.out.println(Integer.toBinaryString(bit1 | bit2));
        System.out.println(Integer.toBinaryString(bit1 << bit2));
        System.out.println(Integer.toBinaryString(bit1 >> bit2));
        System.out.println(Integer.toBinaryString(bit1 >>> bit2));
    }
}
