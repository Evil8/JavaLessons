package by.epam.task17;

import java.util.Random;

/**
 * Created by Anton_Khmyzov on 2/26/2017.
 */

public class Main {
    public static void main(String[] args){
        Random rnd = new Random(100);
        double value = rnd.nextDouble()*10;
        String output = String.format("f(%1$s) = " + f(value),value);
        System.out.println(output);

    }
    public static double f(double x){
        double z= 0;
        if (x <= -3) {
            z= 9;
        }
        else if (x > 3){
            z= 1/(x*x + 1);
        }
        else {

            System.out.println("value not defined - x > 3 and x <=-3; inputed x =" + x);
            z = Double.NaN;
        }
        return z;
    }
}
