public class Author {
    private String authorName;
    private String authorSurname;
    private String author;
    public Author(String authorName, String authorSurname) {
        this.author=String.format("%s %s",authorName,authorSurname);
    }
    public String getAuthor() {
        return author;
    }


}
