package Task1;

public class Poem extends Writing {


    public Poem(String author,String title,PoemGenre genre){
        super(author, title, genre);
    }

    @Override
    public String toString() {
        return "Poem{"+super.toString()+"}";
    }

    enum PoemGenre implements Genre{
        BellesLettres,
        Fable,
    }
}
