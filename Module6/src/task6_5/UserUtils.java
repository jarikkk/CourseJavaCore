package task6_5;

import task6_4.User;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {

        User[] tmp = new User[users.length];
        User[] uniqueUsersFound = new User[users.length];

        for (int i = 0; i < users.length; i++) {
            tmp[i] = users[i];

            for (int j = 0; j < users.length; j++) {
                if (!users[j].equals(tmp[i])) {
                    uniqueUsersFound[i] = tmp[i];
                    if (users[j].equals(tmp)) {
                        tmp = null;
                    }
                }
            }

        }
        return uniqueUsersFound;
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {

        User[] usersWithContitionalBalance = new User[users.length];
        User[] allUsers = new User[users.length];

        for (int i = 0; i < users.length; i++) {
            allUsers[i] = users[i];
            if (allUsers[i].getBalance() == balance) {
                usersWithContitionalBalance[i] = users[i];
            }

        }


        return usersWithContitionalBalance;


    }

    public static final User[] paySalaryToUsers(User[] users) {

        User[] userForsalary = new User[users.length];

        for (int i = 0; i < users.length; i++) {
            userForsalary[i] = users[i];
            if (users[i].equals(userForsalary[i])) {
                userForsalary[i].setBalance(userForsalary[i].getBalance() + userForsalary[i].getSalary());
            }
        }

        return userForsalary;
    }

    public static final long[] getUsersId(User[] users) {

        long[] idOfusers = new long[users.length];

        for (int i = 0; i < users.length; i++){
            if (users[i].equals(users[i])){
                idOfusers[i] = users[i].getId();
            }
        }

        return idOfusers;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        return null;
    }


}
