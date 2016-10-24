package eckel.listings.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by Andriana_Yarmoliuk on 10/24/2016.
 */

class ExceptionThread2 implements Runnable{

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("run() by " + t);
        System.out.println("eh = " + t.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}
class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught " + e + " in " + t);
    }
}

class HandlerThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        System.out.println(this + " creating new thread");
        Thread t = new Thread(r);
        System.out.println("created " + t);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        System.out.println("eh = " + t.getUncaughtExceptionHandler());
        return t;
    }
}
public class CaptureUncaughtException {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(new HandlerThreadFactory());
        exec.execute(new ExceptionThread2());
    }
}
//output -  created Thread[Thread-1,5,main] - how was it made????
//        eckel.listings.concurrency.HandlerThreadFactory@7f31245a creating new thread
//        created Thread[Thread-0,5,main]
//        eh = eckel.listings.concurrency.MyUncaughtExceptionHandler@6d6f6e28
//        run() by Thread[Thread-0,5,main]
//        eh = eckel.listings.concurrency.MyUncaughtExceptionHandler@6d6f6e28
//        eckel.listings.concurrency.HandlerThreadFactory@7f31245a creating new thread
//        created Thread[Thread-1,5,main]
//        eh = eckel.listings.concurrency.MyUncaughtExceptionHandler@29057fb1
//        caught java.lang.RuntimeException in Thread[Thread-0,5,main]
