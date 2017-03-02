package by.epam.task13;

import java.util.Random;

/**
 * Created by Anton_Khmyzov on 2/26/2017.
 */
public class Main {
    public static void main(String[] args){
        Random rnd = new Random(100);
        double a = rnd.nextDouble();
        double b = rnd.nextDouble();
        double c = rnd.nextDouble();
        double d = rnd.nextDouble();
        double s1 = 0;
        double s2 = 0;

        if (a != 0) {
            s1 = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + b;
        }

        if (c != 0 && d != 0) {
            s2 = (a / c) * (b / d) - (a * b - c) / (c * d);
        }


        System.out.println("a =  " + a);
        System.out.println("b =  " + b);
        System.out.println("c =  " + c);
        System.out.println("d =  " + d);

        System.out.println("(b + Math.sqrt(b*b + 4*a*c)) / (2*a) - Math.pow(a, 3)*c + b =   " + s1);
        System.out.println("(a/c)*(b/d) - (a*b - c)/(c*d) =  " + s2);
    }
}
