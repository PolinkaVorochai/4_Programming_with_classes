package part_4.Task_15.bean;

public enum Cruise {
    КРУИЗ("Да"), НЕТ("Нет");
    private String toBe;

    Cruise(String toBe) {
        this.toBe = toBe;
    }

    public String getToBe() {
        return toBe;
    }

    public void setToBe(String toBe) {
        this.toBe = toBe;
    }

    @Override
    public String toString() {
        return "Это круиз? " +
                toBe
                ;
    }
}
