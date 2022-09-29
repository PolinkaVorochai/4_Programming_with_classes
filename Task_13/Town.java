package part_4.Task_13;

/*
Создание 1 объекта город
 */
//Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на
// консоль столицу, количество областей, площадь, областные центры.
public class Town {
    private String town;

    public Town(String town) {
        this.town = town;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Town{" +
                "town='" + town + '\'' +
                '}';
    }
}
