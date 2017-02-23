package by.task4;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws ParseException {
        List<Abiturient> abiturientList = new ArrayList<Abiturient>();

        Random rndId = new Random();
        Random rndMark = new Random();
        Random rnd = new Random();
        int k = rnd.nextInt(15); //number of abiturients
        int p = rnd.nextInt(15);//number of places

        for (int i = 0; i < k; i++) {
            List<Integer> abiturientMarks = new ArrayList<Integer>();
            for (int j = 0; j < 5; j++) {

                int mark = rndMark.nextInt(9);
                if (mark == 0 || mark == 1){
                    mark = 2;
                }
                abiturientMarks.add(mark);

            }
            abiturientList.add(i,new Abiturient(rndId.nextInt(100),abiturientMarks));
        }

        if(abiturientList.size() < p ){
            for(Abiturient abiturient : abiturientList) {
                System.out.println("AbiturientID who entered the university: " + abiturient.getAbiturientid());
            }
        }
    }
}