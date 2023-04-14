package BankingApplication;

import java.util.ArrayList;

public class Bank {

    //Account[] accounts =new Account[3]; //Arrays has fixed size //require specific number of elements.
    ArrayList<Account> accounts = new ArrayList<Account>();

    public void addNewAccount(Account account){
        accounts.add(account);
    }

    public void depositeIntoAccount(Integer accountNo,Double depositedAmount){
        for (Account account:accounts){
            if (account.getAccountNumber() == accountNo)
            {
                account.deposit(depositedAmount);
            }
        }

    }
    public void withdrawFromAccount(Integer accountNo,Double withdrawedAmount){
        for (Account account:accounts){
            if (account.getAccountNumber() == accountNo)
            {
                account.withdraw(withdrawedAmount);
            }
        }

    }
    public Double displayBalanceOfAccount(Integer accountNo){
        for (Account account:accounts){
            if (account.getAccountNumber() == accountNo)
            {
                return account.getBalance();
            }
        }
        return null;
    }

    public Double calculateInterestRateOfAccount(Integer accountNo){
        for (Account account:accounts){
            if (account.getAccountNumber() == accountNo)
            {
                SavingsAccount savingsAccount=new SavingsAccount(account);
                return savingsAccount.CalculateInterestRate(account);
            }
        }
        return null;
    }

}
