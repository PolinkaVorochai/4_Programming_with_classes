package part_4.Task_14;

import java.util.ArrayList;

/*
Счета. Клиент может иметь несколько счетов в банке.
Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов.
Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Runner {
    public static void main(String[] args) {
        ArrayList<Check> checks = new ArrayList<>();
        checks.add(new Check("1000 1225 3000 5149", "375 25 5411225", "Курчевская Елизавета Петровна", "Активен", 25421L, "BYN"));
        checks.add(new Check("1000 1325 3000 5236", "375 25 7253641", "Манько Петр Сергеевич", "Активен", 1425421L, "BYN"));
        checks.add(new Check("1000 1225 3000 1478", "375 25 5411225", "Курчевская Елизавета Петровна", "Активен", 212589L, "BYN"));
        checks.add(new Check("2000 1225 3000 1462", "375 29 9784158", "Мур Кирилл Александрович", "Заблокирован", -141L, "BYN"));
        checks.get(1).setStatusOfTheCheck("Заблокирован");
        checks.get(3).setStatusOfTheCheck("Разблокирован");
        CheckAggregator checkAggregator = new CheckAggregator(checks);
        checkAggregator.sortOfTheChecks();
        checkAggregator.summa("375 25 5411225");
        checkAggregator.summaOfTheBalance("375 25 5411225");
    }
}
