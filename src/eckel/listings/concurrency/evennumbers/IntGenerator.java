package eckel.listings.concurrency.evennumbers;

/**
 * Created by Andriana_Yarmoliuk on 10/24/2016.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancel(){
        canceled = true;
    }
    public boolean isCanceled(){
        return canceled;
    }
}
