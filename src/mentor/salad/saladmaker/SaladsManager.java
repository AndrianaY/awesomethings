package mentor.salad.saladmaker;

import mentor.salad.ingredients.Ingredient;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * Created by Andriana on 06.10.2016.
 */
public class SaladsManager {
    private List<Salad> salads = new ArrayList<>();
    private Salad current = salads.get(salads.size()-1);
    private Salad founded;

    public void createSalad(String name){
        if (findByName(name))
            System.out.println("this salad already exists"); //todo: via logger
        else
            salads.add(new Salad(name));
    }

    private boolean findByName(String name){
        for (Salad s:salads) {
            if(name.equals(s.getName())) {
                founded = s;
                return true;
            }
        }
        return false;
    }
    public void switchToSalad(String name){
        if (findByName(name))
            current = founded;
        else
            System.out.println("it doesnt exist"); //todo: log4j
    }
    public void makeSalad(Map<Ingredient, Integer> ingredients){
        current.makeSalad(ingredients);
    }
    public void sortSalad(Comparator<Ingredient> comparator){
        current.sortSalad(comparator);
    }
}
