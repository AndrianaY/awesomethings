package mentor.salad.saladmaker;

import mentor.salad.ingredients.Ingredient;
import mentor.salad.ingredients.vegetables.Vegetable;

import java.util.*;

/**
 * Created by Andriana on 06.10.2016.
 */
public class SaladMaker {
    Map<Ingredient, Integer> ingredients = new TreeMap<>();

    public void makeSalad(Map<Ingredient, Integer> ingredients){
        this.ingredients = ingredients;
    }

    public void sortSalad(Comparator<Ingredient> comparator){

    }
    public void calcCalories(){

    }
    public void findIngredientByCalories(int calories){

    }
    public void removeIngredientWithCaloriety(int calories){

    }
    public void addIngredient(Ingredient ingredient, int weight){
        if(!ingredients.keySet().contains(ingredient))
            ingredients.put(ingredient, weight);
        else{
            int prevWeight = ingredients.get(ingredient);
            ingredients.put(ingredient, (prevWeight + weight));
        }
    }

    public void removeIngredient(Ingredient ingredient){

    }
    public void decreaseIngredientWeightFor(Ingredient ingredient, int weight){
        if (ingredients.get(ingredient).equals(weight)){
            removeIngredient(ingredient);
        }
        else{

        }
    }
}
