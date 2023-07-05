public class Book {
    private Author author;
    private String titleBook;
    private int ageOfPublication;
    public Book(Author author,String titleBook,int ageOfPublication){
        this.author=author;
        this.titleBook=titleBook;
        this.ageOfPublication=ageOfPublication;
    }
    public String getAuthor() {
        return ""+author;
    }
    public String getTitleBook() {
        return titleBook;
    }
    public int getAgeOfPublication() {

        return ageOfPublication;
    }
    public void setAgeOfPublication(int ageOfPublication) {
        this.ageOfPublication = ageOfPublication;
    }
}
