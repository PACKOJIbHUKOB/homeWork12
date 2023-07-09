import java.util.Objects;

public class Author {
    private final String authorName;
    private final String authorSurname;
    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname=authorSurname;
    }
    @Override
    public String toString(){
        return String.format("Автор книги: %s %s\n", authorName, authorSurname);
    }
    @Override
    public boolean equals(Object o) {
        if (o==null) return false;
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorSurname, author.authorSurname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }

}
