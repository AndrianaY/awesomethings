package eckel.exercises.holdingobjects;
//(3) Create a generator class that produces character names (as String
//        objects) from your favorite movie (you can use Snow White or Star Wars as a fallback) each
//        time you call next( ), and loops around to the beginning of the character list when it runs out
//        of names. Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a
//        LinkedHashSet, and a TreeSet, then print each container.

import java.util.*;


/**
 * Created by Andriana_Yarmoliuk on 9/26/2016.
 */
public class Generator {
    private String[] names = new String[]{"JJ", "Derek", "Spencer", "Penelopa"};
    private int i = 0;
    private int k = 0;

    public Collection next(Collection<String> collection){
        int i = collection.size();
        if (i >= names.length)
            i = i - names.length;
        collection.add(names[i]);

        return collection;
    }
    public String[] next(String[] array){ //not sure if it will work properly if the method will called for more than 1 arrays simultaneously
        if (i >= names.length)
            i = i - names.length;
        array[k] = names[i];
        i++;
        k++;
        return array;
    }

    public static void main(String[] args) {
        Generator generator = new Generator();
        String[] strings = new String[6];

        for (int i = 0; i < strings.length; i++)
            generator.next(strings);
        for (String i:strings) {
            System.out.print(i + " ");
        }
        System.out.println();

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 6; i++)
            generator.next(arrayList);
        System.out.println(arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 6; i++)
            generator.next(linkedList);
        System.out.println(linkedList);

        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < 6; i++)
            generator.next(hashSet);
        System.out.println(hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < 6; i++)
            generator.next(linkedHashSet);
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        for (int i = 0; i < 6; i++)
            generator.next(treeSet);
        System.out.println(treeSet);

    }


}
