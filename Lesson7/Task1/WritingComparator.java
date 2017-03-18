package Task1;

import java.util.Comparator;

/**
 * Created by Anton_Khmyzov on 3/18/2017.
 */
public class WritingComparator {
    static class AuthorComparator implements Comparator<Writing>{
        @Override
        public int compare(Writing o1, Writing o2){
           return StringCompare(o1.getAuthor(),o2.getAuthor());

        }

    }

    static class TitleComparator implements Comparator<Writing>{
        @Override
        public int compare(Writing o1, Writing o2){

            return StringCompare(o1.getTitle(),o2.getTitle());
        }

    }
    static class GenreComparator implements Comparator<Writing>{
        @Override
        public int compare(Writing o1, Writing o2){
            return StringCompare(o1.getGenre().toString(),o2.getGenre().toString());
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
