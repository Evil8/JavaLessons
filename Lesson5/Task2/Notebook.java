package Task2;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/**
 * Created by Anton_Khmyzov on 3/2/2017.
 */
public class Notebook {
    private List<Record> records;
    public void addRecord(){

    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public Notebook(List<Record> records) {
        this.records = records;
    }

    public void deleteRecord(Record.Contact contact,String condition){
        Iterator<Record> iter = records.iterator();
        int match = 0;
        while(iter.hasNext()) {
            Record rec = iter.next();
            if (contact == Record.Contact.LastName
                    && rec.getLastName() == condition) {
                iter.remove();
                match= 1;
                continue;
            }
            if (contact == Record.Contact.FirstName
                    && rec.getFirstName() == condition) {
                match = 1;
                iter.remove();
                continue;
            }
        }
        if (match == 1){
            show();
        }
        else {
            System.out.println("Match not found; nothing removed - please try again");
        }
    }
    public void sort(Record.Contact contact){
        if (contact == Record.Contact.FirstName){
            Collections.sort(records, new RecordComparator.FirstNameComparartor());
            show();
            return;
        }
        if(contact == Record.Contact.LastName){
            Collections.sort(records, new RecordComparator.LastNameComparator());
            show();
           return;
        }

    }

    public void search(Record.Contact contact,String condition) {
        Iterator<Record> iter = records.iterator();
        int match = 0;
        Record rec = null;
        while (iter.hasNext()) {
            rec = iter.next();
            if (contact == Record.Contact.LastName
                    && rec.getLastName() == condition) {
               match = 1;
               break;
            }
            if (contact == Record.Contact.FirstName
                    && rec.getFirstName() == condition) {
                match = 1;
                break;
            }
        }
        if (match == 1)
        {
            show(rec);
        }else {
            System.out.println("Match not found - please try again");
        }

    }

    private void show(){
        for(Record rec : records){
            System.out.println(rec.toString());
        }
    }
    private void show(Record rec){
        System.out.println(rec.toString());
    }
}
