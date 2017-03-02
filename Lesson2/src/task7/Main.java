package by.epam.task7;

import java.util.Scanner;

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

        if (a > b) {
            System.out.print("argument c: ");
            if (sc.hasNextDouble()) {
                c = sc.nextDouble();
            }
            System.out.print(b + c);
        } else if (a == b) {
            System.out.print("Конец");
        } else {
            System.out.print("argument c: ");
            if (sc.hasNextInt()) {
                c = sc.nextInt();
            }
            double s = a + b + c;
            System.out.println("a + b + c = " + s);
            System.out.println("Новый Год!");
        }

    }
}
