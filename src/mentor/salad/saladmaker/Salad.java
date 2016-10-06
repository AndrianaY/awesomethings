package mentor.salad.saladmaker;

import mentor.salad.ingredients.Ingredient;
import mentor.salad.ingredients.vegetables.Vegetable;

import java.io.Serializable;
import java.util.*;

/**
 * Created by Andriana on 06.10.2016.
 */
public class Salad implements Serializable {
    public Salad(String name){
        this.name = name;
    }
    Map<Ingredient, Integer> ingredients = new TreeMap<>();
    private String name;
    public SaladMenu saladMenu;

    String getName(){
        return name;
    }
    public void toMainMenu(){}

    public void makeSalad(Map<Ingredient, Integer> ingredients){
        this.ingredients = ingredients;
    }

    public void sortSalad(Comparator<Ingredient> comparator){
        System.out.println("sorting " + name + " salad");
    }
    public void calcCalories(){

    }
    public void findIngredientByCalories(int calories){

    }
    public void findIngredientByCalories(int smallerCalorie, int biggerCalorie){

    }
    public void removeIngredientWithCaloriety(int calories){

    }
    public void removeIngredientWithCaloriety(int smallerCalorie, int biggerCalorie){

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
