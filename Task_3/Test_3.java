package part_4.Task_3;

//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class Test_3 {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Головацкая А.А.", 2, new int[]{-10, 5, 6, 7, 1});
        students[1] = new Student("Тополь М.Т.", 2, new int[]{6, 8, 7, 7, 5});
        students[2] = new Student("Долр П.Д.", 1, new int[]{9, -8, 7, 7, 20});
        students[3] = new Student("Комар П.З.", 4, new int[]{9, 9, 10, 7, 10});
        students[4] = new Student("Брев Р.Д.", 1, new int[]{9, 9, 10, 10, 10});
        students[5] = new Student("Мойш Р.М.", 1, new int[]{9, 10, 10, 10, 10});
        students[6] = new Student("Карп Р.А.", 3, new int[]{5, 7, 6, 10, 8});
        students[7] = new Student("Морп М.Т.", 3, new int[]{10, 9, 9, 10, 9});
        students[8] = new Student("Зуй Р.Д.", 3, new int[]{10, 10, 10, 10, 10});
        students[9] = new Student("Жердт А.А.", 1, new int[]{5, 3, 4, 5, 2});
        for (Student x : students) {
            x.getHighMarks();
        }
    }
}


class Student {
    private String name;
    private int numberGroup;
    private int[] mark = new int[5];

    public Student(String x, int y, int[] z) {
        boolean rightMarks = false;
        name = x;
        numberGroup = y;
        for (int i : z) {
            if (i >= 0 && i <= 10) {
                mark = z;
            } else {
                System.out.println("Вы ввели неверные оценки у студента " + name + "!");
                break;
            }
        }
    }

    public void getHighMarks() {
        boolean highMark = false;
        for (int x : mark) {
            if (x == 9 || x == 10) {
                highMark = true;
            } else {
                highMark = false;
                break;
            }
        }
        if (highMark == true) {
            System.out.println("ФИО студента: " + name + "," + "Номер группы: " + numberGroup);
        }
    }
}
