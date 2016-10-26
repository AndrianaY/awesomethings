package eckel.listings.concurrency.evennumbers;

/**
 * Created by Andriana_Yarmoliuk on 10/24/2016.
 */
public class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;
    @Override
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + " from main");
        EvenChecker.test(new EvenGenerator());
    }
}
