public class Account {
    private Customer customer = new Customer();
    private int accountNumber;
    private double balance;
    private String branch;

    public Account(Customer customer, int accountNumber, double balance)
    {
        this.customer=customer;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Account(Customer customer, int accountNumber, String branch)
    {
        this.customer=customer;
        this.accountNumber = accountNumber;
        this.branch = branch;
        balance = 0.0;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }
    public void credit(double c)
    {
        balance += c;
    }
    public void debit(double d)
    {
        if (d <= balance)
        {
            balance -= d;
        }
        else
        {
            System.out.print("Amount withdrawn exceeds the current balance!"+"\n");
        }

    }
    public void print()
    {
        System.out.print("Customer: "+this.getCustomerName()+" Branch: "+this.getBranch()+" A/C no: "+this.getAccountNumber()+" Balance: "+this.getBalance()+"\n");
    }
    public String getCustomerName()
    {
        return customer.getName();
    }
    public String getBranch()
    {
        return branch;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public Customer getCustomer()
    {
        return this.customer;
    }

}
