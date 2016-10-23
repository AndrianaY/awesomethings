package eckel.listings.concurrency;

import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

/**
 * Created by Andriana on 24.10.2016.
 */
class ADaemon implements Runnable {
    @Override
    public void run() {
        try{
            print("Staring ADaemon");
            TimeUnit.SECONDS.sleep(1);
        }
        catch (InterruptedException ie){
            print("exititng via interrupted exeption");
        }
        finally {
            print("this should always run?");
        }
    }
}
public class DaemonsDontRunFinally{
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
        TimeUnit.MILLISECONDS.sleep(100);
    }
}
