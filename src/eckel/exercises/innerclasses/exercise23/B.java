package eckel.exercises.innerclasses.exercise23;

/**
 * Created by Andriana on 23.09.2016.
 */
public class B {
    private U[] us = new U[5];
    private static int i = 0;
    public void uSet(U u){
        us[i] = u;
        i++;
    }
    public void uDelete(int k){
        us[k] = null;
    }
    public void walkThroughU(){
        int k = 0;
        for (U u:us) {
            if (u == null)
                continue;
            System.out.println(k++ + "U methods");
            u.hashCode();
            u.printHashCode();
            u.thirdMethod();
        }
    }
}
