package part_4.Task_14;

import java.util.ArrayList;
import java.util.Comparator;

/*
Счета. Клиент может иметь несколько счетов в банке.
Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов.
Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class CheckAggregator {
    private ArrayList<Check> checkArrayList;

    public CheckAggregator(ArrayList<Check> checkArrayList) {
        this.checkArrayList = checkArrayList;
    }

    public ArrayList<Check> getCheckArrayList() {
        return checkArrayList;
    }

    public void setCheckArrayList(ArrayList<Check> checkArrayList) {
        this.checkArrayList = checkArrayList;
    }

    /*
    метод: поиск счета
     */
    public void searchOfTheCheck(String searchOfTheCheck) {
        for (Check x : checkArrayList) {
            if (x.getIdOfTheCheck().equals(searchOfTheCheck)) {
                System.out.println("Найденный счет: " + x);
            }
        }
    }

    /*
   метод: сортировка счетов
    */
    public void sortOfTheChecks() {
        checkArrayList.sort(new Comparator<Check>() {
            @Override
            public int compare(Check o1, Check o2) {
                return o1.getIdOfTheCheck().compareTo(o2.getIdOfTheCheck());
            }
        });
        System.out.println("Сортировка по счетам: ");
        for (Check x : checkArrayList) {
            System.out.println(x);
        }
    }

    /*
   метод: Вычисление общей суммы по счетам
    */
    public void summa(String idOfTheClient) {
        long summa = 0;
        for (Check x : checkArrayList) {
            if (x.getIdOfTheClient().equals(idOfTheClient)) {
                summa += x.getBalance();
            }
        }
        System.out.println("Общая сумма по счетам клиента " + idOfTheClient + " составляет " + summa + " BYN");
    }

    /*
  метод: Вычисление суммы по всем счетам,
  имеющим положительный и отрицательный балансы отдельно
   */
    public void summaOfTheBalance(String idOfTheClient) {
        long summaPositive = 0;
        long summaNegative = 0;
        for (Check x : checkArrayList) {
            if (x.getIdOfTheClient().equals(idOfTheClient)) {
                if (x.getBalance() > 0) {
                    summaPositive += x.getBalance();
                } else {
                    summaNegative += x.getBalance();
                }
            }
        }
        System.out.println("Положительный баланс по счетам клиента " + idOfTheClient + " составляет " + summaPositive + " BYN");
        System.out.println("Отрицательный баланс по счетам клиента " + idOfTheClient + " составляет " + summaNegative + " BYN");
    }
}
