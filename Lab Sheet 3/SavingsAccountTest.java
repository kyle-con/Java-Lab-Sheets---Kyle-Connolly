public class lab3q2 {

    public static void main(String[] args) 
    {
        //Instantiate two different savingsAccount objects
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        //Testing ID numbers with extra objects
        /SavingsAccount saver3 = new SavingsAccount();
        SavingsAccount saver4 = new SavingsAccount();
        System.out.println(saver3.toString());
        System.out.println(saver4.toString());/

        //Set the balances of both objects
        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);

        //Set interest rate to 4% (0.04) 
        SavingsAccount.modifyInterestRate(0.04);

        //Test
        //System.out.println(saver1.getAnnualInterestRate());

        //Call calculate monthly interest method for each object
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        //Output balance at 4% interest rate
        System.out.println("4% Interest Rate");
        System.out.printf("Balance Saver1: %.2f \n",saver1.getSavingsBalance());
        System.out.printf("Balance Saver2: %.2f \n",saver2.getSavingsBalance());

        //Set interest rate to 5% (0.05) 
        SavingsAccount.modifyInterestRate(0.05);

        //Call calculate monthly interest method for each object
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        //Output balance at 5% interest rate
        System.out.println("5% Interest Rate");
        System.out.printf("Balance Saver1: %.2f \n",saver1.getSavingsBalance());
        System.out.printf("Balance Saver2: %.2f \n",saver2.getSavingsBalance());

    }

}