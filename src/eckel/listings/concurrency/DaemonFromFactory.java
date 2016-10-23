package eckel.listings.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

/**
 * Created by Andriana on 23.10.2016.
 */
public class DaemonFromFactory implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                print(Thread.currentThread() + " " + this);
            }
        }
        catch (InterruptedException ie){
            print("Interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = new DaemonThreadPoolExecutor();
        for (int i = 0; i < 10; i++)
            exec.execute(new DaemonFromFactory());
        print("All daemons started");
        TimeUnit.MILLISECONDS.sleep(500);
    }
}
