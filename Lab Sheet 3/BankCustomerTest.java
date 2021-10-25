public class BankCustomerTest
{
    public static void main (String args[])
    {
        BankCustomer customer1 = new BankCustomer("Kyle", "45 Mainstreet, Ireland");
        BankCustomer customer2 = new BankCustomer("John", "69 San Andreas, 'Merika");
        customer1.addAccount(3);
        customer1.setBalance(1, 2689.09);
        customer1.setBalance(2, 0.05);
        customer1.setBalance(3, 9001);
        customer2.addAccount(2);
        customer2.setBalance(1, 54);
        customer2.setBalance(2, 8888892.76);
        System.out.println(customer1.balance());
        System.out.println(customer2.balance());
        System.out.println();
        System.out.println("Customer 1:");
        customer1.accountsSummary();
        customer2.accountsSummary();

    }
}