package homework2_2;

import java.util.Arrays;

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


    static int balancesSum(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {
                sum += balance;
            }
        }
        return sum;
    }

    static String[] getOwnerNames(int[] balances, String[] names) {
        int ownersCount = 0;
        for (int balance : balances) {
            if (balance > 1000) ownersCount++;
        }

        String[] result = new String[ownersCount];

        int index = 0;
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] > 1000) {
                result[index] = names[i];
                index++;
            }
        }

        return result;
    }

    ///*тип возвращаемого значения*/void  /*название метода*/ (/*параметры*/) {
    //логика

    //return //что-то
    //}

    int testMethod(int element, double test1, char pool) {
        //logic
        return 0;
    }

    void testMethod2(int test, String name) {
        //logic
        System.out.println("test....");


    }

    //параметры
    //тип значения название параметра

    //HOMEWORK 2.1
    static double withdrawBalance(double balance, double withdrawal, double commision) {
        double result1 = 0.;

        double result2 = withdrawal * commision / 100;
        result1 = balance - withdrawal - result2;

        return result1;
    }

    //HOMEWORK 2.2
    static double withdrawBalance(String ownerName, double withdrawal, double commision) {
        double result1 = 0;
        String name = ownerName;
        //double result2 = withdrawal * commision / 100;
        return 0;
    }

    //HOMEWORK 2.3
    static double fundBalance(String ownerName, double fund) {

        return 0;
    }

    public static void main(String[] args) {

        double balance = 100;
        double withdrawal = 10;
        double commision = 5.;
        double balanceAfter = withdrawBalance(balance, withdrawal, commision);
        String ownerName = "Oww";


        if (balanceAfter >= 0) {
            System.out.println("OK " + commision + " " + balanceAfter);
        } else {
            System.out.println("NO");
        }

        System.out.println(searchOwner(ownerName));

        //int[] balances = {1200, 250, 2000, 500, 3200};

        // System.out.println(Arrays.toString(balances));


        // int[] balances1 = {200, 200, 500, 4000, 30};

    }


}
