package task6_6;

import task6_5.UserUtils;
import task6_4.User;

public class Main {

    public static void main(String[] args) {

        int[] id = {1, 2, 3, 4, 5};
        String[] firstName = {"Jack", "Jonny", "Bob", "Gudrun", "Gena"};
        String[] lastName = {"Jaince", "Bons", "Marly", "Muller", "Ivanov"};
        int[] salary = {19000, 30000, 17000, 50000, 100000};
        int[] balance = {30000, 10000, 35000, 350000, 1537988};


        User [] user = new User[id.length];
        for (int i = 0; i < user.length; i++) {
            user[i] = new User(id[i], firstName[i], lastName[i], salary[i], balance[i]);
        }



        UserUtils.uniqueUsers(user);
        UserUtils.usersWithContitionalBalance(user, 100000);
        UserUtils.paySalaryToUsers(user);
        UserUtils.getUsersId(user);
        UserUtils.deleteEmptyUsers(user);





    }
}
