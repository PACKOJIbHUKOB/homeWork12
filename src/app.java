
public class app {
    public static void main(String[] args) {
         Author lukyanenko = new Author("Сергей","Лукъяненко");
         Book labirintOtrazeniy= new Book(lukyanenko,"Лабиринт Отражений",1997 );
         Author perumov = new Author("Ник","Перумов");
         Book cherepNaRukove= new Book(perumov,"Череп на Рукове",1997 );
         cherepNaRukove.setAgeOfPublication(2002);
        System.out.printf("автор книги :%s\nНазвание книги: %s\nГод издания: %s\n",labirintOtrazeniy.getAuthor(),labirintOtrazeniy.getTitleBook(),labirintOtrazeniy.getAgeOfPublication());
        System.out.printf("автор книги :%s\nНазвание книги: %s\nГод издания: %s\n",cherepNaRukove.getAuthor(),cherepNaRukove.getTitleBook(),cherepNaRukove.getAgeOfPublication());
    }
}