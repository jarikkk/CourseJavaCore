package task4;


public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        double summ;

        Bank userBank = user.getBank();
        summ = amount + userBank.getCommission(amount) * 0.01 * amount;

        if (userBank.getLimitOfWithdrawal() >= summ) user.setBalance(user.getBalance() - summ);

    }

    @Override
    public void fundUser(User user, int amount) {

        Bank userBank = user.getBank();

        if (userBank.getLimitOfFunding() >= amount) user.setBalance(user.getBalance() + amount - userBank.getCommission(amount));
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double summ1;

        Bank userBank1 = fromUser.getBank();
        Bank userBank2 = toUser.getBank();

        summ1 = amount + userBank1.getCommission(amount) * 0.01 * amount;

        if (userBank1.getLimitOfWithdrawal() >= summ1 && userBank2.getLimitOfFunding() >= amount)
            fromUser.setBalance(fromUser.getBalance() - summ1);
        toUser.setBalance(toUser.getBalance() + amount);
    }

    @Override
    public void paySalary(User user) {

        Bank userBank = user.getBank();

        user.setBalance(user.getBalance() + user.getSalary());
    }
}
