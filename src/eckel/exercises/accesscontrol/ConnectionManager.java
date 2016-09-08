package eckel.exercises.accesscontrol;
//(4) Following the form of the example Lunch.java, create a class called
//        ConnectionManager that manages a fixed array of Connection objects. The client
//        programmer must not be able to explicitly create Connection objects, but can only get them
//        via a static method in ConnectionManager. When the ConnectionManager runs out of
//        objects, it returns a null reference. Test the classes in main( ).
//

/**
 * Created by Andriana_Yarmoliuk on 9/8/2016.
 */

class Connection{
    private Connection(int p){
        System.out.println("Connection " + p);
    }
    static Connection makeConnection(int p){
        return new Connection(p);
    }
}

public class ConnectionManager {
    public static Connection[] getConnection(int size){
        Connection[] connections = new Connection[size];
        int poolSize = 5;
        for (int i = 0; i < size; i++){
            if (i < poolSize){
                connections[i] = Connection.makeConnection(i);
            }
            else
                connections[i] = null;
        }
        return connections;
    }
}
