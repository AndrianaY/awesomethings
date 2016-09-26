package eckel.exercises.holdingobjects;
//Exercise 4: (3) Create a generator class that produces character names (as String
//        objects) from your favorite movie (you can use Snow White or Star Wars as a fallback) each
//        time you call next( ), and loops around to the beginning of the character list when it runs out
//        of names. Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a
//        LinkedHashSet, and a TreeSet, then print each container.

import eckel.exercises.innerclasses.exercise23.A;

import java.util.*;

/**
 * Created by Andriana on 26.09.2016.
 */
public class Generator {
    private static String[] names = new String[]{"JJ", "Morgan", "Spencer", "Penelopa", "Aaron"};
    private int i = 0;

    private void next(Collection<String> collection){
        collection.add(names[i]);
        if (i < names.length -1)
            i++;
        else
            i = 0;
    }

    private void next(String[] strings){
        int k = 0;
        strings[k] = names[i];
        if (i < names.length -1)
            i++;
        else
            i = 0;
    }

    public static void main(String[] args) {
        Generator generator = new Generator();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 6; i++)     generator.next(arrayList);
        String[] strings = new String[6];
        for (int i = 0; i < strings.length; i++)     generator.next(strings);
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 6; i++)     generator.next(linkedList);
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < 6; i++)     generator.next(hashSet);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < 6; i++)     generator.next(linkedHashSet);
        TreeSet<String> treeSet = new TreeSet<>();
        for (int i = 0; i < 6; i++)     generator.next(treeSet);
        System.out.println(arrayList);
        System.out.println(strings);
        System.out.println(linkedList);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);


    }

}
