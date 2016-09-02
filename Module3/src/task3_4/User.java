package task3_4;

public class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    void paySalary() {
        balance = balance + salary;
    }

    int withdraw(int summ) {
        if (summ <= 1000) balance = balance - summ - (balance * 5 / 100);
        else if (summ > 1000) balance = balance - summ - (balance * 10 / 100);

        return balance;
    }

    String companyNameLenfht() {

        return String.valueOf(companyName.length());

    }

    int monthIncreaser(int addMonth) {

        monthsOfEmployment = monthsOfEmployment + addMonth;
        return monthsOfEmployment;

    }

    public static void main(String[] args) {

        User user1 = new User("Jack", 1000, 6, "roga & kopita", 5000, "USD");

        user1.paySalary();
        user1.withdraw(1500);
        user1.companyNameLenfht();
        user1.monthIncreaser(5);


    }

}
