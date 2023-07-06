import java.util.Objects;

public class Book {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(),getTitleBook(),getAgeOfPublication());
    }

    private final Author author;
    private final String titleBook;
    private int ageOfPublication;
    public Book(Author author,String titleBook,int ageOfPublication){
        this.author=author;
        this.titleBook=titleBook;
        this.ageOfPublication=ageOfPublication;
    }
    public Author getAuthor() {
        return author;
    }

    public String getTitleBook() {
        return String.format("Назавание книги: %s\n",titleBook);
    }

    public String getAgeOfPublication() {
        return String.format("Год издания: %s\n",ageOfPublication);
    }
    public void setAgeOfPublication(int ageOfPublication) {
        this.ageOfPublication = ageOfPublication;
    }
}
