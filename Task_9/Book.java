package part_4.Task_9;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
 Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
  Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */
class Book {
    private String id;
    private String name;
    private String author;
    private String publishingHouse;
    private int theYearOfPublishing;
    private int numberOfPages;
    private String price;
    private String bindingType;

    public Book(String id, String name, String author, String publishingHouse,
                int theYearOfPublishing, int numberOfPages, String price, String bindingType) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.theYearOfPublishing = theYearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", theYearOfPublishing='" + theYearOfPublishing + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", price='" + price + '\'' +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setTheYearOfPublishing(int theYearOfPublishing) {
        this.theYearOfPublishing = theYearOfPublishing;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getTheYearOfPublishing() {
        return theYearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getPrice() {
        return price;
    }

    public String getBindingType() {
        return bindingType;
    }
}
