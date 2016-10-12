package mentor.randomstuff;

/**
 * Created by Andriana on 28.09.2016.
 */
public class X {
    String name;
    public X(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        X x = new X("x");
        System.out.println("x: " + x.name);
        X x2 = m1(x);
        System.out.println("x: " + x.name);
        System.out.println("x2: " + x2.name);
        X x4 = new X("x4");
        System.out.println("x4: " + x4.name);
        x2 = x4;
        System.out.println("x2: " + x2.name);
        X x5 = new X("x5");
        X x6 = new X("x6");
        swap(x5, x6);
        System.out.println("x5: " + x5.name + " x6: " + x6.name);
    }
    public static void swap(X x1, X x2){
        X temp = x1;
        x1 = x2;
        x2 = temp;
    }
    static X m1(X mx){
        mx = new X("mx");
//        mx.name = "modified";
        return mx;
    }
}
