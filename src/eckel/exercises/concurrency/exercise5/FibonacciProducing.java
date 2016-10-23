package eckel.exercises.concurrency.exercise5;
//Exercise 5: (2) Modify Exercise 2 so that the task is a Callable that sums the values of
//        all the Fibonacci numbers. Create several tasks and display the results.
//        import eckel.listings.generics.Fibonacci;

import eckel.listings.generics.Fibonacci;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by Andriana_Yarmoliuk on 10/20/2016.
 */
public class FibonacciProducing implements Callable<FibonacciProducing>{
    private Fibonacci fibonacci = new Fibonacci();
    private static int count = 0;
    private final int id = ++count;
    private int capacity;
    private int sum;
    public FibonacciProducing(int capacity){
        this.capacity = capacity;
    }
    public int getSum(){
        return sum;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getId(){
        return id;
    }

    public static void main(String[] args) {
        FibonacciProducing fibPr;
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<FibonacciProducing>> results = new ArrayList<>(); //result, capacity
        for (int i = 1; i < 5; i++){
            fibPr = new FibonacciProducing(i);
            results.add(exec.submit(fibPr));
        }
        for (Future<FibonacciProducing> fb: results) {
            try {
                System.out.println("the sum of first " + fb.get().getCapacity() + " fibonacci numbers in task #" + fb.get().getId()+ " is: " + fb.get().getSum());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        exec.shutdown();
    }

    @Override
    public FibonacciProducing call(){
        int fibNumber;
        for (int i = 1; i < capacity +1; i++) {
            fibNumber = fibonacci.next();
            System.out.println("task " + id + ": " + i + " fibonacci number is: " + fibNumber + "****" + Thread.currentThread());
            sum += fibNumber;
        }
        return this;
    }
}
