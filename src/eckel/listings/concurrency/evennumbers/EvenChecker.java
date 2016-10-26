package eckel.listings.concurrency.evennumbers;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Andriana_Yarmoliuk on 10/24/2016.
 */
public class EvenChecker implements Runnable {
    private IntGenerator generator;
    private final int id;
    public EvenChecker(IntGenerator g, int ident){
        generator = g;
        id = ident;
    }
    @Override
    public void run() {
        while(!generator.isCanceled()){
            int val  = generator.next();
            if (val % 2 != 0) {
                System.out.println(val + " not even! - " + Thread.currentThread() + "id - " + id);
                generator.cancel();
            }
            else
                System.out.println(val + " is even!- " + Thread.currentThread() + "id - " + id);
        }
    }
    public static void test(IntGenerator gp, int count){
        System.out.println("press ctrl-c to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 1; i < count + 1; i++)
            exec.execute(new EvenChecker(gp, i));
        exec.shutdown();
    }
    public static void test(IntGenerator gp){
        test(gp, 20);
    }


    public static void main(String[] args) {
        test(new IntGenerator() {
            Random random = new Random();
            int next;
            @Override
            public int next() {
                next = random.nextInt();
                while(next % 2 != 0)
                    next = random.nextInt();
                return next;
            }
        });
    }
}
