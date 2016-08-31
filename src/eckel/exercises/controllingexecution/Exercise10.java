package eckel.exercises.controllingexecution;

/**
 * Created by Andriana on 01.09.2016.
 */
public class Exercise10 {
    public static void main(String[] args) {
        int[] vN = new int[4];
        int firstHorn;
        int secHorn;
        int totalTest = 0;

        for (int i = 1000; i <= 9999; i++){
            firstHorn = i / 100;
            System.out.print(firstHorn + " * ");
            secHorn = i % 100;
            System.out.println(secHorn);

//            if((firstHorn * secHorn) == i ){
//                System.out.println(i + " is a vampire number");

                vN[0] = firstHorn / 10;
                vN[1] = firstHorn % 10;
                vN[2] = secHorn / 10;
                vN[3] = secHorn % 10;

                for(int k = 0; k < 4; k++){
                    for(int l = 0; l < 4; l ++){
                        if(l > 3)
                             l=0;
                        if(l == k)
                            l++;
                        for (int m = 0; m < 4; m++){
                            if(m > 3)
                                l=0;
                            if (m == k)
                                m++;
                            if (m == l)
                                m++;
                            for(int n = 0; n < 4; n++){
                                if(n > 3)
                                    l=0;
                                if(n == k)
                                    n++;
                                if(n == l)
                                    n++;
                                if (n == m)
                                    n++;
                                if(((vN[k] * 10 + vN[l]) * (vN[m] * 10 + vN[n]))== i)
                                    System.out.println(totalTest + ": " + vN[k] + vN[l] + vN[m] + vN[n]);
                            }
                        }
                    }
                }
//            }

        }
    }
}
