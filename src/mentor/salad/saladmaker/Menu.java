package mentor.salad.saladmaker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static mentor.salad.saladmaker.Manager.readData;

/**
 * Created by Andriana_Yarmoliuk on 10/6/2016.
 */
public abstract class Menu {

    protected static Menu currentMenu = new MainMenu();
    protected static Menu prevMenu;
    protected static Menu nextMenu;
    protected static String readedData;

    public void goToMenu(Menu menu){
        prevMenu = currentMenu;
        currentMenu = menu;
        currentMenu.display();
    }
    public Menu getCurrentMenu(){
        return currentMenu;
    }

    public abstract void display();
    public abstract void performAction(String action);

}
