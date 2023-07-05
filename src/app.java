
public class app {
    public static void main(String[] args) {
        Author lukyanenko =new Author("Сергей","Лукъяненко");;
        Book labirintOtrazeniy= new Book(lukyanenko.getAuthor(),"Лабиринт Отражений",1997 );
        Author perumov = new Author("Ник","Перумов");
        Book cherepNaRukove= new Book(perumov.getAuthor(),"Череп на Рукове",1997 );
        cherepNaRukove.setAgeOfPublication(2002);
        System.out.printf("%s %s Год издания: %s \n",labirintOtrazeniy.getAutor(),labirintOtrazeniy.getTitleBook(),labirintOtrazeniy.getAgeOfPublication());
        System.out.printf("%s %s Год издания: %s \n",cherepNaRukove.getAutor(),cherepNaRukove.getTitleBook(),cherepNaRukove.getAgeOfPublication());
    }
}