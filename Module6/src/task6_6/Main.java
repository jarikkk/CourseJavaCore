package task6_6;

import task6_5.UserUtils;
import task6_4.User;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(1, "Jack", "Jackson", 5000, 100000);
        user1.uniqueUsers();
        user1.usersWithContitionalBalance();
        user1.paySalaryToUsers();
        user1.getUsersId();
        user1.deleteEmptyUsers();
        
    }
}
