public class Book {
    private String author;
    private String titleBook;
    private int ageOfPublication;
    public Book(String author,String titleBook,int ageOfPublication){
        this.author=author;
        this.titleBook=titleBook;
        this.ageOfPublication=ageOfPublication;
    }
    public String getAutor() {
        return "автор книги: "+ author+"\n";
    }
    public String getTitleBook() {
        return "название книги: "+titleBook+"\n";
    }

    public int getAgeOfPublication() {
        return ageOfPublication;
    }

    public void setAgeOfPublication(int ageOfPublication) {
        this.ageOfPublication = ageOfPublication;
    }
}
