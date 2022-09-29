package part_4.Task_1;

//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
// наибольшее значение из этих двух переменных.
public class Runner {
    public static void main(String[] args) {
        Test1 obj = new Test1();
        Test1.setY(10);
        Test1.setX(2);
        obj.print();
        Test1.setY(105);
        Test1.setX(252);
        obj.print();
    }
}
