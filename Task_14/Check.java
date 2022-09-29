package part_4.Task_14;

/*
Счета. Клиент может иметь несколько счетов в банке.
Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов.
Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Check {
    private String idOfTheCheck;//номер счета
    private String idOfTheClient;//идентификатор клиента
    private String nameOfTheClient;//ФИО клиента
    private String statusOfTheCheck;//статус счета
    private long balance;//баланс на счете
    private String currency;//валюта счета

    public Check(String idOfTheCheck, String idOfTheClient, String nameOfTheClient, String statusOfTheCheck, long balance, String currency) {
        this.idOfTheCheck = idOfTheCheck;
        this.idOfTheClient = idOfTheClient;
        this.nameOfTheClient = nameOfTheClient;
        this.statusOfTheCheck = statusOfTheCheck;
        this.balance = balance;
        this.currency = currency;
    }

    public String getIdOfTheCheck() {
        return idOfTheCheck;
    }

    public void setIdOfTheCheck(String idOfTheCheck) {
        this.idOfTheCheck = idOfTheCheck;
    }

    public String getIdOfTheClient() {
        return idOfTheClient;
    }

    public void setIdOfTheClient(String idOfTheClient) {
        this.idOfTheClient = idOfTheClient;
    }

    public String getNameOfTheClient() {
        return nameOfTheClient;
    }

    public void setNameOfTheClient(String nameOfTheClient) {
        this.nameOfTheClient = nameOfTheClient;
    }

    public String getStatusOfTheCheck() {
        return statusOfTheCheck;
    }

    public void setStatusOfTheCheck(String statusOfTheCheck) {
        this.statusOfTheCheck = statusOfTheCheck;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Check{" +
                "idOfTheCheck='" + idOfTheCheck + '\'' +
                ", idOfTheClient='" + idOfTheClient + '\'' +
                ", nameOfTheClient='" + nameOfTheClient + '\'' +
                ", statusOfTheCheck='" + statusOfTheCheck + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }
}

