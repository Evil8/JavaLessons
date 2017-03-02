package by.epam.task4;

import static java.lang.Math.pow;
import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.sqrt;

/**
 * Created by Anton_Khmyzov on 2/26/2017.
 */
public class Main {
    public static void main(String[] args) {
        double k1 = 2.0;
        double k2 = 3.0;

        double area = (1.0 / 2) * k1 * k2;
        double hypot = sqrt(pow(abs(k1), 2) + pow(abs(k2), 2));
        System.out.println(area + "- площадь треугольника");
        System.out.println(hypot + "- гипотенуза треугольника");

    }
}
