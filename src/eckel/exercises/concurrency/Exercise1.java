package eckel.exercises.concurrency;

import javassist.bytecode.analysis.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Andriana_Yarmoliuk on 10/21/2016.
 */
public class Exercise1 implements Runnable {
    private String startM;
    private String shutDownM;
    public Exercise1(String startM, String shutDownM){
        this.startM = startM;
        this.shutDownM = shutDownM;
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(startM + ": count " + i);
            Thread.yield();
        }
        System.out.println(shutDownM);

    }

    public static void main(String[] args) {
//        for( int i = 0; i < 2; i++) {
//            Thread thread1 = new Thread(new Exercise1("hello" + i, "bye" + i));
//            thread1.start();
//        }
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 3; i++) {
            executorService.execute(new Exercise1("executor " + i + " hello", "executor " + i + " bye"));
        }
        executorService.shutdown();
    }

}
