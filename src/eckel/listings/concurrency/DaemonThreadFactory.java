package eckel.listings.concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * Created by Andriana on 23.10.2016.
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
