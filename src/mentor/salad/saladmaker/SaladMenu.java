package mentor.salad.saladmaker;

/**
 * Created by Andriana_Yarmoliuk on 10/6/2016.
 */
public class SaladMenu extends Menu{
    private Salad salad;

    public SaladMenu(Salad salad){
        this.salad = salad;
    }
    @Override
    public void display() {
        System.out.println("currently working with " + salad.getName() + " salad");
        System.out.println("1- return to main menu, 2 - go to choosing ingredients, 3 - make salad, 4 - sort salad, 5 - calc calories.....");
    }
    @Override
    public void performAction(String action) {
        switch (action){
            case "1": toMainMenu(); return;
            case "2": goToIngredients(); return;
            case "3": makeSalad(); return;
        }
    }
    private void toMainMenu(){
        goToMenu(prevMenu);
    }
    private void goToIngredients(){
        goToMenu(new IngreadientsMenu(salad));
    }
    private void makeSalad(){
        salad.makeSalad();
        display();
    }

}
