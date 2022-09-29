package part_4.Task_15.bean;

public enum Hotel {
    БЮДЖЕТ(3), НОРМ(4), ЛЮКС(5);
    private int star;

    Hotel(int star) {
        this.star = star;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "Отель " +
                "звезд " + star
                ;
    }
}
