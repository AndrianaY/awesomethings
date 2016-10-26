package eckel.exercises.concurrency.exercise11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Andriana on 25.10.2016.
 */
public class ImpotrantDataCheckingTask implements Runnable{
    ImportandDataProducer data;
    public ImpotrantDataCheckingTask(ImportandDataProducer data){
        this.data = data;
    }
    private int lowerField = Integer.MIN_VALUE;
    private int biggerField = Integer.MAX_VALUE;
    @Override
    public void run() {
        while(true) {

            lowerField = data.swap();
            System.out.println("lower field is - " + lowerField + "; biggerField is - " + biggerField);
            Thread.yield();
            lowerField = data.swap();
            if (!(lowerField < biggerField)) {
                System.out.println("it is produced not correct data");
                return;
            }
        }

    }

    public static void test() {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new ImpotrantDataCheckingTask(new ImportandDataProducer()));
        exec.shutdown();
    }
}
