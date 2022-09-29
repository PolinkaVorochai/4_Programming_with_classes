package part_4.Task_9;


import java.util.ArrayList;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
 Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
  Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */
public class Books {
    /*метод вывода списка книг
    заданного автора*/

    public static void showThisAuthor(ArrayList<Book> books, String thisAuthor) {
        System.out.println("Книги автора " + thisAuthor + " : ");
        for (Book x : books) {
            if (thisAuthor.equals(x.getAuthor())) {
                System.out.println(x);
            }
        }
    }

    /*список книг, выпущенных
    заданным издательством
     */
    public static void showThisPublishingHouse(ArrayList<Book> books, String thisPublishingHouse) {
        System.out.println("Книги, выпущенные издательством " + thisPublishingHouse + ": ");
        for (Book x : books) {
            if (thisPublishingHouse == x.getPublishingHouse()) {
                System.out.println(x);
            } else continue;
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(new Book("978-5-8459-1759-1", "java", "Герберт Шилдт", "Oracle", 2019, 1025, "85 BYN", "твердая обложка"));
        bookArrayList.add(new Book("978-5-389-06623-6", "Маленькие женщины", "Луиза Мэй Олкотт", "Азбука-Классика", 2019, 326, "25 BYN", "мягкая обложка"));
        bookArrayList.add(new Book("978-5-17-123342-6", "Маленькая хозяйка большого дома", "Джек Лондон", "АСТ", 2018, 423, "19 BYN", "мягкая обложка"));
        bookArrayList.add(new Book("978-5-17-075250-8", "игра престолов", "Джордж Р.Р.Мартин", "Астрель", 2015, 956, "75 BYN", "твердая обложка"));

        Books.showThisAuthor(bookArrayList, "Джордж Р.Р.Мартин");
        Books.showThisPublishingHouse(bookArrayList, "Oracle");
        Books books = new Books();
        books.showListBooksAfterTheYear(bookArrayList, 2015);

    }

    /*список книг, выпущенных
    после заданного года
     */
    public void showListBooksAfterTheYear(ArrayList<Book> books, int theYear) {
        System.out.println("Книги, выпущенные после " + theYear + " года: ");
        for (Book x : books) {
            if (theYear < x.getTheYearOfPublishing()) {
                System.out.println(x);
            } else continue;
        }
    }
}
