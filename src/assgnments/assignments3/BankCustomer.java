package assgnments.assignments3;

public class BankCustomer {
    String customerName;
    int accountNumber;
    double balance;
    public BankCustomer(String customerName,int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankCustomer{" +
                "customerName='" + customerName + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
