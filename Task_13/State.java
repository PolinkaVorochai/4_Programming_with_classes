package part_4.Task_13;

import java.util.ArrayList;

/*
Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей,
площадь, областные центры.
 */
public class State {
    private ArrayList<Region> regionAggregator;//список областей
    private ArrayList<Area> areaAggregator;//список районов
    private ArrayList<Town> townAggregator;//список городов
    private String country;//столица

    public State(String country, ArrayList<Area> areaAggregator, ArrayList<Region> regionAggregator, ArrayList<Town> townAggregator) {
        this.regionAggregator = regionAggregator;
        this.areaAggregator = areaAggregator;
        this.townAggregator = townAggregator;
        this.country = country;
    }

    public ArrayList<Region> getRegionAggregator() {
        return regionAggregator;
    }

    public void setRegionAggregator(ArrayList<Region> regionAggregator) {
        this.regionAggregator = regionAggregator;
    }

    public ArrayList<Area> getAreaAggregator() {
        return areaAggregator;
    }

    public void setAreaAggregator(ArrayList<Area> areaAggregator) {
        this.areaAggregator = areaAggregator;
    }

    public ArrayList<Town> getTownAggregator() {
        return townAggregator;
    }

    public void setTownAggregator(ArrayList<Town> townAggregator) {
        this.townAggregator = townAggregator;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /*
    метод:вывести на консоль столицу
     */
    public void printOfTheCountry() {
        System.out.println("Столица " + getCountry());
    }

    /*
  метод:вывести на консоль количество областей
   */
    public void printNumberOfRegions() {
        System.out.println("Количество областей " + regionAggregator.size());
    }

    /*
  метод:вывести на консоль площадь областей
   */
    public void printArea() {
        for (Region x : regionAggregator) {
            System.out.println(x.getArea());
        }
    }

    /*
      метод:вывести на консоль областные центры
       */
    public void printOfTheCity() {
        for (Region x : regionAggregator) {
            System.out.println(x.getNameOfTheRegion());
        }
    }
}
