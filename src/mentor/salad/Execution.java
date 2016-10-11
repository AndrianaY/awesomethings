package mentor.salad;

import mentor.salad.saladmaker.Controller;
import mentor.salad.saladmaker.MainMenu;

import static mentor.salad.saladmaker.Controller.readData;

/**
 * Created by Andriana_Yarmoliuk on 10/7/2016.
 */
public class Execution {
    protected static Controller mc = new Controller(MainMenu.getMainMenuInstance());

    public static void main(String[] args) {
        mc.displayControllerEntryPoint();
        String readedData = readData();
        while(!readedData.equals("exit")){
            mc.performMenuAction(readedData);
            readedData = readData();
        }
    }
}
