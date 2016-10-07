package mentor.salad.saladmaker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Andriana_Yarmoliuk on 10/6/2016.
 */
public abstract class Menu {

    protected static Menu currentMenu = new MainMenu();
    protected static Menu prevMenu;



    public void switchMenu(Menu menu){
        prevMenu = currentMenu;
        currentMenu = menu;
        currentMenu.display();
    }

    public Menu getCurrentMenu(){
        return currentMenu;
    }


    public static String readData(){
        System.out.println("please enter the data");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "smthng went wrong"; //todo: via logger
    }
    public abstract void display();
    public abstract Menu performAction(String action);

}
