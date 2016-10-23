package eckel.listings.concurrency;

import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

/**
 * Created by Andriana on 24.10.2016.
 */
//using a named inner class
class InnerThread1{
    private int countDown = 5;
    private Inner inner;
    private class Inner extends Thread{
        Inner(String name){
            super(name);
            start();
        }
        public void run(){
            try{
                while(true){
                    print(this);
                    if(--countDown == 0) return;
                    sleep(10);
                }
            }
            catch (InterruptedException ie){
                print("interrupted");
            }
        }
        public String toString(){
            return getName() + ": " + countDown;
        }
    }
    public InnerThread1(String name){
        inner = new Inner(name);
    }
}
//using an anonymous inner class
class InnerThread2{
    private int countDown = 5;
    private Thread t;
    public InnerThread2(String name){
        t = new Thread(name){
            public void run(){
                try{
                    while(true){
                        print(this);
                        if(--countDown == 0) return;
                        sleep(10);
                    }
                }
                catch (InterruptedException ie){
                    print("interrupted");
                }
            }
            public String toString(){
                return getName() + ": " + countDown;
            }
        };
        t.start();
    }
}

//using a named runnable implementation
class InnerRunnable1{
    private int countDown = 5;
    private Inner inner;
    private class Inner implements Runnable{
        Thread t;
        Inner(String name){
            t = new Thread(this, name);
            t.start();
        }
        @Override
        public void run() {
            try{
                while(true){
                    print(this);
                    if(--countDown == 0) return;
                    TimeUnit.MILLISECONDS.sleep(10);
                }
            }
            catch (InterruptedException ie){
                print("interrupted");
            }
        }
        public String toString(){
            return t.getName() + ": " + countDown;
        }
    }
    public InnerRunnable1(String name){
        inner = new Inner(name);
    }
}

//using an anonymous runnable implementation
class InnerRunnavle2{
    private int countDown = 5;
    private Thread t;
    public InnerRunnavle2(String name){
        t = new Thread(new Runnable(){
            public void run(){
                try{
                    while(true){
                        print(this);
                        if(--countDown == 0) return;
                        TimeUnit.MILLISECONDS.sleep(10);
                    }
                }
                catch (InterruptedException ie){
                    print("interrupted");
                }
            }
            public String toString(){
                return t.getName() + ": " + countDown;
            }
        }, name);
        t.start();
    }
}

//a separed method to run some code as a task
class ThreadMethod{
    private int countDown = 5;
    private Thread t;
    String name;
    public ThreadMethod(String name){
        this.name = name;
    }
    public void runTask(){
        if(t == null){
            t = new Thread(name){
                public void run(){
                    try{
                        while(true){
                            print(this);
                            if(--countDown == 0) return;
                            TimeUnit.MILLISECONDS.sleep(10);
                        }
                    }
                    catch (InterruptedException ie){
                        print("interrupted");
                    }
                }
                public String toString(){
                    return t.getName() + ": " + countDown;
                }
            };
            t.start();
        }
    }
}

public class ThreadVariations {
    public static void main(String[] args) {
        new InnerThread1("Innerthread1");
        new InnerThread2("innerthread2");
        new InnerRunnable1("innersunnble");
        new InnerRunnavle2("innerrunnable2");
        new ThreadMethod("threadmethod").runTask();
    }
}
