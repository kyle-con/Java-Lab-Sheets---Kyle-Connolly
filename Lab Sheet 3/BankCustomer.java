public class BankCustomer
{
    private SavingsAccount[] accounts = new SavingsAccount[3];
    private int numberOfAccounts = 0;
    public BankCustomer(String name, String address)
    {
    }

    public void addAccount(int j)
    {
        for(int i = 0; i < j; i++)
        accounts[numberOfAccounts] = new SavingsAccount();
        numberOfAccounts++;
    }

    public Double balance()
    {
        double balance = 0;
        for(int i = 0; i < numberOfAccounts; i++)
        {
            balance += accounts[i].getSavingsBalance();
        }
        return(balance);
    }

    public void setBalance(int i, double j)
    {
        accounts[i].setSavingsBalance(j);
    }

    public void accountsSummary()
    {
        System.out.println("Summary of accounts:");
        for(int i = 0; i < numberOfAccounts; i++)
        {
            System.out.println(i + ":   Account number = " + accounts[i].getAccId() + ";   Savings balance = " + accounts[i].getSavingsBalance());
        }
        System.out.println("Total balance: " + balance());
    }
}