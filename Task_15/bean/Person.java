package part_4.Task_15.bean;

public enum Person {
    ОДИН(1), ДВА(2), ТРИ(3);
    private int numberOfPerson;

    Person(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    @Override
    public String toString() {
        return "Количество мест " +
                numberOfPerson
                ;
    }
}
