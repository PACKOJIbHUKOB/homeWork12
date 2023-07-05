
public class Main {


    public static void main() {
        Author lukyanenko = new Author("Сергей","Лукъяненко");
        Book labirintOtrazeniy= new Book(lukyanenko.getAuthor(),"Лабиринт Отражений",1997 );
        Author perumov = new Author("Ник","Перумов");
        Book cherepNaRukove= new Book(perumov.getAuthor(),"Череп на Рукове",1997 );
        cherepNaRukove.setAgeOfPublication(2002);
    }
}