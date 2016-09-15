package eckel.exercises.controllingexecution;

/**
 * Created by Andriana on 31.08.2016.
 */
public class Exercise8 {
    public static void main(String[] args) {
        int i = 0;
        for(; i < 60; ) {
            switch (i) {
                case 0: i++;
                case 1: i++;
                case 2: i++;
                case 3:
                    i +=10;
                    break;
                default:
                    i += 50;
            }
        }
        System.out.println(i);
    }
}
