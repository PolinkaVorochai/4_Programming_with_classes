package part_4.Task_6;

//Составьте описание класса для представления времени.
// Предусмотрте возможности установки времени и изменения его
// отдельных полей (час, минута, секунда) с
// проверкой допустимости вводимых значений.
// В случае недопустимых значений полей поле устанавливается в значение 0.
// Создать методы изменения времени на заданное количество часов, минут и секунд.
public class Test_6 {
    public static void main(String[] args) {
        Clock clock1 = new Clock();
        clock1.setHour(12);
        clock1.setMinute(55);
        clock1.setSecond(59);
        System.out.println("Время установленное пользователем: " + clock1.getHour() + "чч "
                + clock1.getMinute() + "мм " + clock1.getSecond() + "сс");
        clock1.changeClock(5, 47, 63);
    }
}


class Clock {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            hour = 0;
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            minute = 0;
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            second = 0;
            this.second = second;
        }
    }

    void changeClock(int hour, int minute, int second) {
        int allSecond = this.hour * 3600 + this.minute * 60 + this.second;
        int changeSecond = hour * 3600 + minute * 60 + second;
        int changeClock = allSecond + changeSecond;

        int resultHour = changeClock / 3600;
        int remainder1 = changeClock - resultHour * 3600;
        int resultMinute = remainder1 / 60;
        int resultSecond = remainder1 - resultMinute * 60;

        if (changeClock < 0) {
            resultHour = 0;
            resultMinute = 0;
            resultSecond = 0;
        }
        System.out.print("Изменненое время: " + resultHour + "чч " + resultMinute + "мм " + resultSecond + "сс");
    }
}