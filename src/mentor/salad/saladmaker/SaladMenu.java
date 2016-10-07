package mentor.salad.saladmaker;

import mentor.salad.ingredients.Ingredient;

import java.util.Comparator;
import java.util.Map;

/**
 * Created by Andriana_Yarmoliuk on 10/6/2016.
 */
public class SaladMenu extends Menu{
    private Salad salad;
    private MainMenu mainMenu;

    public SaladMenu(Salad salad){
        this.salad = salad;
    }

    @Override
    public void display() {
        System.out.println("1- return to main menu, 2 - make salad, 3 - sort salad, 4 - calc calories.....");
    }

    @Override
    public Menu performAction(String action) {
        switch (action){
            case "1": toMainMenu(); return currentMenu;
            case "2": makeSalad(salad.ingredients); return currentMenu;
            case "3": calculateCalories(); return currentMenu;

        }
        return currentMenu;
    }

    public void makeSalad(Map<Ingredient, Integer> ingredients){

    }
    public void sortSalad(Comparator<Ingredient> comparator){

    }
    public void calculateCalories(){    }

    public void toMainMenu(){
        switchMenu(prevMenu);
    }

}
