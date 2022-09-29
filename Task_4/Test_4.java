package part_4.Task_4;

//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность
// сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения,
// причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
class Test_4 {
    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = new Train("New-York", 647, 12.01);
        trains[1] = new Train("Brookline", 547, 12.45);
        trains[2] = new Train("Minsk", 321, 15.31);
        trains[3] = new Train("Paris", 322, 2.03);
        trains[4] = new Train("Minsk", 541, 7.06);
        Train.infoTrainNumber = 321;//Пользователь ввел номер поезда.
        Train.myEquals(trains);//Получение информации о поезде номером infoTrainNumber.
        Train.sortNumber(trains);//Выводит поезда (сортировка по номерам).
        Train.sortToArea(trains);//Выводит поезда (сортировка по конечной станции).
    }
}


class Train {
    public static int infoTrainNumber;//номер поезда, который вводит пользователь для получения информации
    private String toArea;
    private int number;
    private double timeDeparture;

    public Train(String x, int y, double z) {
        toArea = x;
        number = y;
        timeDeparture = z;
    }

    /*Получение информации о поезде
     номер которого пользователь задал.
     */
    static void myEquals(Train[] o) {
        boolean yes = false;
        for (int i = 0; i < o.length; i++) {
            if (infoTrainNumber == o[i].number) {
                System.out.println("Запрашиваемая информация о поезде № " + o[i].number + ":" +
                        "время отправления - " + o[i].timeDeparture + "," + "конечная станция - " + o[i].toArea);
                yes = true;
                break;
            } else {
                yes = false;
            }
        }
        if (yes == false) {
            System.out.println("Поезд № " + infoTrainNumber + " не найден.");
        }
    }

    /*Сортировка по номерам
    поездов и вывод информации на экран.
         */
    static void sortNumber(Train[] x) {
        System.out.println("Сортировка по номерам поездов: ");
        boolean s = false;
        int t;
        double d;
        String k;
        while (!s) {
            s = true;
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i].number > x[i + 1].number) {
                    t = x[i].number;
                    d = x[i].timeDeparture;
                    k = x[i].toArea;

                    x[i].number = x[i + 1].number;
                    x[i].timeDeparture = x[i + 1].timeDeparture;
                    x[i].toArea = x[i + 1].toArea;

                    x[i + 1].number = t;
                    x[i + 1].timeDeparture = d;
                    x[i + 1].toArea = k;

                    s = false;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println("Поезд № " + x[i].getNumber() + ", время отправления " + x[i].getTimeDeparture() + ", следует до станции " + x[i].getToArea());
        }
    }

    /*Сортировка по пункту назначения
    и вывод информации на экран.
             */
    static void sortToArea(Train[] x) {
        System.out.println("Сортировка по пункту назначения: ");
        int t;
        double d;
        String k;
        for (int j = 0; j < x.length - 1; j++) {
            for (int i = j + 1; i < x.length; i++) {
                if (x[i].toArea.compareToIgnoreCase(x[j].toArea) < 0) {
                    t = x[j].number;
                    d = x[j].timeDeparture;
                    k = x[j].toArea;

                    x[j].number = x[i].number;
                    x[j].timeDeparture = x[i].timeDeparture;
                    x[j].toArea = x[i].toArea;

                    x[i].number = t;
                    x[i].timeDeparture = d;
                    x[i].toArea = k;
                } else if (x[i].toArea.compareToIgnoreCase(x[j].toArea) == 0) {
                    if (x[i].timeDeparture < x[j].timeDeparture) {
                        t = x[j].number;
                        d = x[j].timeDeparture;
                        k = x[j].toArea;

                        x[j].number = x[i].number;
                        x[j].timeDeparture = x[i].timeDeparture;
                        x[j].toArea = x[i].toArea;

                        x[i].number = t;
                        x[i].timeDeparture = d;
                        x[i].toArea = k;
                    }
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println("Поезд № " + x[i].getNumber() + ", время отправления " + x[i].getTimeDeparture() + ", следует до станции " + x[i].getToArea());
        }
    }

    public String getToArea() {
        return toArea;
    }

    public int getNumber() {
        return number;
    }

    public double getTimeDeparture() {
        return timeDeparture;
    }
}


