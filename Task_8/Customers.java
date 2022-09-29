package part_4.Task_8;


import java.util.ArrayList;
//Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
class Customers {
    /*метод сортировки покупателей
    по алфавиту*/
    static void sortCustomersAlphabetically(ArrayList<Customer> customers) {
        System.out.println("List of buyers in alphabetical order: ");
        int a;
        String b;
        String c;
        String d;
        String e;
        long f;
        String g;
        for (int j = 0; j < customers.size(); j++) {
            for (int i = j + 1; i < customers.size(); i++) {
                if (customers.get(i).getSurname().compareToIgnoreCase(customers.get(j).getSurname()) < 0) {
                    a = customers.get(j).getId();
                    b = customers.get(j).getSurname();
                    c = customers.get(j).getName();
                    d = customers.get(j).getPatronymic();
                    e = customers.get(j).getAddress();
                    f = customers.get(j).getNumberOfCreditCard();
                    g = customers.get(j).getNumberBankCheck();

                    customers.get(j).setId(customers.get(i).getId());
                    customers.get(j).setSurname(customers.get(i).getSurname());
                    customers.get(j).setName(customers.get(i).getName());
                    customers.get(j).setPatronymic(customers.get(i).getPatronymic());
                    customers.get(j).setAddress(customers.get(i).getAddress());
                    customers.get(j).setNumberOfCreditCard(customers.get(i).getNumberOfCreditCard());
                    customers.get(j).setNumberBankCheck(customers.get(i).getNumberBankCheck());

                    customers.get(i).id = a;
                    customers.get(i).surname = b;
                    customers.get(i).name = c;
                    customers.get(i).patronymic = d;
                    customers.get(i).address = e;
                    customers.get(i).numberOfCreditCard = f;
                    customers.get(i).numberBankCheck = g;

                }
            }
        }
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }

    /*метод вывода списка покупателей, у которых
    номер кредитной карточки находится в заданном интервале*/
    public static void listOfBuyersWhoseCreditCardNumberIsInTheGivenInterval(ArrayList<Customer> customers, long start, long end) {
        System.out.println("list of buyers whose credit card number is in the given interval: ");
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getNumberOfCreditCard() > start && customers.get(i).getNumberOfCreditCard() < end) {
                System.out.println(customers.get(i));
            } else continue;
        }
    }

    /*Создание списка
     покупателей
     */
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(5256357, "Nivar", "Nika", "Vicktorovna", "Minsk street Linkova 12-52",
                1010254536215214L, "1000 0000 2562 0000 1025"));
        customers.add(new Customer(8915263, "Reven", "Mariya", "Aleksandrovna", "Minsk street Belyackova 22-132",
                1010635714871032L, "2054 0000 5784 0000 1542"));
        customers.add(new Customer(4723625, "Check", "Nadya", "Ivanovna", "Minsk street Angarskaya 25-364",
                1010472648720103L, "1420 0000 3685 0000 9475"));
        customers.add(new Customer(4725498, "Kipas", "Isabella", "Ivanovna", "Minsk street Ivan Kupala 36-11",
                1025843647121542L, "4780 0000 3641 0000 3647"));
        customers.add(new Customer(7458623, "Durko", "Bella", "Yadvigovna", "Minsk street Metallurgov 10-3",
                1025149512300196L, "7410 0000 6423 0000 2541"));


        /*вывод на экран покупателей, отсортироанных
         в алфивитном порядке по полю Фамилия*/
        Customers.sortCustomersAlphabetically(customers);
        /* вывод списка покупателей, у которых
    номер кредитной карточки находится в заданном интервале*/
        Customers.listOfBuyersWhoseCreditCardNumberIsInTheGivenInterval(customers, 1000000000000000L, 1020000000000000L);
    }

}


