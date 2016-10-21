package eckel.listings.concurrency;

import net.mindview.util.CountingGenerator;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by Andriana_Yarmoliuk on 10/21/2016.
 */

class TaskWithResult implements Callable<String>{
    private int id;
    public TaskWithResult(int id){
        this.id = id;
    }
    @Override
    public String call(){
        return "result of TaskWithResult " + id;
    }
}
public class CallableDemo{
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++)
            results.add(exec.submit(new TaskWithResult(i)));
        for(Future<String> fs : results)
            try{
                //get blocks untill completion
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.println(e);
            } catch (ExecutionException e) {
                System.out.println(e);
            }
            finally {
                exec.shutdown();
            }
    }
}
