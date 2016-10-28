package mentor.randomstuff;

/**
 * Created by Andriana_Yarmoliuk on 10/27/2016.
 */
public class B extends Main {
    String variable;

    public B(){
        System.out.println("variable value = " + variable);
    }

    protected void printVariable(){
        variable = "variable is initialized in B Class";
    }
}
