package part_4.Task_8;
//Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

class Customer {
    int id;//number phone
    String surname;
    String name;
    String patronymic;
    String address;
    long numberOfCreditCard;
    String numberBankCheck;

    public Customer(int id, String surname, String name, String patronymic, String address, long numberOfCreditCard, String numberBankCheck) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.numberBankCheck = numberBankCheck;
        this.numberOfCreditCard = numberOfCreditCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNumberOfCreditCard() {
        return numberOfCreditCard;
    }

    public void setNumberOfCreditCard(long numberOfCreditCard) {
        this.numberOfCreditCard = numberOfCreditCard;
    }

    public String getNumberBankCheck() {
        return numberBankCheck;
    }

    public void setNumberBankCheck(String numberBankCheck) {
        this.numberBankCheck = numberBankCheck;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", numberOfCreditCard=" + numberOfCreditCard +
                ", numberBankCheck='" + numberBankCheck + '\'' +
                '}';
    }
}
