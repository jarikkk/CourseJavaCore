
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int withdrawal = 0;
        if (getCurrency() == currency.USD) withdrawal = 1000;
        else if (getCurrency() == currency.EUR) withdrawal = 1200;
        return withdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitFund = 0;
        if (getCurrency().equals(currency.EUR)) limitFund = 10000;
        else limitFund = 2147483647;
        return limitFund;
    }

    @Override
    int getMonthlyRate() {
        int rate = 0;
        if (getCurrency().equals(currency.USD)) rate = 1;
        else if (getCurrency().equals(currency.EUR)) rate = 2;
        return rate;
    }

    @Override
    int getCommission(int i) {
        int commission = 0;
        if (getCurrency() == Currency.USD) {
            if (i < 1000) commission = 5;
            else if (i > 1000) commission = 7;
        }
        else if (getCurrency().equals(currency.EUR)) {
            if (i < 1000) commission = 6;
            else if (i > 1000) commission = 8;
        }
        return commission;
    }
}
