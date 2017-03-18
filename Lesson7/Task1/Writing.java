package Task1;

/**
 * абстрактный класс реализующий произведение.
 * Иерархия:    произведение
 *              /         \
 *           Проза      Поэма
 */
public abstract class Writing {

    private String author;
    private String title;
    private Genre genre;

    public Writing(String author, String title, Genre genre) {
        this.author = author;
        this.title = title;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Writing{" +
                "author='" + getAuthor() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", genre=" + getGenre() +
                '}';
    }

    public enum WritingSearchProperty implements SearchProperty{
        Author,
        Title,
        Exact,
        Genre,
     }
}
