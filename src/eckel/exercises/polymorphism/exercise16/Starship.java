package eckel.exercises.polymorphism.exercise16;
//(3) Following the example in Transmogrify.java, create a Starship class
//containing an AlertStatus reference that can indicate three different states. Include
//        methods to change the states.
/**
 * Created by Andriana_Yarmoliuk on 9/14/2016.
 */
enum Statuses{
    R, W, E;
    public Status getStatus(){
        switch (this){
            case R: return new ReadyStatus();
            case W: return new WarningStatus();
            case E: return new FatalErrorStatus();
            default: return new Status();
        }
    }
}

class Status{
    public void printStatus(){
        System.out.println("State is not defined");
    }
}

class ReadyStatus extends Status{
    public void printStatus(){
        System.out.println("In ready state");
    }
}

class WarningStatus extends Status{
    public void printStatus(){
        System.out.println("Warning!");
    }
}

class FatalErrorStatus extends Status{
    public void printStatus(){
        System.out.println("Fatal error! Interrupted state");
    }
}

class AlertStatus{
    private Status status = Statuses.R.getStatus();
    public void changeStatus(Statuses statuses){
        status = statuses.getStatus();
    }
    public void displayStatus(){
        status.printStatus();
    }

}

public class Starship {
    public static void main(String[] args) {
        AlertStatus as = new AlertStatus();
        as.displayStatus();
        as.changeStatus(Statuses.E);
        as.displayStatus();
        as.changeStatus(Statuses.W);
        as.displayStatus();
    }
}
