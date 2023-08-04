package mp5_bcherry;

import java.time.LocalDate;
import java.text.DecimalFormat;

class Account 
{
	
	// Variables
	
    private String accountNumber;
    private double balance;
    private LocalDate dateCreated;

    public Account(String accountNumber, double balance) 
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateCreated = LocalDate.now();
    }

    public String getAccountNumber() 
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) 
    {
        this.accountNumber = accountNumber;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public LocalDate getDateCreated() 
    {
        return dateCreated;
    }

    public void withdraw(double amount) 
    {
    }

    public void deposit(double amount) 
    {
    
    }
}

// Checking

class CheckingAccount extends Account 
{
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) 
    {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() 
    {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) 
    {
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) 
    {
        if (getBalance() - amount >= -overdraftLimit) 
        {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Withdrawal amount exceeds the overdraft limit. Transaction rejected.");
        }
    }
 
    public void deposit(double amount) 
    {
        setBalance(getBalance() + amount);
    }

    public String toString() 
    {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return "Checking Account\n" +
                "Account No: " + getAccountNumber() + "\n" +
                "Account Balance: $" + decimalFormat.format(getBalance()) + "\n" +
                "Date Created: " + getDateCreated() + "\n" +
                "Overdraft Limit: $" + decimalFormat.format(overdraftLimit);
    }
}

// Savings

class SavingAccount extends Account 
{
    private static final double ANNUAL_INTEREST_RATE = 0.02;
    private static final double MONTHLY_FEE = 10.00;
    private double minDeposit;

    public SavingAccount(String accountNumber, double balance, double minDeposit) 
    {
        super(accountNumber, balance);
        this.minDeposit = minDeposit;
    }

    public double getMinDeposit() 
    {
        return minDeposit;
    }

    public void setMinDeposit(double minDeposit) 
    {
        this.minDeposit = minDeposit;
    }

   
    public void withdraw(double amount) 
    {
        if (getBalance() - amount >= 0) 
        {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Withdrawal amount exceeds the account balance. Transaction rejected.");
        }
    }

    
    public void deposit(double amount) 
    {
        if (amount >= minDeposit) 
        {
            setBalance(getBalance() + amount);
        } else 
        {
            System.out.println("Deposit amount is less than the minimum deposit requirement. Transaction rejected.");
        }
    }

    
    public String toString() 
    {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        double interest = getBalance() * ANNUAL_INTEREST_RATE / 12;
        double newBalance = getBalance() + interest - MONTHLY_FEE;

        StringBuilder sb = new StringBuilder();
        sb.append("Saving Account\n");
        sb.append("Account No: ").append(getAccountNumber()).append("\n");
        sb.append("Account Balance: $").append(decimalFormat.format(getBalance())).append("\n");
        sb.append("Date Created: ").append(getDateCreated()).append("\n");
        sb.append("Annual Interest Rate: ").append(decimalFormat.format(ANNUAL_INTEREST_RATE * 100)).append("%\n");
        sb.append("Monthly Fee: $").append(decimalFormat.format(MONTHLY_FEE)).append("\n");
        sb.append("Minimum Deposit Amount: $").append(decimalFormat.format(minDeposit)).append("\n");
        sb.append("New Balance will be: $").append(decimalFormat.format(newBalance));

        return sb.toString();
    }
}