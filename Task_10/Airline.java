package part_4.Task_10;

import java.time.LocalDateTime;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного*/
public class Airline {
    private String destination;
    private String numberFlight;
    private String aircraftType;
    private LocalDateTime timeOfDeparture;
   // private String dayOfWeek;


    public Airline(String destination, String numberFlight, String aircraftType, LocalDateTime timeOfDeparture) {
        this.destination = destination;
        this.numberFlight = numberFlight;
        this.aircraftType = aircraftType;
        this.timeOfDeparture = timeOfDeparture;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getNumberFlight() {
        return numberFlight;
    }

    public void setNumberFlight(String numberFlight) {
        this.numberFlight = numberFlight;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public LocalDateTime getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(LocalDateTime timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", numberFlight='" + numberFlight + '\'' +
                ", aircraftType='" + aircraftType + '\'' +
                ", timeOfDeparture=" + timeOfDeparture +
                '}';
    }
}
