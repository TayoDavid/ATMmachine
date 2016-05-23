/**
 * Created by Omotayo on 11/05/2016.
 */
public class Account {
    private String accName;
    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;

    public Account () {
        this.balance = 100;
        dateCreated = new java.util.Date();
    }

    public Account (int id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance;
        dateCreated = new java.util.Date();
    }

    public Account (int id, double initialBalance, double annualInterestRate) {
        this.id = id;
        this.balance = initialBalance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new java.util.Date();
    }

    public void setName (String name) {
        this.accName = name;
    }

    public String getAccName() {
        return accName;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double newBalance) {
        this.balance = newBalance;
    }

    public double getAnnualInterestRate () {
        return annualInterestRate;
    }

    public void setAnnualInterestRate (double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public java.util.Date getDateCreated () {
        return dateCreated;
    }

    public double getMonthlyInterest() {
        double monthlyIntRate = annualInterestRate / 12;
        return balance * monthlyIntRate;
    }

    public void withdrawal(double amountToWithdraw) {
        if (balance > amountToWithdraw) {
            balance = balance - amountToWithdraw;
            System.out.println("You have withdrawn $" + amountToWithdraw +" from your account" +
                    "\nThe new balance is: $" + balance);
        }
        else {
            System.out.println("Insufficient balance.");
            System.out.println("Your balance is $" + balance);
        }
    }

    public void deposit(double amountToDeposit) {
        balance = balance + amountToDeposit;
        System.out.println("Your account has been credited with $" + amountToDeposit);
        System.out.println("Your account balance is $" + balance);
    }
}
