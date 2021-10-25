public class SavingsAccount {

    private int accId;
    private static int rollingNum = 1;
    private double savingsBalance;
    public static double annualInterestRate;
    double interestRate;



    public SavingsAccount() 
    {
        this.savingsBalance = savingsBalance;
        annualInterestRate = 0.0;
        this.accId = rollingNum++;
    }

    //Setters & Getters
    public double getSavingsBalance() 
    {
        return savingsBalance;
    }


    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public void setSavingsBalance(double savingsBalance) 
    {
        this.savingsBalance = savingsBalance;
    }


    public static double getAnnualInterestRate() 
    {
        return annualInterestRate;
    }


    public static void setAnnualInterestRate(int annualInterestRate) 
    {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    //Calculate Monthly interest method
    public double calculateMonthlyInterest() 
    {
        double interestRate = (savingsBalance * annualInterestRate/12);
        savingsBalance = savingsBalance + interestRate;
        return interestRate;
    }
    //Modify the interest rate method
    public static void modifyInterestRate(double newInterestRate) 
    {
        annualInterestRate = newInterestRate;
    }


    //toString for testing
    public String toString() {
        return "SavingsAccount [accId=" + accId + ", savingsBalance=" + savingsBalance + ", interestRate= ]";
    }


}