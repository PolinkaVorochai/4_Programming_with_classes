package part_4.Task_15.bean;

public enum Days {
    ШЕСТЬДНЕЙ(6), СЕМЬДНЕЙ(7), ВОСЕМЬДНЕЙ(8), ДЕВЯТЬДНЕЙ(9), ДЕСЯТЬДНЕЙ(10);
    private int number;

    Days(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Количество дней " +
                number
                ;
    }
}
