package mentor.salad.daopattern.domain;

/**
 * Created by Andriana on 12.10.2016.
 */
public class User {
    private int id;
    private int number;
    private String firstName;
    private String lastName;
    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
