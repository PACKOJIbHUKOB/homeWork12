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

}
