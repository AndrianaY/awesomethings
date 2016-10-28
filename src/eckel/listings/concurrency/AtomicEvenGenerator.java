package eckel.listings.concurrency;

import eckel.listings.concurrency.evennumbers.EvenChecker;
import eckel.listings.concurrency.evennumbers.IntGenerator;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Andriana_Yarmoliuk on 10/26/2016.
 */
public class AtomicEvenGenerator extends IntGenerator{
    private AtomicInteger currentEvenValue = new AtomicInteger(0);
    @Override
    public int next() {
        return currentEvenValue.addAndGet(2);
    }

    public static void main(String[] args) {
        EvenChecker.test(new AtomicEvenGenerator());
    }
}
