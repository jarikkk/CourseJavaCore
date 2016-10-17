package task7_3;


import task7_1.Currency;
import task7_1.Order;
import task7_1.User;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Set<Order> set = new TreeSet();

        Order o = new Order(6, 7000, Currency.USD, "DELL", "Identificator1", new User(6, "Jack", "Petrov", "Berlin", 2453875));


        set.add(new Order(1, 10000, Currency.UAH, "ASUS", "Identificator1", new User(1, "Jack", "Jackson", "Kiev", 100000)));
        set.add(new Order(2, 1000, Currency.USD, "Lenovo", "Identificator2", new User(2, "Jaky", "Jack", "Kiev", 1000000)));
        set.add(new Order(3, 600000, Currency.UAH, "Sumsung", "Identificator3", new User(3, "Jenny", "Mur", "Kiev", 700000)));
        set.add(new Order(4, 20000, Currency.USD, "Sparc", "Identificator4", new User(4, "Loren", "Fabir", "Berlin", 30000)));
        set.add(new Order(5, 2000000, Currency.UAH, "hp", "Identificator5", new User(5, "Patricia", "Sorret", "Berlin", 300000000)));
        set.add(new Order(6, 7000, Currency.USD, "DELL", "Identificator6", new User(6, "Jack", "Petrov", "Berlin", 2453875)));
        set.add(new Order(7, 300000, Currency.UAH, "SONY", "Identificator7", new User(7, "Gudrun", "Kren", "Paris", 899000)));
        set.add(new Order(8, 100000, Currency.USD, "Apple", "Identificator8", new User(8, "Rodger", "Luccy", "Paris", 50000000)));
        set.add(new Order(10, 100, Currency.USD, "Razer", "Identificator9", new User(10, "Donald", "Dack", "Kiev", 40000)));
        set.add(new Order(10, 100, Currency.USD, "Razer", "Identificator10", new User(10, "Erl", "Brize", "Kiev", 40000)));


        System.out.println(o.checkIfContains(set));

    }
}
