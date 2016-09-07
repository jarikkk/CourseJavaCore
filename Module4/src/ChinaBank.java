
public class ChinaBank extends Bank {
    @Override
    int getLimitOfWithdrawal() {
        int withdrawal = 0;
        if (getCurrency().equals(currency.USD)) withdrawal = 100;
        else if (getCurrency().equals(currency.EUR)) withdrawal = 150;
        return withdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitFund = 0;
        if (getCurrency().equals(currency.EUR)) limitFund = 5000;
        else if (getCurrency().equals(currency.USD)) limitFund = 10000;
        return limitFund;
    }

    @Override
    int getMonthlyRate() {
        int rate = 0;
        if (getCurrency().equals(currency.USD)) rate = 1;
        else if (getCurrency().equals(currency.EUR)) rate = 0;
        return rate;
    }

    @Override
    int getCommission(int i) {
        int commission = 0;
        if (getCurrency() == Currency.USD) {
            if (i < 1000) commission = 3;
            else if (i > 1000) commission = 5;
        }
        else if (getCurrency().equals(currency.EUR)) {
            if (i < 1000) commission = 10;
            else if (i > 1000) commission = 11;
        }
        return commission;
    }

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);


    }
}
