package BankingApplication;

public class SavingsAccount extends Account {
    private Double interestRate=0.0;

    public SavingsAccount(Account account) {
        super(account.getAccountNumber(), account.getAccountHolderName(),account.getBalance() );
    }

    public Double CalculateInterestRate(Account account){
        //Assume that interest rate is 8% per year
        interestRate = (account.getBalance()*8)/100;
        return interestRate;
    }
}
