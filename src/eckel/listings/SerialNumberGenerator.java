package eckel.listings;

/**
 * Created by Andriana_Yarmoliuk on 10/25/2016.
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;
    public static int nextSerialNumber(){
        return serialNumber++;
    }
}
