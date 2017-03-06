package Task2;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {

    public static void main(String[] args) {
        List<Record> records = new ArrayList<Record>();
        records.add(new Record("Ivan","Zvanov","+375291234567"
                ,"abc 12",LocalDate.of(1976,1,1)));
        records.add(new Record("Fedor","Kedorov","+375297654321"
                ,"def 12",LocalDate.of(1998,1,1)));
        records.add(new Record("Petr","Sidorov","+375295674214"
                ,"grt 13",LocalDate.of(1983,1,1)));
        Notebook notebook = new Notebook(records);
        //notebook.sort(Record.Contact.FirstName);
        //notebook.sort(Record.Contact.LastName);
        //notebook.search(Record.Contact.LastName,"Kedorov");
        //notebook.deleteRecord(Record.Contact.LastName,"Zvaov" );
    }
}
