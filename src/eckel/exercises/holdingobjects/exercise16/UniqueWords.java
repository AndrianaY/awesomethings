package eckel.exercises.holdingobjects.exercise16;
//(5) Create a Set of the symbols. Working from UniqueWords.Java, count
//        and display the number of symbols in each input word, and also display the total number of
//        symbols in the input file.
//: holding/UniqueWords.java
import java.util.*;
import net.mindview.util.*;

class SymbolsCounter{
    private final static Set<Character> symbols = new HashSet<>();
    private List<Character> word = new ArrayList<>();
    private int count = 0;
    private int totalSymbols = 0;

    public void setSymbolsToCount(Character[] characters){
        Collections.addAll(symbols, characters);
    }

    public int countSymbolsInWord(String s){
        count = 0;
        makeSetOfCharacters(s);
        for (Character ch:word) {
            if (symbols.contains(ch))
                count++;
        }
        totalSymbols = totalSymbols + count;
        return count;
    }

    public int getTotalSymbols() {
        return totalSymbols;
    }

    private Character[] wordToCharacter(String str){
        char[] charArray = str.toCharArray();
        Character[] characterArray = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            characterArray[i] = charArray[i];
        }

        return characterArray;
    }

    private void makeSetOfCharacters(String s){
        word.clear();
        Collections.addAll(word, wordToCharacter(s));
    }
}

public class UniqueWords {


    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>( //absolute path should be configured
                new TextFile("E:\\java\\activity\\awesomethings\\src\\eckel\\exercises\\holdingobjects\\exercise16\\SetOperations.java", "\\W+"));
        System.out.println(words);

        SymbolsCounter sc = new SymbolsCounter();
        sc.setSymbolsToCount(new Character[]{'a', 'o', 'u', 'i', 'e', 'A', 'O', 'U', 'I', 'E'});
        for (String s : words) {
            System.out.println(s + " contains " + sc.countSymbolsInWord(s) + " vowels");
        }
        System.out.println("in all file exist " + sc.getTotalSymbols() + " vowels");

    }


}
