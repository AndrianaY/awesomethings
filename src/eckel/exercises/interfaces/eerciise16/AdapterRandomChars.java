package eckel.exercises.interfaces.eerciise16;

import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by Andriana on 20.09.2016.
 */
public class AdapterRandomChars extends RandomChars
        implements Readable {
        private int count;
    public AdapterRandomChars(int count) {
            this.count = count;
        }
    public int read(CharBuffer cb) {
        if(count-- == 0)
            return -1;
        String result = next() + " ";
        cb.append(result);
        return result.length();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(new AdapterRandomChars(7));
        while(s.hasNextDouble())
            System.out.print(s.nextDouble() + " ");

    }
}
