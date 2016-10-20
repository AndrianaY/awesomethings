package eckel.exercises.concurrency;

import eckel.listings.generics.Fibonacci;

/**
 * Created by Andriana_Yarmoliuk on 10/20/2016.
 */
public class Exercise2 implements Runnable{
    private Fibonacci fibonacci = new Fibonacci();
    private int n;
    public Exercise2(int n){
        this.n = n;
    }
    @Override
    public void run() {
        for (int i = 0; i < n; i++){
            System.out.println(fibonacci.next());
            Thread.yield();
        }

    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Exercise2(5));
        thread.start();
    }


}
