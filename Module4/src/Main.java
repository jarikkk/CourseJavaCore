
public class Main {

    public static void main(String[] args) {

        double moneyPaidMonthlyForSalary;

        Bank usBank1 = new USBank(439423984238L, "USA", Currency.USD, 6, 9000, 7, 2000000000L);
        Bank usBank2 = new USBank(394930219495L, "USA", Currency.USD, 15, 9000, 7, 3000000000L);
        Bank euBank1 = new EUBank(103474383629L, "EU", Currency.EUR, 50, 7000, 7, 5000555000200L);
        Bank euBank2 = new EUBank(988894637276L, "EU", Currency.EUR, 25, 7000, 7, 6000000000000L);
        Bank chBank1 = new ChinaBank(9384787364837L, "CHINA", Currency.USD, 1000, 1000, 7, 3000000L);
        Bank chBank2 = new ChinaBank(9837489374754733L, "CHINA", Currency.USD, 7000, 1000, 7, 1000000L);



        usBank1.setCurrency(Currency.USD);
        usBank2.setCurrency(Currency.USD);
        euBank1.setCurrency(Currency.EUR);
        euBank2.setCurrency(Currency.EUR);
        chBank1.setCurrency(Currency.USD);
        chBank2.setCurrency(Currency.USD);



        User user1 = new User();
        user1.setBalance(5000);
        user1.setBank(usBank1);
        user1.setSalary(7000);
        user1.setId(101928291821L);
        user1.setName("Jon Bon Jovi");
        user1.setCompanyName("Ernst&Yang");
        user1.setMonthsOfEmployment(10);

        User user2 = new User();
        user2.setBalance(7000);
        user2.setBank(usBank2);
        user2.setSalary(9000);
        user2.setId(23878729837L);
        user2.setName("Bono");
        user2.setCompanyName("General motors");
        user2.setMonthsOfEmployment(35);

        User user3 = new User();
        user3.setBalance(9000);
        user3.setBank(euBank1);
        user3.setSalary(8000);
        user3.setId(8278937827328L);
        user3.setName("Oww");
        user3.setCompanyName("GSO");
        user3.setMonthsOfEmployment(74);

        User user4 = new User();
        user4.setBalance(11000);
        user4.setBank(euBank2);
        user4.setSalary(9000);
        user4.setId(9119191287223L);
        user4.setName("Jane");
        user4.setCompanyName("Turkish airlines");
        user4.setMonthsOfEmployment(1);

        User user5 = new User();
        user5.setBalance(13000);
        user5.setBank(chBank1);
        user5.setSalary(10000);
        user5.setId(1L);
        user5.setName("Kristin");
        user5.setCompanyName("Real Madrid");
        user5.setMonthsOfEmployment(12);

        User user6 = new User();
        user6.setBalance(15000);
        user6.setBank(chBank2);
        user6.setSalary(20000);
        user6.setId(80018L);
        user6.setName("Jack");
        user6.setCompanyName("Starbucks");
        user6.setMonthsOfEmployment(7);


        BankSystem bankSystem = new BankSystemImpl();
        bankSystem.withdrawOfUser(user1, 800);
        bankSystem.withdrawOfUser(user2, 500);
        bankSystem.withdrawOfUser(user3, 1600);
        bankSystem.withdrawOfUser(user4, 2000);
        bankSystem.withdrawOfUser(user5, 3000);
        bankSystem.withdrawOfUser(user6, 4000);


        bankSystem.fundUser(user1, 555);
        bankSystem.fundUser(user2, 700);
        bankSystem.fundUser(user3, 1000);
        bankSystem.fundUser(user4, 100);
        bankSystem.fundUser(user5, 115);
        bankSystem.fundUser(user6, 300);

        bankSystem.paySalary(user1);
        bankSystem.paySalary(user2);
        bankSystem.paySalary(user3);
        bankSystem.paySalary(user4);
        bankSystem.paySalary(user5);
        bankSystem.paySalary(user6);

        bankSystem.transferMoney(user1, user2, 100);
        bankSystem.transferMoney(user3, user4, 200);
        bankSystem.transferMoney(user5, user6, 150);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);
        System.out.print("Money paid monthly for salary: ");
        System.out.println(usBank1.moneyPaidMonthlyForSalary() + usBank2.moneyPaidMonthlyForSalary() + euBank1.moneyPaidMonthlyForSalary() +
                                  euBank2.moneyPaidMonthlyForSalary() + chBank1.moneyPaidMonthlyForSalary() + chBank2.moneyPaidMonthlyForSalary());




    }


}
