package part_4.Task_13;

/*
Создание 1 объекта район.
 */
//Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на
// консоль столицу, количество областей, площадь, областные центры.
public class Area {
    private String nameOfTheArea;

    public Area(String nameOfTheArea) {
        this.nameOfTheArea = nameOfTheArea;
    }

    public String getNameOfTheArea() {
        return nameOfTheArea;
    }

    public void setNameOfTheArea(String nameOfTheArea) {
        this.nameOfTheArea = nameOfTheArea;
    }

    @Override
    public String toString() {
        return "Area{" +
                "nameOfTheArea='" + nameOfTheArea + '\'' +
                '}';
    }
}
