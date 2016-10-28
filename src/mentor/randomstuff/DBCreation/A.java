package mentor.randomstuff.DBCreation;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by Andriana_Yarmoliuk on 10/27/2016.
 */
class A {
    int x = 5;
    int f(int a) {
        int sum = a+x;

        return sum;
    }

}

class B extends A {
    int y = 10;


    int f(int s) {
        int mult = s*x;
        return mult;
    }
    int g(){
        Class clas = this.getClass();
        Queue q = new PriorityQueue();
        q = new LinkedList();
        Map<String, String>  map= new HashMap();
        Set set = map.entrySet();
        for (Map.Entry o:map.entrySet()) {
            o.getKey();
        }
        List l = new LinkedList();
        return x;

    }

}

class C {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        B b = new B();
        A a = b;         // здесь происходит формальное преобразование типа: B => A
        System.out.println(a.f(10) + "a");
        System.out.println(b.f(10) + "b");

        A a1 = a;
        System.out.println(a1.f(10)  + "a1");

        A a2 = new B();
        System.out.println(a2.f(100) + "a2");

        A a3 = new A();
        System.out.println(a3.f(100) + "a3");

        B b3 = new B();
        System.out.println(b3.f(100) + "b3");
        System.out.println(b3.g());

        Class c = java.lang.String.class;
        Class<Integer> c1 = int.class;
        Class<Integer> c2 = Integer.TYPE;
        Class c3 = a.getClass();
        Class c4 = Class.forName("java.lang.String");
        C ccc = new C();
        Class c5 = ccc.getClass();
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);




    }

}
