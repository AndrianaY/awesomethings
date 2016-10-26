package eckel.exercises.concurrency.exercise11;

/**
 * Created by Andriana on 25.10.2016.
 */
//Exercise 11: (3) Create a class containing two data fields, and a method that manipulates
//        those fields in a multistep process so that, during the execution of that method, those fields
//        are in an "improper state" (according to some definition that you establish). Add methods to
//        read the fields, and create multiple threads to call the various methods and show that the
//        data is visible in its "improper state." Fix the problem using the synchronized keyword.
public class ImportandDataProducer implements DataProducer{
    public int getLowerField() {
        return lowerField;
    }

    public int getBiggerField() {
        return biggerField;
    }

    private static int lowerField = Integer.MIN_VALUE;
    private static int biggerField = Integer.MAX_VALUE;
    private int temp;

    public int produceValue(){

        return 0;
    }

    public int swap(){
        temp = lowerField;
        lowerField = biggerField;
        lowerField = temp;
        return lowerField;
    }
    public boolean isDataProper(){
        return lowerField < biggerField;
    }

    @Override
    public void printFields() {
        System.out.println("lower field is - " + lowerField + "; biggerField is - " + biggerField);
    }

    public static void main(String[] args) {
        ImpotrantDataCheckingTask.test();
    }
}