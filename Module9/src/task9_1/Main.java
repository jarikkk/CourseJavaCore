package task9_1;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Order> list = new ArrayList<>();


        list.add(new Order(1, 10000, Currency.UAH, "ASUS", "Identificator1", new User(1, "Jack", "Jackson", "Kiev", 100000)));
        list.add(new Order(2, 1000, Currency.USD, "Lenovo", "Identificator2", new User(2, "Jack", "Jackson", "Kiev", 1000000)));
        list.add(new Order(3, 600000, Currency.UAH, "Sumsung", "Identificator3", new User(3, "Jack", "Jackson", "Kiev", 700000)));
        list.add(new Order(4, 20000, Currency.USD, "Sparc", "Identificator4", new User(4, "Jack", "Jackson", "Berlin", 30000)));
        list.add(new Order(5, 2000000, Currency.UAH, "hp", "Identificator5", new User(5, "Jack", "Jackson", "Berlin", 300000000)));
        list.add(new Order(6, 7000, Currency.USD, "DELL", "Identificator6", new User(6, "Jack", "Jackson", "Berlin", 2453875)));
        list.add(new Order(7, 300000, Currency.UAH, "SONY", "Identificator7", new User(7, "Jack", "Jackson", "Paris", 899000)));
        list.add(new Order(8, 100000, Currency.USD, "Apple", "Identificator8", new User(8, "Jack", "Jackson", "Paris", 50000000)));
        list.add(new Order(10, 100, Currency.USD, "Razer", "Identificator9", new User(10, "Jack", "Jackson", "Kiev", 40000)));
        list.add(new Order(10, 100, Currency.USD, "Razer", "Identificator9", new User(10, "Jack", "Jackson", "Kiev", 40000)));

        System.out.println("List of unsorted orders: " + list);
        Collections.sort(list, (Order o1, Order o2) -> o1.getPrice() - o2.getPrice());
        System.out.println("\n" + "List of sorted orders with increase: ");
        list.forEach((Order) -> System.out.println(Order));


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
        System.out.println("\n" + "List of sorted orders with decrease and city:");
        list.forEach((Order) -> System.out.println(Order));


        list.sort(Comparator.comparing((Order o1) -> o1.getItemName()).
                thenComparing(o1 -> o1.getShopIdentificator()).
                thenComparing(o1 -> o1.getUser().getCity()));
        System.out.println("\n" + "List of sorted orders with item, identity and city:");
        list.forEach((Order) -> System.out.println(Order));

        List<Order> listWithoutDublicate = list.parallelStream().distinct().collect(Collectors.toList());
        System.out.println("\n" + "List without dublicates:");
        listWithoutDublicate.forEach((Order) -> System.out.println(Order));

        List<Order> deleteItemByRule = list.stream().filter(o -> o.getPrice() > 1500).collect(Collectors.toList());
        System.out.println("\n" + "List with price more than 1500:");
        deleteItemByRule.forEach((Order) -> System.out.println(Order));


        List<Order> uah = list.stream().filter(o -> o.getCurrency() == Currency.UAH).collect(Collectors.toList());
        List<Order> usd = list.stream().filter(o -> o.getCurrency() == Currency.USD).collect(Collectors.toList());
        System.out.println("\n" + "Lists with USD and UAH currency:");
        uah.forEach((Order) -> System.out.println(Order));
        usd.forEach((Order) -> System.out.println(Order));

        List<List<Order>> lists = new ArrayList<>();
        Map<String, List<Order>> listsBycity = list.stream().collect(Collectors.groupingBy(order -> order.getUser().getCity()));
        System.out.println("\n" + "Lists separated with cities:");
        listsBycity.forEach((s, orders) -> lists.add(orders));
        lists.forEach((Order) -> System.out.println(Order));
    }
}
