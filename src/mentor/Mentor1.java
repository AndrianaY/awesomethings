package mentor;

import java.util.*;

/**
 * Created by Andriana_Yarmoliuk on 8/26/2016.
 */
public class Mentor1 {

    boolean[] b = new boolean[3];
    int count = 0;

    void set(boolean[] x, int i){
        x[i] = true;
        ++count;
    }

    void test(){

        if(b[0] && b[1] | b[2])
            count++;
        if(b[1] && b[(++count - 2)])
            count += 7;
        System.out.println("count = " + count);
    }

    public static void main(String[] args) {
        Mentor1 ba = new Mentor1();
        ba.set(ba.b, 0);
        ba.set(ba.b, 2);
        ba.test();
    }
}
