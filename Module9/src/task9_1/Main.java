package task9_1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

        System.out.println("List of unsorted orders: " + list);
        Collections.sort(list, (Order o1, Order o2) -> o1.getPrice() - o2.getPrice());
        System.out.println("List of sorted orders with increase_________________________________________________________________ ");
        list.forEach((Order)->System.out.println(Order));
        System.out.println("_____________________________________________________________________________________________________");


        list.sort((Order o1, Order o2) -> {
            if (o1.getPrice() > o2.getPrice()) {
                return -1;
            }
            if (o1.getPrice() < o2.getPrice()) {

                return 1;
            }
            if (o1.getPrice() == o2.getPrice()) return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            else {
                return 0;
            }
        });
        System.out.println("List of sorted orders with decrease and city______________________________________________________________________");
        list.forEach((Order)->System.out.println(Order));
        System.out.println("___________________________________________________________________________________________________________________");

        list.sort(Comparator.comparing(Order::getItemName).thenComparing(Order::getShopIdentificator) );





    }
}
