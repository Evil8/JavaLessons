package by.epam.task15;

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

        if (a < 0) {
            a = Math.pow(a, 4);
        }
        else {
            a = Math.pow(a, 2);
        }

        if (b < 0) {
            b = Math.pow(b, 4);
        }
        else {
            b = Math.pow(b, 2);
        }

        if (c < 0) {
            c = Math.pow(c, 4);
        }
        else {
            c = Math.pow(c, 2);
        }

        System.out.println("a =  " + a);
        System.out.println("b =  " + b);
        System.out.println("c =  " + c);
    }

}
