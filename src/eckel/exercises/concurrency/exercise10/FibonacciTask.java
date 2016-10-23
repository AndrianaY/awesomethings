package eckel.exercises.concurrency.exercise10;

import eckel.exercises.concurrency.exercise5.FibonacciProducing;
import eckel.listings.generics.Fibonacci;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Andriana on 24.10.2016.
 */
public class FibonacciTask {
    private FibonacciProducing fPr;
    private Future<FibonacciProducing> future;
    public Future<FibonacciProducing> runTask(int capacity) throws ExecutionException, InterruptedException {
        fPr = new FibonacciProducing(capacity);
        ExecutorService exec = Executors.newCachedThreadPool();
        future = exec.submit(fPr);

        System.out.println("**********sout inside task " + future.get().getId() + ": the sum of first " + future.get().getCapacity() + " fibonacci numbers is: " +
                future.get().getSum() + "****" + Thread.currentThread());

        exec.shutdown();
        return future;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FibonacciProducing fp = new FibonacciTask().runTask(5).get();
        System.out.println("task " + fp.getId() + ": the sum of first " + fp.getCapacity() + " fibonacci numbers is: " +
                fp.getSum() + "****" + Thread.currentThread());
        FibonacciProducing fp1 = new FibonacciTask().runTask(3).get();
        System.out.println("task " + fp1.getId() + ": the sum of first " + fp1.getCapacity() + " fibonacci numbers is: " +
                fp1.getSum()+ "****" + Thread.currentThread());
    }

}
