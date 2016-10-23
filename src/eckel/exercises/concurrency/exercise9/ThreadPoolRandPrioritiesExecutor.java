package eckel.exercises.concurrency.exercise9;

import eckel.listings.concurrency.DaemonThreadFactory;

import java.util.concurrent.*;

/**
 * Created by Andriana on 24.10.2016.
 */
public class ThreadPoolRandPrioritiesExecutor extends ThreadPoolExecutor {
    public ThreadPoolRandPrioritiesExecutor() {
        super(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>(), new ThreadFactoryRandPriorities());
    }
}
