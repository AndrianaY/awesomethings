package eckel.listings.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Andriana_Yarmoliuk on 10/21/2016.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i< 5; i++)
            executorService.execute(new LiftOff());
        executorService.shutdown();
    }
}
