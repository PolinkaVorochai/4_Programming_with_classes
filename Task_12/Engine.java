package part_4.Task_12;

/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
*/
public class Engine {
    private String brendOfEngine;

    public Engine(String brendOfEngine) {
        this.brendOfEngine = brendOfEngine;
    }

    public String getBrendOfEngine() {
        return brendOfEngine;
    }

    public void setBrendOfEngine(String brendOfEngine) {
        this.brendOfEngine = brendOfEngine;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "brendOfEngine='" + brendOfEngine + '\'' +
                '}';
    }
}
