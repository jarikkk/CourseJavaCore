package task6_6;

import task6_5.UserUtils;
import task6_4.User;

public class Main {

    public static void main(String[] args) {

        int[] id = {0, 2, 3, 4, 5};
        String[] firstName = {null, "Jonny", "Bob", "Gudrun", "Gena"};
        String[] lastName = {null, "Bons", "Marly", "Muller", "Ivanov"};
        int[] salary = {0, 30000, 17000, 50000, 100000};
        int[] balance = {0, 10000, 35000, 350000, 1537988};

        User [] user1 = new User[id.length];
        user1[0] = new User(0, "Jon", "lol", 30000, 10000);
        user1[1] = new User(0, "Jon", "lol", 30000, 10000);
        user1[2] = null;
        user1[3] = new User(0, "Jon", "lol", 30000, 10000);
        user1[4] = new User(0, "Jon", "lol", 30000, 10000);


        User [] user = new User[id.length];
        for (int i = 0; i < user.length; i++) {
            user[i] = new User(id[i], firstName[i], lastName[i], salary[i], balance[i]);
        }



        UserUtils.uniqueUsers(user);
        UserUtils.usersWithContitionalBalance(user, 100000);
        UserUtils.paySalaryToUsers(user);
        UserUtils.getUsersId(user);
        UserUtils.deleteEmptyUsers(user1);





    }
}
