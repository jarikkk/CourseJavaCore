package task6_5;

import task6_4.User;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {

        User tmp = null;
        int count = 0;
        User[] uniqueUsersFound = new User[count];

        for (int i = 0; i < users.length; i++) {
            users[i] = tmp;
            count++;
            for (int j = 0; j < users.length; j++) {
                if (!users[j].equals(tmp)) {
                    uniqueUsersFound[i] = tmp;
                    if (users[j].equals(tmp)) {
                        tmp = null;
                    }
                }
            }

        }
        return uniqueUsersFound;
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        return null;
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
