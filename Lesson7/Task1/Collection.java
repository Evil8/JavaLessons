package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*класс реализующий сборник */

public class Collection {
    enum Form{
        Book,
        Journal,
        Newspaper
    }
    /*энум для будущей релизации поиска сборников*/
    public enum CollectionSearchProperty implements SearchProperty{
        Author,
        Title,
        Form,
        Exact
    }

    private List<Writing> writings;
    private String author;
    private String title;
    private Form form;

    public Collection(String author,String title,Form form, List<Writing> writings){
        this.author = author;
        this.form = form;
        this.writings = writings;
        this.title = title;
    }

    /*метод для поиска произведения*/
    public void find(SearchProperty searchProperty, HashMap<String,String> searchValues){
        List<Writing> resultWriting = new ArrayList<>();
        for(Writing writing : writings){
            if( (Writing.WritingSearchProperty.Exact.toString().equals(searchProperty.toString())
                        && writing.getAuthor().equals(searchValues.get("Author"))
                        && writing.getGenre().toString().equals(searchValues.get("Genre"))
                        && writing.getTitle().equals(searchValues.get("Title")) )||
                (Writing.WritingSearchProperty.Author.toString().equals(searchProperty.toString())
                    && writing.getAuthor().equals(searchValues.get("Author")))||
                (Writing.WritingSearchProperty.Title.toString().equals(searchProperty.toString())
                            && writing.getTitle().equals(searchValues.get("Title"))) ||
                (Writing.WritingSearchProperty.Genre.toString().equals(searchProperty.toString())
                            && writing.getGenre().toString().equals(searchValues.get("Genre")) )
              ){
                    resultWriting.add(writing);
            }
        }
        show(resultWriting);
    }

    public void sort(SearchProperty searchProperty){
        if(searchProperty.toString().equals(Writing.WritingSearchProperty.Author.toString())){
            Collections.sort(writings,new WritingComparator.AuthorComparator());

        } else if(searchProperty.toString().equals(Writing.WritingSearchProperty.Title.toString())){
            Collections.sort(writings,new WritingComparator.TitleComparator());

        } else if(searchProperty.toString().equals(Writing.WritingSearchProperty.Genre.toString())){
            Collections.sort(writings,new WritingComparator.GenreComparator());

        }
        show(writings);
    }

    public void show(Writing writing){
        if (writing == null){
            System.out.println("Not found");
        }else {
            System.out.println(writing.toString());
        }
    }

    public void show(List<Writing> writings){
        if (writings == null){
            System.out.println("Not found");
        }else {
            for (Writing writing : writings)
                System.out.println(writing.toString());
        }
    }
}

