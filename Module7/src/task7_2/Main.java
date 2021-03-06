package task7_2;


import task7_1.Currency;
import task7_1.Order;
import task7_1.User;

import java.util.*;

import static task7_1.Order.*;

public class Main {

    public static void main(String[] args) {

        List<Order> list = new ArrayList<>();



        list.add(new Order(1, 10000, Currency.UAH, "ASUS", "Identificator1", new User(1, "Jack", "Jackson", "Kiev", 100000)));
        list.add(new Order(2, 1000, Currency.USD, "Lenovo", "Identificator1", new User(2, "Jack", "Jackson", "Kiev", 1000000)));
        list.add(new Order(3, 600000, Currency.UAH, "Sumsung", "Identificator1", new User(3, "Jack", "Jackson", "Kiev", 700000)));
        list.add(new Order(4, 20000, Currency.USD, "Sparc", "Identificator1", new User(4, "Jack", "Jackson", "Berlin", 30000)));
        list.add(new Order(5, 2000000, Currency.UAH, "hp", "Identificator1", new User(5, "Jack", "Jackson", "Berlin", 300000000)));
        list.add(new Order(6, 7000, Currency.USD, "DELL", "Identificator1", new User(6, "Jack", "Jackson", "Berlin", 2453875)));
        list.add(new Order(7, 300000, Currency.UAH, "SONY", "Identificator1", new User(7, "Jack", "Jackson", "Paris", 899000)));
        list.add(new Order(8, 100000, Currency.USD, "Apple", "Identificator1", new User(8, "Jack", "Jackson", "Paris", 50000000)));
        list.add(new Order(10, 100, Currency.USD, "Razer", "Identificator1", new User(10, "Jack", "Jackson", "Kiev", 40000)));
        list.add(new Order(10, 100, Currency.USD, "Razer", "Identificator1", new User(10, "Jack", "Jackson", "Kiev", 40000)));


        Collections.sort(list, comparatorToIncrease);
        System.out.println("Sorted:" + list.toString());

        Collections.sort(list, comparatorToDeacreaseAndCityOrder);
        System.out.println("Sorted:" + list.toString());

        Collections.sort(list, comparatorItemAndShopIdAndUserCity);
        System.out.println("Sorted:" + list.toString());

        System.out.println("Deleted dublicates:" +deleteDublicate(list));

        System.out.println("Deleted with rule:" +deleteItemByRule(list));

        System.out.println("Users with currency UAH are:" + Order.seprateByCurrency(list)[0] + "\n"
                + "Users with currency USD are:" + Order.seprateByCurrency(list)[1]);

        System.out.println("Users are in Berlin:" + separateList(list)[0] + "\n" + "Users are in Paris:" + separateList(list)[1] + "\n" +
                "Users are in Berlin:" + separateList(list)[2]);




    }
}
