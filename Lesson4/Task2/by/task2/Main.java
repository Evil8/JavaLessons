package by.task2;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {

    public static void main(String[] args) throws ParseException {
        List<Fraction> fractionArrayList = new ArrayList<Fraction> ();

        int k = 5;
        Random rnd = new Random();
        for(int i = 0;i < k; i++)
        {
            int n = rnd.nextInt(100);
            int d = (rnd.nextInt(100) == 0) ? rnd.nextInt(100) : rnd.nextInt(100);
            fractionArrayList.add(new Fraction(n,d));
        }
        for(Fraction fraction : fractionArrayList){
            fraction.show();
        }


    }
}
