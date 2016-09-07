
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        double newbalance = 0;
        double summ;

        Bank userBank = user.getBank();
        summ = amount + userBank.getCommission(amount) * 0.01 * amount;

        if (userBank.getLimitOfWithdrawal() >= summ) newbalance = user.getBalance() - summ;
        user.setBalance(newbalance);
    }

    @Override
    public void fundUser(User user, int amount) {
        double newbalance = 0;

        Bank userBank = user.getBank();

        if (userBank.getLimitOfFunding() >= amount)
            newbalance = user.getBalance() + amount - userBank.getCommission(amount);
        user.setBalance(newbalance);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double summ1;
        double summ2;
        double newbalance = 0;

        Bank userBank1 = fromUser.getBank();
        Bank userBank2 = toUser.getBank();

        summ1 = amount + userBank1.getCommission(amount) * 0.01 * amount;
        summ2 = amount - userBank2.getCommission(amount) * 0.01 * amount;

        if (userBank1.getLimitOfWithdrawal() >= summ1 && userBank2.getLimitOfFunding() >= amount)
            fromUser.setBalance(newbalance = fromUser.getBalance() - summ1);
        toUser.setBalance(newbalance = toUser.getBalance() + summ2);
    }

    @Override
    public void paySalary(User user) {
        double newbalance = 0;

        Bank userBank = user.getBank();

        user.setBalance(newbalance = user.getBalance() + user.getSalary());
    }
}
