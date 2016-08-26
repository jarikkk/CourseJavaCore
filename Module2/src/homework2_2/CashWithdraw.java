package homework2_2;

public class CashWithdraw {

    static double withdrawBalance(double balance, double withdrawal1, double commision) {
        double result1 = 0.;

        double result2 = withdrawal1 * commision / 100;
        result1 = balance - withdrawal1 - result2;

        return result1;
    }

    static void printResult(double balanceAfter, double commision) {
        if (balanceAfter >= 0) {
            System.out.println("OK " + commision + " " + balanceAfter);
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {

        double balance = 100;
        double withdrawal1 = 10;
        double commision = 5.;
        double balanceAfter = withdrawBalance(balance, withdrawal1, commision);

        printResult(balanceAfter, commision);


    }


}
