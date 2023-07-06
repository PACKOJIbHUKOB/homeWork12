
public class Main {


    public static void main() {
        Author lukyanenko = new Author("Сергей","Лукъяненко");
        Book labirintOtrazeniy= new Book(lukyanenko,"Лабиринт Отражений",1997 );
        Author perumov = new Author("Ник","Перумов");
        Book cherepNaRukove= new Book(perumov,"Череп на Рукове",1997 );
        cherepNaRukove.setAgeOfPublication(2002);
        Author sapkowski = new Author("Andrzej","Sapkowski");
        Book vedmak=new Book(sapkowski,"Ведьмак",1986);
    }
}