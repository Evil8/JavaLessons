package by.epam.task6;

import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Created by Anton_Khmyzov on 2/26/2017.
 */
public class Main {
    public static void main(String[] args){
        double a = 0;
        double b = 0;
        double c = 0;


        Scanner sc = new Scanner(System.in);

        System.out.print("argument a: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }

        System.out.print("argument b: ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }

        System.out.print("argument c: ");
        if (sc.hasNextDouble()) {
            c = sc.nextDouble();
        }

        double res = pow(a, 2) - pow(b - c, 2) + Math.log(pow(b, 2) + 1);
        System.out.println(res + "- результат");

    }
}
