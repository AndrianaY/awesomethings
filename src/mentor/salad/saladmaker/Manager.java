package mentor.salad.saladmaker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Andriana on 06.10.2016.
 */
public class Manager {
    private Menu currentManagerMenu = new MainMenu();

    public void performMenuAction(String action){
        currentManagerMenu.performAction(action);
        setCurrentManagerMenu();

    }
    private void setCurrentManagerMenu(){
        currentManagerMenu = currentManagerMenu.getCurrentMenu();
    }
    public void displayMenu(){
        currentManagerMenu.display();
    }
    public static String readData(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return  br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "smthng went wrong"; //todo: via logger
    }


}
