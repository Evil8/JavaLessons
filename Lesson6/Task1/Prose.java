package Task1;

/**
 * Created by Anton_Khmyzov on 3/6/2017.
 */
public class Prose extends Writing {
    public Prose(String author,String title,ProseGenre genre){
        super(author,title,genre);
    }

    @Override
    public String toString(){
        return "Prose{" + super.toString() + "}";

    }
    enum ProseGenre implements Genre{
        BellesLettres,
        Science,
        Thriller
    }
}
