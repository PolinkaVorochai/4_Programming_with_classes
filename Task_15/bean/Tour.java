package part_4.Task_15.bean;

/*
Туристические путевки. Сформировать набор предложений клиенту по выбору
туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.)
для оптимального выбора.
Учитывать возможность выбора транспорта, питания и числа дней.
Реализовать выбор и сортировку путевок.
 */
public class Tour {
    private GoTo goTo;//Тур
    private Days days;//Количество дней
    private Transport transport;//Транспорт
    private Eat eat;//Еда
    private String excursions;//Экскурсии
    private Treatment treatment;//Лечение
    private Shop shop;//Шопинг
    private long price;//Стоимость
    private Hotel hotel;//Отель, количесвто звезд
    private Person person;//Количество людей
    private Cruise cruise;//Круиз

    public Tour(GoTo goTo, Days days, Transport transport, Eat eat, String excursions,
                Treatment treatment, Shop shop, long price, Hotel hotel,
                Person person, Cruise cruise) {
        this.goTo = goTo;
        this.days = days;
        this.transport = transport;
        this.eat = eat;
        this.excursions = excursions;
        this.treatment = treatment;
        this.shop = shop;
        this.price = price;
        this.hotel = hotel;
        this.person = person;
        this.cruise = cruise;
    }

    public GoTo getGoTo() {
        return goTo;
    }

    public void setGoTo(GoTo goTo) {
        this.goTo = goTo;
    }

    public Days getDays() {
        return days;
    }

    public void setDays(Days days) {
        this.days = days;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Eat getEat() {
        return eat;
    }

    public void setEat(Eat eat) {
        this.eat = eat;
    }

    public String getExcursions() {
        return excursions;
    }

    public void setExcursions(String excursions) {
        this.excursions = excursions;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Cruise getCruise() {
        return cruise;
    }

    public void setCruise(Cruise cruise) {
        this.cruise = cruise;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "goTo=" + goTo +
                ", days=" + days +
                ", transport=" + transport +
                ", eat=" + eat +
                ", excursions='" + excursions + '\'' +
                ", treatment=" + treatment +
                ", shop=" + shop +
                ", price=" + price +
                ", hotel=" + hotel +
                ", person=" + person +
                ", cruise=" + cruise +
                '}';
    }


}

