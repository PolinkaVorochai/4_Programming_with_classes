package part_4.Task_2;

//Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
// Добавьте конструктор, инициализирующий члены класса по умолчанию.
// Добавьте set- и get- методы для полей экземпляра класса.
public class Runner2 {
    public static void main(String[] args) {
        Test2 obj = new Test2();
        System.out.println("Конструктор по умолчанию: " + Test2.getA() + ", " + Test2.getB());
        Test2 obj1 = new Test2(145, 856);
        System.out.println("Консруктор с входными параметрами: " + Test2.getA() + ", " + Test2.getB());
    }
}
