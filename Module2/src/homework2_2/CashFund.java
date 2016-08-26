package homework2_2;

public class CashFund {

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

    static double fundBalance(String ownerName, double fund) {
        double result = 0;
        int index = searchOwner(ownerName);
        double balance = searchBalance(balances, index);

        result = balance + fund;

        return result;
    }



    public static void main(String[] args) {

        String clientName = "Jack";
        double withdrawal = 100;

        System.out.println(clientName + " " + fundBalance(clientName, withdrawal));

    }
}
