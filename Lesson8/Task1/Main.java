package Task1;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {
    public static void main(String[] args){

        MySet<Integer> mySet2 = new MySet<>();

        System.out.println(mySet2.toString());


        mySet2.addElement(1);
        mySet2.addElement(1);
        mySet2.addElement(5);
        for (int i = 0; i < 20; i++) {
            Random rnd = new Random();
            mySet2.addElement(rnd.nextInt(30));
        }

        System.out.println(mySet2.toString());

    }
}