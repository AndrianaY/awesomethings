package eckel.exercises.polymorphism.exercise17;
//(2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method to
//        Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast
//        them to an array of Cycle. Try to call balance( ) on each element of the array and observe
//        the results. Downcast and call balance( ) and observe what happens.
/**
 * Created by Andriana_Yarmoliuk on 9/14/2016.
 */
class Cycle {
    public void ride(){
        System.out.println("cycle riding");
    }
}

class Unicycle extends Cycle{
    public void ride(){
        System.out.println("unicycle riding");
    }
    public void balance(){
        System.out.println("unicycle balancing");
    }
}

class Bicycle extends Cycle{
    public void ride(){
        System.out.println("bicycle riding");
    }
    public void balance(){
        System.out.println("bicycle balancing");
    }
}

class Tricycle extends Cycle{
    public void ride(){
        System.out.println("tricycle riding");
    }
}

public class Exercise17{
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[]{new Bicycle(), new Unicycle(), new Tricycle()};
        for (Cycle c: cycles) {
            c.ride();
            try {
                Bicycle b = (Bicycle) c;
                b.balance();
            }
            catch (Exception e){
                System.out.println("classcastexeption at runtime");
            }
            try {
                Unicycle t = (Unicycle) c;
                t.balance();
            }
            catch (Exception e){
                System.out.println("classcastexeption at runtime");
            }
        }
    }
}


