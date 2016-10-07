package mentor.salad.saladmaker;

import mentor.salad.ingredients.Ingredient;
import mentor.salad.initialization.UserProfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * Created by Andriana on 06.10.2016.
 */
public class SaladsManager {
    private MainMenu mainMenu = new MainMenu();

    private Menu currentMenu = mainMenu;



    public void performMenuAction(String menuAction){
        currentMenu = performAction(menuAction);
        setCurrentMenu();

    }

    private Menu performAction(String action){
        return currentMenu.performAction(action);
    }

    private void setCurrentMenu(){
        currentMenu = currentMenu.getCurrentMenu();
    }

    public void displayMenu(){
        currentMenu.display();
    }

}
