package eckel.exercises.concurrency.exercise9;

import java.util.Random;
import java.util.concurrent.ThreadFactory;

/**
 * Created by Andriana on 24.10.2016.
 */
public class ThreadFactoryRandPriorities implements ThreadFactory {
    private Random random = new Random();
    private int priority;
    @Override
    public Thread newThread(Runnable r) {
        priority = random.nextInt(9) + 1;
        Thread t = new Thread(r);
        t.setPriority(priority);
        return t;
    }
}
