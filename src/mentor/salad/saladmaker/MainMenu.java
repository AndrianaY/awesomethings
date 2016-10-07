package mentor.salad.saladmaker;

import mentor.salad.ingredients.Ingredient;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * Created by Andriana_Yarmoliuk on 10/6/2016.
 */
public class MainMenu extends Menu{
    private List<Salad> salads = new ArrayList<>();
    private Salad currentSalad;
    private Salad foundedSalad;
    private SaladMenu saladMenu;


    @Override
    public void display() {
        System.out.println("1 - create, 2 - switch to salad....");
    }

    public Menu performAction(String action){
        switch (action){
            case "1": createNewSalad(readData()); return currentMenu;
            case "2": switchToSalad(readData()); return currentMenu;
        }
        return currentMenu;
    }


    private void createNewSalad(String name){
        if (name.equals("smthng went wrong")) {
            System.out.println("please try again");//todo: via logger received from readData
        }
        else if(findByName(name)) {
            System.out.println("this salad already exists"); //todo: via logger
        }
        else {
            System.out.println("\"" + name + "\" salad was created");
            addSalad(new Salad(name));
            setCurretnSalad(salads.get(salads.size()-1));
            saladMenu = new SaladMenu(currentSalad);
            switchMenu(saladMenu);
        }

    }


    private void switchToSalad(String name){
        if (name.equals("smthng went wrong"))
            System.out.println("please try again");//todo: via logger received from readData
        else if (findByName(name)) {
            setCurretnSalad(foundedSalad);
            saladMenu = currentSalad.saladMenu;
            switchMenu(saladMenu);

        }
        else
            System.out.println("it doesnt exist"); //todo: log4j

    }

    private void setCurretnSalad(Salad salad){
        currentSalad = salad;
    }


    private boolean findByName(String name){
        for (Salad s:salads) {
            if(name.equals(s.getName())) {
                foundedSalad = s;
                return true;
            }
        }
        return false;
    }


    public void addSalad(Salad salad){
        salads.add(salad);

    }


}
