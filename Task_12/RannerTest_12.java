package part_4.Task_12;

/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
*/
public class RannerTest_12 {
    public static void main(String[] args) {
        Wheel wheel0 = new Wheel("Premium Contact 6");
        Engine engine0 = new Engine("Renault K7M");
        Auto auto0 = new Auto("Alfa Romeo", wheel0, engine0);
        Wheel wheel1 = new Wheel("Discoverer A/T3");
        Engine engine1 = new Engine("Honda R20A");
        Auto auto1 = new Auto("Honda", wheel1, engine1);
        auto0.printBrend();
        auto0.changeWheels();
        auto0.printToGo();
        auto1.printBrend();
        auto1.changeWheels();
        auto1.printToGo();
    }
}
