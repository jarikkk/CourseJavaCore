package task4;


import task4.Bank;
import task4.Currency;

public class EUBank extends Bank {


    public EUBank(Currency currency) {
        super(currency);
    }

    @Override
    int getLimitOfWithdrawal() {
        int withdrawal = 0;
        if (getCurrency().equals(Currency.USD)) withdrawal = 2000;
        else if (getCurrency().equals(Currency.EUR)) withdrawal = 2200;
        return withdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitFund = 0;
        if (getCurrency().equals(Currency.EUR)) limitFund = 20000;
        else if (getCurrency().equals(Currency.USD)) limitFund = 10000;
        return limitFund;
    }

    @Override
    int getMonthlyRate() {
        int rate = 0;
        if (getCurrency().equals(Currency.USD)) rate = 0;
        else if (getCurrency().equals(Currency.EUR)) rate = 1;
        return rate;
    }

    @Override
    int getCommission(int i) {
        int commission = 0;
        if (getCurrency() == Currency.USD) {
            if (i < 1000) commission = 5;
            else if (i > 1000) commission = 7;
        }
        else if (getCurrency().equals(Currency.EUR)) {
            if (i < 1000) commission = 2;
            else if (i > 1000) commission = 4;
        }
        return commission;
    }
}
