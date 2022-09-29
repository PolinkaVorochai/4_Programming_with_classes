package part_4.Task_2;

//Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
// Добавьте конструктор, инициализирующий члены класса по умолчанию.
// Добавьте set- и get- методы для полей экземпляра класса.
public class Test2 {
    public static int a;
    public static int b;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Test2.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Test2.b = b;
    }

    public Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Test2() {
        this(0, 0);
    }
}

