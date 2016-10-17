package task7_1;

import java.lang.Enum;
import java.util.*;

public class Order implements Comparator<Order>, Comparable<Order> {


    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;


    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }


    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int compare(Order o1, Order o2) {
        return 0;
    }

    public static Comparator<Order> comparatorToIncrease = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };

    public static Comparator<Order> comparatorToDeacreaseAndCityOrder = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
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
        }
    };

    public static Comparator<Order> comparatorItemAndShopIdAndUserCity = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            int result1 = o1.getItemName().compareTo(o2.getItemName());
            int result2 = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            int result3 = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            if (result1 != 0) return result1;
            if (result1 == 0) return result2;
            if (result2 == 0) return result3;
            else return 0;

        }
    };

    public static List deleteDublicate(List<Order> list) {
        HashSet set = new HashSet(list);
        list.clear();
        list.addAll(set);
        return list;
    }

    public static List deleteItemByRule(List<Order> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 1500) list.remove(i);
        }
        return list;
    }

    public static List[] seprateByCurrency(List<Order> list) {
        List[] result = new ArrayList[2];
        List<Order> result1 = new ArrayList<Order>();
        List<Order> result2 = new ArrayList<Order>();

        for (Order o : list
                ) {
            if (o.getCurrency() == Currency.UAH) result1.add(o);
            if (o.getCurrency() == Currency.USD) result2.add(o);
        }

        result[0] = (List) result1;
        result[1] = (List) result2;
        return result;

    }

    public static List[] separateList(List<Order> list) {

        HashSet<String> set = new HashSet<String>();
        List<String> cities = new ArrayList<>();
        List[] result = new ArrayList[3];

        List<Order> result1 = new ArrayList<Order>();
        List<Order> result2 = new ArrayList<Order>();
        List<Order> result3 = new ArrayList<Order>();

        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i).getUser().getCity());
        }

        for (String item :
                set) {
            cities.add(item);

        }

        for (Order o : list) {
            if (o.getUser().getCity() == cities.get(0)) result1.add(o);
            if (o.getUser().getCity() == cities.get(1)) result2.add(o);
            if (o.getUser().getCity() == cities.get(2)) result3.add(o);
        }
        result[0] = result1;
        result[1] = result2;
        result[2] = result3;

        return result;

    }

    public static boolean checkIfContains(Set<Order> set) {
        boolean check = false;
        String s = "Petrov";
        Iterator<Order> iterator = set.iterator();

        while (iterator.hasNext()) {
            String result = iterator.next().getUser().getLastName();

            if (result.contains(s)) {
                check = true;
            }

        }
        return check;
    }

    public static void deleteOrdersithUsd(Set<Order> set) {
        Set<Order> result = set;
        Iterator<Order> iterator = result.iterator();

        while (iterator.hasNext()) {
            Enum e = (Enum) iterator.next().getCurrency();
            if (e == Currency.USD) iterator.remove();

        }
        System.out.println(result);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (price != order.price) return false;
        if (currency != order.currency) return false;
        if (!itemName.equals(order.itemName)) return false;
        if (!shopIdentificator.equals(order.shopIdentificator)) return false;
        return user.equals(order.user);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + currency.hashCode();
        result = 31 * result + itemName.hashCode();
        result = 31 * result + shopIdentificator.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }


    @Override
    public int compareTo(Order o) {

        return user.getLastName().compareTo(o.getUser().getLastName());
    }
}
