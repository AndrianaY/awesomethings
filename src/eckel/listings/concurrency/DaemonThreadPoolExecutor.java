package eckel.listings.concurrency;

import java.util.concurrent.*;

/**
 * Created by Andriana on 23.10.2016.
 */
public class DaemonThreadPoolExecutor extends ThreadPoolExecutor {
    public DaemonThreadPoolExecutor() {
        super(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>(), new DaemonThreadFactory());
    }
}
