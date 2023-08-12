package BankingApplication;

public class Account {
    private  final String accountNumber;
    private String accountHolderName;
    private Double balance=0.0;

    public Account(String accountNumber, String accountHolderName, Double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
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

    public void withdraw(Double withdrawAmount){
        if (this.getBalance().equals(0)) {
            System.out.println("your Balance is 0.0");
        }else {
            Double newBalance = getBalance()-withdrawAmount;
            setBalance(newBalance);
        }
    }

}
