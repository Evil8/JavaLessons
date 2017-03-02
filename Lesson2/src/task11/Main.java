package by.epam.task11;

import java.util.Scanner;

/**
 * Created by Anton_Khmyzov on 2/26/2017.
 */
public class Main {
    public static void main(String[] args){
        int q = 0;
        int x = 0;
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int n = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("dimension n: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(" integer a[" + i + "]: ");
            if (sc.hasNextInt()) {
                x = sc.nextInt();

                if (x > 15 || x < 2) {
                    x1++;
                }

                if (x % 5 == 4) {
                    x2 = x2 + x;
                }
            }
        }

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
