package task6_5;

import task6_4.User;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {

        User[] tmp = new User[users.length];

        User[] uniqueUsersFound = new User[users.length];

        for (int i = 0; i < users.length; i++) {
            tmp[i] = users[i];

            for (int j = 0; j < users.length; j++) {
                if (!users[j].equals(tmp)) {
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
        User user = new User(0, null, null, 0, balance);
        User [] usersWithContitionalBalance = new User[users.length];
        for (int i = 0; i < users.length; i++)
        if (user.getBalance() == balance) {
            user = users[i];
        }
        return users;




    }

    public static final User[] paySalaryToUsers(User[] users) {
        return null;
    }

    public static final long[] getUsersId(User[] users) {
        return null;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        return null;
    }


}
