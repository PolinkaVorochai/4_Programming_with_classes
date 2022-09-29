package part_4.Task_7;

//Описать класс, представляющий треугольник.
// Предусмотреть методы для создания объектов, вычисления площади,
// периметра и точки пересечения медиан.
public class Test_7 {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(15, 13, 4);
        triangle1.examination();
        triangle1.area();
        triangle1.perimeter();
        triangle1.centerOfGravity();
    }
}


class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            this.side1 = -1;
            this.side2 = -1;
            this.side3 = -1;
        } else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    void examination() {
        boolean examination;
        int summa1 = this.side1 + this.side2;
        int summa2 = this.side2 + this.side3;
        int summa3 = this.side3 + this.side1;
        if (this.side1 < summa2 && this.side2 < summa3 && this.side3 < summa1) {
            examination = true;
        } else examination = false;
        System.out.println("Это треугольник: " + examination);
    }

    void area() {
        int semiPerimeter = (this.side1 + this.side2 + this.side3) / 2;
        int productOfNumbers = semiPerimeter * (semiPerimeter - this.side1) * (semiPerimeter - this.side2) * (semiPerimeter - this.side3);
        double result = Math.sqrt(productOfNumbers);
        System.out.println("Площадь треугольника: " + result);
    }

    void perimeter() {
        int result = this.side1 + this.side2 + this.side3;
        System.out.println("Периметр: " + result);
    }

    void centerOfGravity() {
        double cosInjection = (this.side1 * this.side1 + this.side2 * this.side2 - this.side3 * this.side3) / (2 * this.side1 * this.side2);
        double sinInjection = Math.sqrt(1 - cosInjection * cosInjection);
        double x1 = 0;
        double x2 = this.side2 * cosInjection;
        double x3 = this.side1;
        double y1 = 0;
        double y2 = this.side2 * sinInjection;
        double y3 = 0;
        double resultX = (x1 + x2 + x3) / 3;
        double resultY = (y1 + y2 + y3) / 3;
        System.out.println("Точка пересечения медиан: " + resultX + " ось x " + resultY + " ось y");
    }
}