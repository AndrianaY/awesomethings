package mentor.salad.saladmaker;

import mentor.salad.ingredients.Ingredient;
import mentor.salad.ingredients.vegetables.Potatoe;

import static mentor.salad.saladmaker.Manager.readData;

/**
 * Created by Andriana on 08.10.2016.
 */
public class IngreadientsMenu extends Menu {
    Salad salad;
    IngreadientsMenu(Salad salad){
        this.salad = salad;
    }
    @Override
    public void display() {
        System.out.println("currently working with ingredients for" + salad.getName() + " salad");
        System.out.println("1- return to prev menu, 2 - add ingredient, 3 - find ingredient, 4 - sort ingredients, 5 - calc calories.....");
    }

    @Override
    public void performAction(String action) {
        switch (action){
            case "1": toPrevMenu(); return;
            case "2": addIngredient(); return;
            case "3": findIngredient(); return;
        }
    }
    private void toPrevMenu(){
        goToMenu(prevMenu);
    }
    private void addIngredient(){
        System.out.println("enter the name of ingredient");
        readedData = readData();
        salad.ingredients.put(new Potatoe(readData()), 50);
    }
    private void findIngredient(){
        System.out.println("enter ingredient to find");
        readedData = readData();

    }
}
