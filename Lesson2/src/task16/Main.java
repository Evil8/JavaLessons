package by.epam.task16;

import java.util.Random;

/**
 * Created by Anton_Khmyzov on 2/26/2017.
 */
public class Main {
    public static void main(String[] args){
        Random rnd = new Random(100);
        int a = rnd.nextInt();
        int r = 5; //radius
        double len = 2*Math.PI*r; //length
        double area = Math.pow(Math.PI,2)*r; //area
        System.out.println(len + " - длина");
        System.out.println(area + " - площадь");

    }
}
