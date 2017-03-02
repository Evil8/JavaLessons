package by.epam.task9;

import java.util.Scanner;

/**
 * Created by Anton_Khmyzov on 2/26/2017.
 */
public class Main {
    public static void main(String[] args){
        int n = 0;

        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("dimension n : ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            System.out.print(" int element a[" + i + "]: ");
            if (sc.hasNextInt()) {
                int x = sc.nextInt();

                if (x % 2 == 0) {
                    x1++;
                }

                if (x % 3 == 0) {
                    x2 = x2 + x;
                }

                if (Math.abs(x) < 3) {
                    x3++;
                }
            }
        }

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("x3 = " + x3);

    }
}
