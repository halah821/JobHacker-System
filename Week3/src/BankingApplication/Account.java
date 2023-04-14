package BankingApplication;

public class Account {
    private  final Integer AccountNumber;
    private String AccountHolderName;
    private Double balance=0.0;

    public Account(Integer accountNumber, String accountHolderName, Double balance) {
        AccountNumber = accountNumber;
        AccountHolderName = accountHolderName;
        this.balance = balance;
    }

    public Integer getAccountNumber() {
        return AccountNumber;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double depositedAmount){
        Double newBalance = getBalance()+depositedAmount;
        setBalance(newBalance);
    }

    public void withdraw(Double withdrawedAmount){
        Double newBalance = getBalance()-withdrawedAmount;
        setBalance(newBalance);
    }

}
