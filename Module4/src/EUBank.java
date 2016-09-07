
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int withdrawal = 0;
        if (getCurrency().equals(currency.USD)) withdrawal = 2000;
        else if (getCurrency().equals(currency.EUR)) withdrawal = 2200;
        return withdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitFund = 0;
        if (getCurrency().equals(currency.EUR)) limitFund = 20000;
        else if (getCurrency().equals(currency.USD)) limitFund = 10000;
        return limitFund;
    }

    @Override
    int getMonthlyRate() {
        int rate = 0;
        if (getCurrency().equals(currency.USD)) rate = 0;
        else if (getCurrency().equals(currency.EUR)) rate = 1;
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
            if (i < 1000) commission = 2;
            else if (i > 1000) commission = 4;
        }
        return commission;
    }
}
