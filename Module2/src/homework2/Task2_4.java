package homework2;

public class Task2_4 {
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static int[] balances = {1200, 250, 2000, 500, 3200};

    static int searchOwner(String ownerName) {
        int index = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) index = i;

        }
        return index;
    }

    static double fund(String ownerName, double withdrawal) {
        double result = 0;
        int index = searchOwner(ownerName);
        result = withdrawal + balances[index];

        return result;
    }

    static void printResult(String ownerName, double balanceAfter) {
        System.out.println(ownerName + " " + balanceAfter);
    }

    public static void main(String[] args) {

        String ownerName = "Ann";
        double withdrawal = 100;
        double balanceAfter = fund(ownerName,withdrawal);

        printResult(ownerName, balanceAfter);


    }


}
