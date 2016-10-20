package eckel.listings.generics;

import javassist.compiler.ast.Pair;

/**
 * Created by Andriana_Yarmoliuk on 10/20/2016.
 */
public class Fibonacci implements Generator<Integer> {
    private int count = 0;
    @Override
    public Integer next() {
        return fib(count++);
    }
    private int fib(int n){
        if(n < 2) return 1;
        return fib(n-2) + fib(n-1);
    }
}
