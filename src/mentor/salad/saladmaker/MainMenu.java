package mentor.salad.saladmaker;

/**
 * Created by Andriana_Yarmoliuk on 10/6/2016.
 */
public class MainMenu extends Menu{
    @Override
    public void display() {
        System.out.println("1 - create, 2 - switch to salad....");
    }

    public void performAction(String action){
        switch (action){
            case "1": createNewSalad(readData());
            case "2":
        }
    }
    public void createNewSalad(String name){
        if (name.equals("smthng went wrong"))
            System.out.println("please try again");//todo: via logger received from readData
        else if(findByName(name))
            System.out.println("this salad already exists"); //todo: via logger
        else
            sm.addSalad(new Salad(name));

    }
    public void switchToSalad(String name){
        if (name.equals("smthng went wrong"))
            System.out.println("please try again");//todo: via logger received from readData
        else if (findByName(name))
            currentSalad = foundedSalad;
        else
            System.out.println("it doesnt exist"); //todo: log4j
        switchMenu(saladMenu);
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
    public static void main(String[] args) {
        sm.displayMenu();
        while(!readData().equals("exit")){

        }

    }

}
