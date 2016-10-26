package eckel.exercises.concurrency.exercise11;

/**
 * Created by Andriana on 25.10.2016.
 */
public interface DataProducer {
    int produceValue();
    boolean isDataProper();
    public void printFields();
}
