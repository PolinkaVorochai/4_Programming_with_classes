package part_4.Task_12;

/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
*/
public class Wheel {
    private String brendOfWheel;

    public Wheel(String brendOfWheel) {
        this.brendOfWheel = brendOfWheel;
    }

    public String getBrendOfWheel() {
        return brendOfWheel;
    }

    public void setBrendOfWheel(String brendOfWheel) {
        this.brendOfWheel = brendOfWheel;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "brendOfWheel='" + brendOfWheel + '\'' +
                '}';
    }
}
