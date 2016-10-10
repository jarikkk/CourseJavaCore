package task7_1;


import java.util.Comparator;

public class Order implements Comparator<Order> {


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
}
