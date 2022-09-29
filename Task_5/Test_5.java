package part_4.Task_5;

//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать
// свое значение на единицу в заданном диапазоне.
// Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
// Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
// Написать код, демонстрирующий все возможности класса.
public class Test_5 {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        System.out.println("Значение счетчика по умолчанию:" + "диапазон от " + counter1.getStart() +
                " до " + counter1.getEnd() + ", " + "текущее значение счетчика " + counter1.getNow());
        Counter counter2 = new Counter(0, 1000, 541);
        System.out.println("Значение счетчика:" + "диапазон от " + counter2.getStart() +
                " до " + counter2.getEnd() + ", " + "текущее значение счетчика " + counter2.getNow());
        System.out.println("Демонстрация метода увеличения текущего значения счетчика на 1: " + counter1.plusCounter());
        System.out.println("Демонстрация метода увеличения текущего значения счетчика на 1: " + counter2.plusCounter());
        System.out.println("Демонстрация метода уменьшения текущего значения счетчика на 1: " + counter1.minusCounter());
        System.out.println("Демонстрация метода уменьшения текущего значения счетчика на 1: " + counter2.minusCounter());
    }
}


class Counter {
    public static final int step = 1;//шаг всегда равен 1
    private int start;
    private int end;
    private int now;

    Counter() {
        this.start = 0;
        this.end = 10;
        this.now = 0;
    }

    Counter(int start, int end, int now) {
        this.start = start;
        this.end = end;
        this.now = now;
    }

    int plusCounter() {
        if (now < end && now >= start) {
            now = now + 1;
        } else if (now >= end) {
            now = start + (-end + now) - 1;
        } else if (now < start) {
            now = end - start + now + 1;
        }
        return now;
    }

    int minusCounter() {
        if (now <= end && now > start) {
            now = now - 1;
        } else if (now > end) {
            now = start + end - now - 1;
        } else if (now < start) {
            now = end - start + now + 1;
        }
        return now;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getNow() {
        return now;
    }
}