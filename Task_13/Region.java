package part_4.Task_13;

/*
Создание 1 объета область(областной центр)
 */
//Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на
// консоль столицу, количество областей, площадь, областные центры.
public class Region {
    private String nameOfTheRegion;
    private String area;// площадь области

    public Region(String nameOfTheRegion, String area) {
        this.nameOfTheRegion = nameOfTheRegion;
        this.area = area;
    }

    public String getNameOfTheRegion() {
        return nameOfTheRegion;
    }

    public void setNameOfTheRegion(String nameOfTheRegion) {
        this.nameOfTheRegion = nameOfTheRegion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Region{" +
                "nameOfTheRegion='" + nameOfTheRegion + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

}
