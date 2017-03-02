package by.epam.task8;

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

        double s = 0;
        double s1 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("argument a : ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }

        System.out.print("argument b : ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }

        if (a == b) {
            System.out.println("Скоро Новый год!!!");
        } else {
            System.out.print("argument с : ");
            if (sc.hasNextDouble()) {
                c = sc.nextDouble();
            }
            s = a + b + c;
            s1 = pow(a, 2) + pow(b, 2);
            System.out.println("(a + b + c) = " + s);
            System.out.println("(a^2 + b^2) = " + s1);
            System.out.println("Моя любимая футбольная команда ");
        }
    }
}
