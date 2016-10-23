package eckel.exercises.concurrency.exercise9;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//Exercise 9: (3) Modify SimplePriorities.java so that a custom ThreadFactory sets
//        the priorities of the threads.
/**
 * Created by Andriana on 24.10.2016.
 */
public class SimplePriorities implements Runnable {
    private int countDown = 5;
    private volatile double d;

    public String toString(){
        return Thread.currentThread() + ": " + countDown;
    }
    @Override
    public void run() {
//            //an expencive interruptable operation
//            for (int i = 0; i < 100000; i++){
//                d += (Math.PI + Math.E) / (double) i;
//                if(i % 1000 == 0)
//                    Thread.yield();
//            }
        while (true) {
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = new ThreadPoolRandPrioritiesExecutor();
        for (int i = 0; i < 5; i++)
            exec.execute(new SimplePriorities());
        System.out.println("starting threads");
        exec.shutdown();
    }
}