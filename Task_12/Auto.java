package part_4.Task_12;
/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
*/

public class Auto {
    private Wheel wheel;
    private Engine engine;
    private String brand;

    public Auto(String brand, Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
        this.brand = brand;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand==" + brand +
                ", engine=" + engine +
                ", wheel'" + wheel + '\'' +
                '}';
    }

    //метод: вывести нв консоль марку автомобиля
    public void printBrend() {
        System.out.println("Марка автомобиля " + getBrand());
    }

    //метод: автомобиль едет
    public void printToGo() {
        System.out.println("Автомобиль " + getBrand() + " едет");
    }

    //метод: менять колеса
    public void changeWheels() {
        System.out.println("В автомобиле " + getBrand() + " идет замена колес марки " + wheel.getBrendOfWheel());
    }

    //метод: заправить машину
    public void fillTheCar() {
        System.out.println("Автомобиль " + getBrand() + " на заправке. Марка двигателя " + engine.getBrendOfEngine());
    }
}
