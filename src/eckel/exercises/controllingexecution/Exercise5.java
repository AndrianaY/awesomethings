package eckel.exercises.controllingexecution;

/**
 * Created by Andriana on 31.08.2016.
 */
public class Exercise5 {
    public static void main(String[] args) {
        int bit1 = Integer.parseInt("10101010", 2);
        int bit2 = Integer.parseInt("01010101", 2);
        String sBit1 = "10101010";
        String sBit2 = "01010101";

        System.out.println(Integer.toBinaryString(bit1 & bit2));
        for(int i = 0; i < 8; i++) {
            System.out.print((Character.getNumericValue(sBit1.charAt(i)) & (Character.getNumericValue(sBit1.charAt(i)))) == 1 ? 1 : 0);
        }
        System.out.println();
        System.out.println();

        System.out.println(Integer.toBinaryString(bit1 ^ bit2));
        for(int i = 0; i < 8; i++) {
            System.out.print((Character.getNumericValue(sBit1.charAt(i)) ^ (Character.getNumericValue(sBit1.charAt(i)))) == 1 ? 1 : 0);
        }
        System.out.println();
        System.out.println();

        System.out.println(Integer.toBinaryString(bit1 | bit2));
        for(int i = 0; i < 8; i++) {
            System.out.print((Character.getNumericValue(sBit1.charAt(i)) | (Character.getNumericValue(sBit1.charAt(i)))) == 1 ? 1 : 0);
        }
        System.out.println();
        System.out.println();

        System.out.println(Integer.toBinaryString(bit1 << bit2));
        System.out.println(Integer.toBinaryString(bit1 >> bit2));
        System.out.println(Integer.toBinaryString(bit1 >>> bit2));
    }
}
