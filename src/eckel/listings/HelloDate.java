package eckel.listings; /**
 * Created by Andriana on 29.08.2016.
 */

import java.util.Date;


/** The first Thinking in Java example program
 * Displays a string and today's date.
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */

public class HelloDate {
    /** Entry point to class and application
     * @param args array of string arguments
     * @throws SecurityException
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());


    }
} /* Output: (55% match)
Hello, it's:
Wed Oct 05 14:39:36 MDT 2005
*///:~
