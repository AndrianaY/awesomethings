package mentor.salad.saladmaker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Andriana_Yarmoliuk on 10/6/2016.
 */
public abstract class Menu {
    protected static SaladsManager sm = new SaladsManager();
    protected static Menu current = new MainMenu();


    public void switchMenu(Menu menu){
        current = menu;
    }
    public static String readData(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "smthng went wrong"; //todo: via logger
    }
    public abstract void display();
    public abstract void performAction(String action);

}
