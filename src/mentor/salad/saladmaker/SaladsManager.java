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

    private List<Salad> salads = new ArrayList<>();
    private Salad currentSalad = salads.get(salads.size()-1);
    private Salad foundedSalad;
    private UserProfile userProfile;

    private SaladMenu saladMenu = currentSalad.saladMenu;





    public void makeSalad(Map<Ingredient, Integer> ingredients){
        currentSalad.makeSalad(ingredients);
    }
    public void sortSalad(Comparator<Ingredient> comparator){
        currentSalad.sortSalad(comparator);
    }
    public void calculateCalories(){    }

    public void addSalad(Salad salad){
        salads.add(salad);
        switchMenu(new SaladMenu());
    }


    public void displayMenu(){
        currentMenu.display();
    }

}
