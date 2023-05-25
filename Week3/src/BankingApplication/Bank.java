package BankingApplication;

import java.util.ArrayList;

public class Bank {


    ArrayList<Account> accounts = new ArrayList<>();

    public void addNewAccount(Account account){

        accounts.add(account);
    }

    public void depositIntoAccount(String accountNo, Double depositedAmount){
        for (Account account:accounts){
            if (account.getAccountNumber().equals(accountNo))
            {
                account.deposit(depositedAmount);
            }
        }

    }
    public void withdrawFromAccount(String accountNo,Double withdrawAmount){
        for (Account account:accounts){
            if (account.getAccountNumber().equals(accountNo))
            {
                account.withdraw(withdrawAmount);
            }
        }

    }
    public Double displayBalanceOfAccount(String accountNo){
        for (Account account:accounts){
            if (account.getAccountNumber().equals(accountNo))
            {
                return account.getBalance();
            }
        }
        return null;
    }

    public Double calculateInterestRateOfAccount(String accountNo){
        for (Account account:accounts){
            if (account.getAccountNumber().equals(accountNo))
            {
                SavingsAccount savingsAccount=new SavingsAccount(account);
                return savingsAccount.CalculateInterestRate(account);
            }
        }
        return null;
    }

}
