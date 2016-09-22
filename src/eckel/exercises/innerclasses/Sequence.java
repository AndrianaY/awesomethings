package eckel.exercises.innerclasses;
// Exercise 4: Add a method to the class Sequence.SequenceSelector that produces
//        the reference to the outer class Sequence
//Exercise 22: (2) Implement reverseSelector( ) in Sequence.java.
/**
 * Created by Andriana on 22.09.2016.
 */
//: innerclasses/Sequence.java
// Holds a sequence of Objects.


    interface Selector {
        boolean end();
        Object current();
        void next();
    }



    public class Sequence {
        private Object[] items;
        private int next = 0;
        public Sequence(int size) { items = new Object[size]; }
        public void add(Object x) {
            if(next < items.length)
                items[next++] = x;
        }
        private class SequenceSelector implements Selector {
            private int i = 0;
            public boolean end() { return i == items.length; }
            public Object current() { return items[i]; }
            public void next() { if(i < items.length) i++; }

            public Sequence outer(){
                return Sequence.this;
            }

        }
        private class ReverseSecuenceSelector implements Selector{
            private int i = items.length - 1;
            @Override
            public boolean end() {
                return i < 0;
            }

            @Override
            public Object current() {
                return items[i];
            }

            @Override
            public void next() {
                if(i >= 0) i--;
            }
        }

        public Selector selector() {
            return new SequenceSelector();
        }
        public Selector reverseSelector(){return new ReverseSecuenceSelector(); }
        public static void main(String[] args) {
            Sequence sequence = new Sequence(10);
            for(int i = 0; i < 10; i++)
                sequence.add(Integer.toString(i));
            Selector selector = sequence.selector();
            while(!selector.end()) {
                System.out.print(selector.current() + " ");
                selector.next();
            }
            Sequence sequenceReverse = new Sequence(10);
            for(int i = 0; i < 10; i++)
                sequenceReverse.add(Integer.toString(i));
            Selector selectorReverse = sequenceReverse.reverseSelector();
            while(!selectorReverse.end()) {
                System.out.print(selectorReverse.current() + " ");
                selectorReverse.next();
            }
        }
    } /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~

