package by.task1;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int opt = 0;

        System.out.print(" \"1\" for printing out \"Students\" ; \"2\" for printing out \"Customers\": ");
        if (sc.hasNextInt()) {
            opt = sc.nextInt();
        }

        if (opt == 1) {

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            LocalDate date;
            date = LocalDate.of(1985, Month.FEBRUARY,13);
            Student student = new Student(1, "Anton", "Khmyzov", "", date, "Minsk, Romanovskaya sloboda, 5",
                    "+123456", "Mexmat", "I");
            student.show();
            student.showDaysToBirthday();
        }

        if (opt == 2) {

            Customer customer = new Customer(1, "Fedor", "Sidorovich", "Petrov", "Minsk, Romanovskaya sloboda, 5"
                    ,"1234567898765432", "123456789987654321");
            customer.show();
            System.out.println("CardNumber hash Code: " + customer.cardHashCode());
        }

        //fraction
      /*  List<Fraction> fractionArrayList = new ArrayList<Fraction> ();

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
        }*/


    }
}
