package part_4.Task_10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного*/
public class Runner {
    public static void main(String[] args) {
        ArrayList<Airline> airlineArrayList = new ArrayList<>();
        airlineArrayList.add(new Airline("Berlin", "521n", "Britannia C2", LocalDateTime.of(2022, Month.AUGUST, 23, 10, 35)));
        airlineArrayList.add(new Airline("London", "52t", "Britannia C0", LocalDateTime.of(2022, Month.AUGUST, 27, 17, 40)));
        airlineArrayList.add(new Airline("Paris", "025m", "Britannia C3", LocalDateTime.of(2022, Month.AUGUST, 10, 00, 10)));
        airlineArrayList.add(new Airline("Minsk", "1021n", "Britannia C1", LocalDateTime.of(2022, Month.AUGUST, 15, 12, 00)));

        AirlineAggregator aggregator = new AirlineAggregator(airlineArrayList);
        aggregator.listOfFlightsForAGivenDestination("Paris");
        aggregator.listOfFlightsForAGivenDayOfTheWeek(LocalDate.of(2022, Month.AUGUST, 23));
        aggregator.listOfFlightsForAGivenDayOfTheWeekDepartureTimeForWhichIsGreaterThanTheSpecified(LocalDateTime.of(2022, Month.AUGUST, 23, 10, 00));
    }
}
