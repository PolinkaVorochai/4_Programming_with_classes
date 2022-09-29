package part_4.Task_1;

//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
// наибольшее значение из этих двух переменных.
public class Test1 {
    public static int x;
    public static int y;

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Test1.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        Test1.y = y;
    }

    public void print() {
        System.out.println("Переменная x: " + getX());
        System.out.println("Переменная y: " + getY());
        System.out.println("Максимум: " + max());
        System.out.println("Сумма: " + sum());
    }

    public int max() {
        if (x > y) return x;
        return y;
    }

    public int sum() {
        return x + y;
    }
}
