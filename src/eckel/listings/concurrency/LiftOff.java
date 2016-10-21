package eckel.listings.concurrency;

/**
 * Created by Andriana_Yarmoliuk on 10/20/2016.
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff(){}
    public LiftOff(int countDown){
        this.countDown = countDown;
    }
    public String status(){
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff") + "), ";
    }
    @Override
    public void run() {
        while (countDown >= 0){
            System.out.println(status());
            countDown--;
            Thread.yield();
        }
    }

//    public static void main(String[] args) {
//        Thread l = new Thread(new LiftOff(5));
//        l.start();
//        Thread l1 = new Thread(new LiftOff(7));
//        l1.start();
//        Thread l2 = new Thread(new LiftOff(3));
//        l2.start();
//        System.out.println("waing for liftout");
//    }
}
