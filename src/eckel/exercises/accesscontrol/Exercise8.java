package eckel.exercises.accesscontrol;

/**
 * Created by Andriana_Yarmoliuk on 9/8/2016.
 */
public class Exercise8 {
    public static void main(String[] args) {
        Connection[] connections = ConnectionManager.getConnection(6);
        System.out.println(connections[5]);
    }
}
