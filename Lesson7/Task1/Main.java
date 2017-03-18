package Task1;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {

    public static void main(String[] args) {
      List<Task1.Writing> collection = new ArrayList<>();

      collection.add(new Poem("Sheakspear","Romeo n Juliet",  Poem.PoemGenre.Ballade));
      collection.add(new Poem("Pushkin","Freedom",  Poem.PoemGenre.Ode));
      collection.add(new Poem("Lermontov","Mziri", Poem.PoemGenre.Ballade));
      collection.add(new Poem("Lermontov","Borodino", Poem.PoemGenre.Ballade));
      collection.add(new Poem("Krylov","The Eagle and The Spider", Poem.PoemGenre.Fable));
      collection.add(new Poem("Moritake","The Falling Flower", Poem.PoemGenre.Haiku));

      Collection writingCol = new Collection("Collection","Classic Poems", Collection.Form.Book,collection);

      HashMap<String,String> exact = new HashMap<>();

      exact.put(Writing.WritingSearchProperty.Author.toString(),"Pushkin");
      exact.put(Writing.WritingSearchProperty.Title.toString(),"Freedom");
      exact.put(Writing.WritingSearchProperty.Genre.toString(), Poem.PoemGenre.Ode.toString());

    //  writingCol.find(Writing.WritingSearchProperty.Exact,exact);

      HashMap<String,String> author = new HashMap<>();
      author.put(Writing.WritingSearchProperty.Author.toString(),"Lermontov");

      //writingCol.find(Writing.WritingSearchProperty.Author,author);

      //writingCol.sort(Writing.WritingSearchProperty.Author);
      //writingCol.sort(Writing.WritingSearchProperty.Title);
      writingCol.sort(Writing.WritingSearchProperty.Genre);
    }
}
