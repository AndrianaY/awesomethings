package mentor.salad;

import mentor.salad.saladmaker.SaladsManager;

import static mentor.salad.saladmaker.Menu.readData;

/**
 * Created by Andriana_Yarmoliuk on 10/7/2016.
 */
public class Execution {
    protected static SaladsManager sm = new SaladsManager();



    public static void main(String[] args) {
        sm.displayMenu();
        String action = readData();
        while(!action.equals("exit")){
            sm.performMenuAction(action);
            action = readData();
        }

    }

}
