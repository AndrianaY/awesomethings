package eckel.exercises.concurrency;
//Exercise 5: (2) Modify Exercise 2 so that the task is a Callable that sums the values of
//        all the Fibonacci numbers. Create several tasks and display the results.
//        import eckel.listings.generics.Fibonacci;

import eckel.listings.generics.Fibonacci;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

/**
 * Created by Andriana_Yarmoliuk on 10/20/2016.
 */
public class FibonacciProducing implements Callable<Integer>{
    private static Fibonacci fibonacci = new Fibonacci();
    private static int count = 0;
    private final int id = ++count;
    private int capacity;
    public FibonacciProducing(int capacity){
        this.capacity = capacity;
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
        HashMap<Future<Integer>, FibonacciProducing> results = new HashMap<>(); //result, capacity
        for (int i = 1; i < 5; i++){
            fibPr = new FibonacciProducing(i);
            results.put(exec.submit(fibPr), fibPr);
        }
        for (Map.Entry <Future<Integer>, FibonacciProducing > res: results.entrySet()) {
            try {
                System.out.println("the sum of first " + res.getValue().getCapacity() + " fibonacci numbers in task #" + res.getValue().getId()+ " is: " + res.getKey().get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public Integer call() throws Exception {
        int fibNumber;
        int sum = 0;
        for (int i = 1; i < capacity +1; i++) {
            fibNumber = fibonacci.next();
            System.out.println("task " + id + ": " + i + " fibonacci number is: " + fibNumber);
            sum += fibNumber;
        }
        return sum;
    }
}
