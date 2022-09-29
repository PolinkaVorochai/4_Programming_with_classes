package part_4.Task_15;

import part_4.Task_15.bean.*;

import java.util.ArrayList;

import static part_4.Task_15.bean.Treatment.СЕРДЦЕ;

/*
        Туристические путевки. Сформировать набор предложений клиенту по выбору
        туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.)
        для оптимального выбора.
        Учитывать возможность выбора транспорта, питания и числа дней.
        Реализовать выбор и сортировку путевок.
        */
public class Runner {
    public static void main(String[] args) {
        ArrayList<Tour> egypt = new ArrayList<>();
        egypt.add(new Tour(GoTo.ЕГИПЕТ, Days.ШЕСТЬДНЕЙ, Transport.САМОЛЕТ, Eat.НЕТ, "Пирамиды",
                Treatment.НЕТ, Shop.ВКЛЮЧЕН, 2275L, Hotel.ЛЮКС, Person.ДВА, Cruise.КРУИЗ));
        egypt.add(new Tour(GoTo.ЕГИПЕТ, Days.ДЕВЯТЬДНЕЙ, Transport.САМОЛЕТ, Eat.ТРЕХРАЗОВОЕ, "Пирамиды",
                Treatment.СОЛИ, Shop.ВКЛЮЧЕН, 3275L, Hotel.БЮДЖЕТ, Person.ТРИ, Cruise.КРУИЗ));
        egypt.add(new Tour(GoTo.ЕГИПЕТ, Days.ДЕВЯТЬДНЕЙ, Transport.САМОЛЕТ, Eat.ОДНОРАЗОВОЕ, "Пирамиды",
                Treatment.НЕТ, Shop.ВКЛЮЧЕН, 2975L, Hotel.НОРМ, Person.ДВА, Cruise.КРУИЗ));
        egypt.add(new Tour(GoTo.ЕГИПЕТ, Days.СЕМЬДНЕЙ, Transport.САМОЛЕТ, Eat.ТРЕХРАЗОВОЕ, "Пирамиды",
                СЕРДЦЕ, Shop.ВКЛЮЧЕН, 4975L, Hotel.ЛЮКС, Person.ОДИН, Cruise.КРУИЗ));
        TourAggregator goToEgypt = new TourAggregator(egypt);
        goToEgypt.printOfTheTreatment(Treatment.ЖЕЛУДОК);
        goToEgypt.printOfTheTreatment(Treatment.СЕРДЦЕ);
        System.out.println();
        goToEgypt.printOfTheExcursions("Пирамиды");
        System.out.println();
        goToEgypt.printOfTheShop(Shop.ВКЛЮЧЕН);
        System.out.println();
        goToEgypt.printOfTheCruise(Cruise.НЕТ);
        System.out.println();
        goToEgypt.printOfTheDays(Days.СЕМЬДНЕЙ);
        System.out.println();
        goToEgypt.printOfTheOffer(Transport.САМОЛЕТ, Eat.ТРЕХРАЗОВОЕ, Days.СЕМЬДНЕЙ);
        System.out.println();
        goToEgypt.sortOfTheHotel();
    }
}
