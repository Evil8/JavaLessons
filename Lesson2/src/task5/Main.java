package by.epam.task5;

import java.util.Scanner;

/**
 * Created by Anton_Khmyzov on 2/26/2017.
 */
public class Main {
    public static void main(String[] args){
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;


        Scanner sc = new Scanner(System.in);

        System.out.print("argument 1: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }

        System.out.print("argument 2: ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }

        System.out.print("argument 3: ");
        if (sc.hasNextDouble()) {
            c = sc.nextDouble();
        }

        System.out.print("argument 4: ");
        if (sc.hasNextDouble()) {
            d = sc.nextDouble();
        }

        double res = a + b + c + d;

        System.out.println(res + "- сумма четырех слагаемых");
    }
}
