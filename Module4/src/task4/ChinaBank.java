package task4;


import task4.Bank;
import task4.Currency;

public class ChinaBank extends Bank {

    public ChinaBank(Currency currency) {
        super(currency);
    }

    @Override
    int getLimitOfWithdrawal() {
        int withdrawal = 0;
        if (getCurrency().equals(Currency.USD)) withdrawal = 100;
        else if (getCurrency().equals(Currency.EUR)) withdrawal = 150;
        return withdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitFund = 0;
        if (getCurrency().equals(Currency.EUR)) limitFund = 5000;
        else if (getCurrency().equals(Currency.USD)) limitFund = 10000;
        return limitFund;
    }

    @Override
    int getMonthlyRate() {
        int rate = 0;
        if (getCurrency().equals(Currency.USD)) rate = 1;
        else if (getCurrency().equals(Currency.EUR)) rate = 0;
        return rate;
    }

    @Override
    int getCommission(int i) {
        int commission = 0;
        if (getCurrency() == Currency.USD) {
            if (i < 1000) commission = 3;
            else if (i > 1000) commission = 5;
        }
        else if (getCurrency().equals(Currency.EUR)) {
            if (i < 1000) commission = 10;
            else if (i > 1000) commission = 11;
        }
        return commission;
    }


}
