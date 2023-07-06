
public class app {
    public static void main(String[] args) {
         Author lukyanenko = new Author("Сергей","Лукъяненко");
         Book labirintOtrazeniy= new Book(lukyanenko,"Лабиринт Отражений",1997 );
         Book prozrachnieVitrazi= new Book(lukyanenko,"Прозрачные витаражи",1999 );
         Author perumov = new Author("Ник","Перумов");
         Book cherepNaRukove= new Book(perumov,"Череп на Рукове",1997 );
         cherepNaRukove.setAgeOfPublication(2002);
        System.out.println(labirintOtrazeniy.getAuthor()+labirintOtrazeniy.getTitleBook()+labirintOtrazeniy.getAgeOfPublication()+"hashcode: "+labirintOtrazeniy.hashCode());
        System.out.println(prozrachnieVitrazi.getAuthor()+prozrachnieVitrazi.getTitleBook()+prozrachnieVitrazi.getAgeOfPublication()+"hashcode: "+prozrachnieVitrazi.hashCode());
        System.out.println(cherepNaRukove.getAuthor()+cherepNaRukove.getTitleBook()+cherepNaRukove.getAgeOfPublication()+"hashcode: "+cherepNaRukove.hashCode());
        System.out.println(labirintOtrazeniy.equals(prozrachnieVitrazi));
        System.out.println(labirintOtrazeniy.equals(cherepNaRukove));
    }
}