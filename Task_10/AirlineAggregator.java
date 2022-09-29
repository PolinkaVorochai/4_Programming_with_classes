package part_4.Task_10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного*/
class AirlineAggregator {
    private ArrayList<Airline> airlineArray;

    public AirlineAggregator(ArrayList<Airline> airlineArray) {
        this.airlineArray = airlineArray;
    }

    public ArrayList<Airline> getAirlineArray() {
        return airlineArray;
    }

    public void setAirlineArray(ArrayList<Airline> airlineArray) {
        this.airlineArray = airlineArray;
    }

    /*
    метод:
    список рейсов для заданного пункта назначения
     */
    public void listOfFlightsForAGivenDestination(String theDestination) {
        System.out.println("Рейсы в " + theDestination + ": ");
        for (Airline x : airlineArray) {
            if (x.getDestination().equals(theDestination)) {
                System.out.println(x);
            }
        }
    }

    /*
   метод:
   список рейсов для заданного дня недели
    */
    public void listOfFlightsForAGivenDayOfTheWeek(LocalDate theDayOfWeek) {
        System.out.println("Рейсы в " + theDayOfWeek + ": ");
        for (Airline x : airlineArray) {
            if (x.getTimeOfDeparture().toLocalDate().equals(theDayOfWeek)) {
                System.out.println(x);
            }
        }
    }

    /*меод:
    список рейсов для заданного дня недели,
    время вылета для которых больше заданного
    */
    public void listOfFlightsForAGivenDayOfTheWeekDepartureTimeForWhichIsGreaterThanTheSpecified(LocalDateTime theTimeAndDay) {
        System.out.println("Рейсы идущие после " + theTimeAndDay + ": ");
        for (Airline x : airlineArray) {
            if (x.getTimeOfDeparture().isAfter(theTimeAndDay) && x.getTimeOfDeparture().toLocalDate().equals(theTimeAndDay.toLocalDate())) {
                System.out.println(x);
            }
        }
    }
}
