package eckel.exercises.initializationcleanup;
//Create an enum of the least-valuable six types of paper currency. Loop
//        through the values( ) and print each value and its ordinal( ).
//        Exercise 22: (2) Write a switch statement for the enum in the previous example. For
//        each case, output a description of that particular currency.

import java.util.Random;

/**
 * Created by Andriana on 06.09.2016.
 */
enum Currencies{
    VIETNAMESE_DONG, INDONESIAN_RUPIAH, COLOMBIAN_PESO, TANZANIAN_SHILLING, SKOREANS_WONG, CHILEAN_PESO
}
public class Exersice2122 {
    public static void main(String[] args) {
        for (Currencies c: Currencies.values()) {
            System.out.println(c + " " + c.ordinal());
        }
        System.out.println();

        Random random = new Random();
        int ord = random.nextInt(5);
        Currencies[] currencies = Currencies.values();
        Currencies currencie = currencies[ord];

        switch (currencie){
            case VIETNAMESE_DONG:
                System.out.println(currencie + " " + currencie.ordinal()); break;
            case INDONESIAN_RUPIAH:
                System.out.println(currencie + " " + currencie.ordinal()); break;
            case COLOMBIAN_PESO:
                System.out.println(currencie + " " + currencie.ordinal()); break;
            case TANZANIAN_SHILLING:
                System.out.println(currencie + " " + currencie.ordinal()); break;
            case SKOREANS_WONG:
                System.out.println(currencie + " " + currencie.ordinal()); break;
            case CHILEAN_PESO:
                System.out.println(currencie + " " + currencie.ordinal());
        }
    }
}
