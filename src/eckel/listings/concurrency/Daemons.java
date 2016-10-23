package eckel.listings.concurrency;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Created by Andriana on 23.10.2016.
 */

class Daemon implements Runnable{
    private Thread[] t = new Thread[10];
    @Override
    public void run() {
        print(Thread.currentThread() + " - daemon");
        for (int i = 0; i < t.length; i++){
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            print("DaemonSpawn " + i + " started, ");
        }
        for (int i = 0; i < t.length; i++)
            print("t[" + i + "].isDaemon() = " + t[i].isDaemon() + ", ");
        while(true)
            Thread.yield();
    }
}

class DaemonSpawn implements Runnable{

    @Override
    public void run() {
        print(Thread.currentThread() + " - daemon spawn");
        while (true)
            Thread.yield();
    }
}

public class Daemons {
    public static void main(String[] args) throws InterruptedException {
        print(Thread.currentThread() + " - main");
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        print("d.isDaemon() = " + d.isDaemon() + ", ");
        //Allow the daemon threads to finish their startup process
        TimeUnit.SECONDS.sleep(1);
    }
}
