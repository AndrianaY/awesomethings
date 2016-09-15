package eckel.exercises.reusingclasses.exercise1617;

/**
 * Created by Andriana on 12.09.2016.
 */
public abstract class Amphibian {
//    public static void breath(Amphibian amphibian){
//        System.out.println(amphibian + " can breath");
//    }

    public abstract void breath(Amphibian amphibian);

    public String toString(){
        return this.getClass().getSimpleName();
    }

}
