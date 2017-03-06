package Task2;

import java.util.Comparator;
/**
 * Created by Anton_Khmyzov on 3/4/2017.
 */
public class RecordComparator{
    static class LastNameComparator implements Comparator<Record> {
        @Override
        public int compare(Record o1, Record o2) {
            int compare = StringCompare(o1.getLastName(),o2.getLastName());
            return compare;

        }
    }
    static class FirstNameComparartor implements Comparator<Record>{

        @Override
        public int compare(Record o1, Record o2) {
            int compare = StringCompare(o1.getFirstName(),o2.getFirstName());
            return compare;
        }
    }

    private static int StringCompare(String str1,String str2){
        int compare = str1.compareTo(str2);
        if (compare > 0)
            return 1;
        else if (compare < 0)
            return -1;
        else
            return 0;
    }


}
