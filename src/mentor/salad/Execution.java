package mentor.salad;

import mentor.salad.saladmaker.Manager;

import static mentor.salad.saladmaker.Manager.readData;

/**
 * Created by Andriana_Yarmoliuk on 10/7/2016.
 */
public class Execution {
    protected static Manager sm = new Manager();

    public static void main(String[] args) {
        sm.displayMenu();
        String readedData = readData();
        while(!readedData.equals("exit")){
            sm.performMenuAction(readedData);
            readedData = readData();
        }
    }
}
