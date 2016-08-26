package homework2_2;

public class CashWithdraw {
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

    //HOMEWORK 2.2
    static double withdrawBalance(double balance, double withdrawal1, double commision) {
        double result1 = 0.;

        double result2 = withdrawal1 * commision / 100;
        result1 = balance - withdrawal1 - result2;

        return result1;
    }

    //HOMEWORK 2.3
    static double withdrawBalance(String ownerName, double withdrawal2, double commision) {
        double result1 = 0;
        String name = ownerName;
        int index = searchOwner(ownerName);
        double balance2 = searchBalance(balances, index);

        double result2 = withdrawal2 * commision / 100;
        result1 = balance2 - withdrawal2 - result2;

        return result1;
    }


    //HOMEWORK 2.4
    static double fundBalance(String ownerName, double fund) {

        return 0;
    }

    public static void main(String[] args) {

        double balance = 100;//task2 case
        double withdrawal1 = 10;
        double commision = 5.;
        double balanceAfter = withdrawBalance(balance, withdrawal1, commision);

        String ownerName = "Oww";//task3 case
        double withdrawal2 = 100;
        double balanceAfter2 = withdrawBalance(ownerName, withdrawal2, commision);


        if (balanceAfter >= 0) {//task2 case
            System.out.println("OK " + commision + " " + balanceAfter);
        } else {
            System.out.println("NO");
        }

        if (balanceAfter2 >= 0) {//task3 case
            System.out.println(ownerName + " " + withdrawal2 + " " + balanceAfter2);
        } else {
            System.out.println(ownerName + " NO");
        }


    }


}
