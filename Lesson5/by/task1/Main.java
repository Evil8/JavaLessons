package by.task1;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();

        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);


        for (int j = Calendar.JANUARY; j <= Calendar.DECEMBER; j++) {

            d.set(Calendar.DAY_OF_MONTH, 1);
            d.set(Calendar.MONTH, j);
            int maxNumberOfDays = d.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println("Вс Пн Вт Ср Чт Пт Сб");

            int weekday = d.get(Calendar.DAY_OF_WEEK);
            for (int i = Calendar.SUNDAY; i < weekday; i++)
                System.out.print("   ");
            int flag = 0;
            do {
                int day = d.get(Calendar.DAY_OF_MONTH);
                if (day < 10) System.out.print(" ");
                System.out.print(day);
                if (day == today & month == d.get(Calendar.MONTH))
                    System.out.print("*");
                else
                    System.out.print(" ");
                if (weekday == Calendar.SATURDAY)
                    System.out.println();

                d.add(Calendar.DAY_OF_MONTH, 1);
                weekday = d.get(Calendar.DAY_OF_WEEK);
                if (maxNumberOfDays == day)
                {
                    flag++;
                }
            } while ( flag != 1 );

            if (weekday != Calendar.SUNDAY)
                System.out.println();
        }
    }
}