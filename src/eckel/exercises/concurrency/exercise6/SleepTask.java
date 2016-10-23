package eckel.exercises.concurrency.exercise6;
//Exercise 6: (2) Create a task that sleeps for a random amount of time between 1 and 10
//        seconds, then displays its sleep time and exits. Create and run a quantity (given on the
//        command line) of these tasks.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by Andriana on 23.10.2016.
 */
public class SleepTask implements Runnable{
    private Random random = new Random();
    private static int count = 0;
    private final int id = ++count;

    public static void main(String[] args) {
        int counts = readData();
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < counts; i++){
            exec.execute(new SleepTask());
        }
        exec.shutdown();
    }

    public static int readData(){
        int i = 0;
        System.out.println("please enter amount of tasks");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            i = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public void run() {
        int i = random.nextInt(9) + 1;
        try {
            TimeUnit.SECONDS.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task # " + id + " was sleeping for a " + i + " seconds");
    }
}
