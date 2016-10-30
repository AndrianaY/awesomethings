package eckel.exercises.concurrency.exercise15_16;
//Exercise 15: (1) Create a class with three methods containing critical sections that all
//        synchronize on the same object. Create multiple tasks to demonstrate that only one of these
//        methods can run at a time. Now modify the methods so that each one synchronizes on a
//        different object and show that all three methods can be running at once.
//        Exercise 16: (1) Modify Exercise 15 to use explicit Lock objects.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Andriana on 27.10.2016.
 */
class ClassWithCritical{
    Object obj = new Object();
    Lock lock = new ReentrantLock();
    public void method1(){
        synchronized (obj) {
            for (int i = 0; i < 3; i++) {
                System.out.println("method1");
                Thread.yield();
            }
        }
    }
    public void method2(){
        synchronized (this) {
            for (int i = 0; i < 3; i++) {
                System.out.println("method2");
                Thread.yield();
            }
        }
    }
    public void method3(){
        lock.lock();
        try{
            for (int i = 0; i < 3; i++) {
                System.out.println("method3");
                Thread.yield();
            }
        }
        finally {
            lock.unlock();
        }
    }
}

class CriticalsTask1 implements Runnable{
    ClassWithCritical cl = new ClassWithCritical();
    @Override
    public void run() {
        cl.method1();
        Thread.yield();
    }
}

class CriticalsTask2 implements Runnable{
    ClassWithCritical cl = new ClassWithCritical();
    @Override
    public void run() {
        cl.method2();
        Thread.yield();
    }
}

class CriticalsTask3 implements Runnable{
    ClassWithCritical cl = new ClassWithCritical();
    @Override
    public void run() {
        cl.method3();
        Thread.yield();
    }
}

public class SomeClass {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
            executorService.execute(new CriticalsTask1());
            executorService.execute(new CriticalsTask2());
            executorService.execute(new CriticalsTask3());
        executorService.shutdown();
    }
}
