package by.epam.task10;

import java.util.Scanner;

/**
 * Created by Anton_Khmyzov on 2/26/2017.
 */
public class Main {
    public static void main(String[] args){
        int n = 0;
        int x1 = 0;
        int x2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("dimension n: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("double element a[" + i + "]: ");
            if (sc.hasNextDouble()) {
                double x = sc.nextDouble();

                if (Math.round(x) % 2 == 0) {
                    x1++;
                }

                if (Math.round(x) > 15) {
                    x2++;
                }
            }
        }

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

    }
}
