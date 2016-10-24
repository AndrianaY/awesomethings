package eckel.listings.concurrency;

import java.io.IOException;

/**
 * Created by Andriana_Yarmoliuk on 10/24/2016.
 */

class UnresponsiveUI{
    private volatile double d = 1;
    public UnresponsiveUI()throws Exception{
        while (d > 0)
            d = d + (Math.PI + Math.E) / d;
        System.in.read();
    }
}

public class ResponsiveUI extends Thread{
    private static volatile double d = 1;
    public ResponsiveUI(){
        setDaemon(true);
        start();
    }
    public void run(){
        while (true)
            d = d + (Math.PI + Math.E) / d;
    }

    public static void main(String[] args) throws Exception {
//        new UnresponsiveUI(); // must kill this process
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);
    }
}
