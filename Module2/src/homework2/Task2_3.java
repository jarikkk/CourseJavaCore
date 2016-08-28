package homework2;

public class Task2_3 {
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static int[] balances = {1200, 250, 2000, 500, 3200};

    static int searchOwner(String ownerName) {
        int index = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) index = i;

        }
        return index;
    }


    static double withdrawBalance(String ownerName, double withdrawal, double commision) {
        double result1 = 0;
        String name = ownerName;
        int index = searchOwner(ownerName);
        double balance = balances[index];

        double result2 = withdrawal * commision / 100;
        result1 = balance - withdrawal - result2;

        return result1;
    }

    static void printResult(double balanceAfter, String ownerName, double withdrawal) {

        if (balanceAfter >= 0) {
            System.out.println(ownerName + " " + withdrawal + " " + balanceAfter);
        } else {
            System.out.println(ownerName + " NO");
        }
    }

    public static void main(String[] args) {

        double commision = 5;
        String ownerName = "Oww";
        double withdrawal = 100;
        double balanceAfter = withdrawBalance(ownerName, withdrawal, commision);

        printResult(balanceAfter, ownerName, withdrawal);

    }

}
