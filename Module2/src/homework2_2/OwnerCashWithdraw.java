package homework2_2;

public class OwnerCashWithdraw {
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static int[] balances = {1200, 250, 2000, 500, 3200};

    static int searchOwner(String ownerName) {
        int index = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) index = i;

        }
        return index;
    }

    static double searchBalance(int[] balances, int searchBalance) {
        int balance = 0;

        for (int i = 0; i < balances.length; i++) {
            if (i == searchBalance) balance = balances[i];
        }
        return balance;
    }

    static double withdrawBalance(String ownerName, double withdrawal2, double commision) {
        double result1 = 0;
        String name = ownerName;
        int index = searchOwner(ownerName);
        double balance2 = searchBalance(balances, index);

        double result2 = withdrawal2 * commision / 100;
        result1 = balance2 - withdrawal2 - result2;

        return result1;
    }

    double commision = 5.;
    String ownerName = "Oww";//task3 case
    double withdrawal2 = 100;
    double balanceAfter2 = withdrawBalance(ownerName, withdrawal2, commision);


}
