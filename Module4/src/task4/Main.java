package task4;


public class Main {

    public static void main(String[] args) {


        User user1 = new User(1, "Jon Bon Jovi", 5000, 10, "Ernst&Yang", 7000, new USBank(Currency.EUR));
        User user2 = new User(2, "Bono", 7000, 35, "General motors", 9000, new USBank(Currency.USD));
        User user3 = new User(3, "Oww", 9000, 74, "GSO", 8000, new EUBank(Currency.EUR));
        User user4 = new User(4, "Jane", 11000, 1, "Turkish airlines", 9000, new EUBank(Currency.USD));
        User user5 = new User(5, "Kristin", 13000, 12, "Real Madrid", 10000, new ChinaBank(Currency.EUR));
        User user6 = new User(6, "Starbucks", 15000, 5, "Starbucks", 20000, new ChinaBank(Currency.USD));

        BankSystem bankSystem = new BankSystemImpl();

        bankSystem.withdrawOfUser(user1, 800);
        bankSystem.fundUser(user1, 400);
        bankSystem.transferMoney(user1, user2, 500);
        bankSystem.paySalary(user1);

        bankSystem.withdrawOfUser(user2, 900);
        bankSystem.fundUser(user2, 700);
        bankSystem.transferMoney(user2, user3, 200);
        bankSystem.paySalary(user2);

        bankSystem.withdrawOfUser(user3, 1000);
        bankSystem.fundUser(user3, 300);
        bankSystem.transferMoney(user3, user4, 800);
        bankSystem.paySalary(user3);

        bankSystem.withdrawOfUser(user4, 700);
        bankSystem.fundUser(user4, 650);
        bankSystem.transferMoney(user4, user5, 340);
        bankSystem.paySalary(user4);

        bankSystem.withdrawOfUser(user5, 100);
        bankSystem.fundUser(user5, 550);
        bankSystem.transferMoney(user5, user6, 720);
        bankSystem.paySalary(user5);

        bankSystem.withdrawOfUser(user6, 300);
        bankSystem.fundUser(user6, 1200);
        bankSystem.transferMoney(user6, user1, 10);
        bankSystem.paySalary(user6);

        System.out.println("|Id| "+"|Name| "+"|Balance| "+"|MonthsOfEmployment| "+"|CompanyName| "+"|Salary| "+"|Bank| ");
        System.out.println(user1.getId()+" "+user1.getName()+" "+user1.getBalance()+" "+user1.getMonthsOfEmployment()+" "+user1.getCompanyName()+" "+user1.getSalary()+" "+user1.getBank());
        System.out.println(user2.getId()+" "+user2.getName()+" "+user2.getBalance()+" "+user2.getMonthsOfEmployment()+" "+user2.getCompanyName()+" "+user2.getSalary()+" "+user2.getBank());
        System.out.println(user3.getId()+" "+user3.getName()+" "+user3.getBalance()+" "+user3.getMonthsOfEmployment()+" "+user3.getCompanyName()+" "+user3.getSalary()+" "+user3.getBank());
        System.out.println(user4.getId()+" "+user4.getName()+" "+user4.getBalance()+" "+user4.getMonthsOfEmployment()+" "+user4.getCompanyName()+" "+user4.getSalary()+" "+user4.getBank());
        System.out.println(user5.getId()+" "+user5.getName()+" "+user5.getBalance()+" "+user5.getMonthsOfEmployment()+" "+user5.getCompanyName()+" "+user5.getSalary()+" "+user5.getBank());
        System.out.println(user6.getId()+" "+user6.getName()+" "+user6.getBalance()+" "+user6.getMonthsOfEmployment()+" "+user6.getCompanyName()+" "+user6.getSalary()+" "+user6.getBank());

    }


}
