package Task1;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {

    public static void main(String[] args) {
      List<Writing> collection = new ArrayList<>();

      collection.add(new Poem("Sheakspear","Romeo n Juliet",  Poem.PoemGenre.BellesLettres));
      collection.add(new Poem("Pushkin","Onegin",  Poem.PoemGenre.BellesLettres));
      collection.add(new Poem("Lermontov","Mziri", Poem.PoemGenre.BellesLettres));
      collection.add(new Poem("Lermontov","Borodino", Poem.PoemGenre.BellesLettres));
      Collection writingCol = new Collection("Collection","Classic Poems", Collection.Form.Book,collection);

      HashMap<String,String> exact = new HashMap<>();

      exact.put(Writing.WritingSearchProperty.Author.toString(),"Pushkin");
      exact.put(Writing.WritingSearchProperty.Title.toString(),"Onegin");
      exact.put(Writing.WritingSearchProperty.Genre.toString(), Poem.PoemGenre.BellesLettres.toString());

      writingCol.find(Writing.WritingSearchProperty.Exact,exact);

      HashMap<String,String> author = new HashMap<>();
      author.put(Writing.WritingSearchProperty.Author.toString(),"Lermontov");

      writingCol.find(Writing.WritingSearchProperty.Author,author);
    }
}
