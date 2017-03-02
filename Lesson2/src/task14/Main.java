package by.epam.task14;

import java.util.Random;

/**
 * Created by Anton_Khmyzov on 2/26/2017.
 */
public class Main {
    public static void main(String[] args){
        Random rnd = new Random(100);
        double a = rnd.nextDouble();
        double b = rnd.nextDouble();
        double h = 0.1;
        double f = 0;

        if (a > b){
            double c = b;
            b = a;
            a = c;
        }

        for (double x = a; x <= b; x = x + h) {
            f = 2*Math.tan(x/2) + 1;
            System.out.println("x =  " + x + " " + "F(x)= " + f);
        }
    }
}
