public class Driver
{
    public static void main(String args[])
    {
        MyHr hr = new MyHr();

        hr.setEmployee(5);
        hr.employees[0].setType(1);
        hr.employees[0].setAddress("Mainstreet", "Maynooth", "Kildare");
        hr.employees[0].setCar("blue 211 toyota yaris");
        hr.employees[0].setOffice(hr.offices[1]);
        for(String string : hr.employees[0].employeeToString())
        {
            System.out.println(string);
        }
        System.out.println();

        hr.employees[1].setType(0);
        hr.employees[1].setAddress("central park", "Dundrum", "Kildare");
        hr.employees[1].setCar("red 192 toyota corolla");
        hr.employees[1].setOffice(hr.offices[1]);
        for(String string : hr.employees[1].employeeToString())
        {
            System.out.println(string);
        }
        System.out.println();

        hr.listEmployees();
        System.out.println();
        
        hr.listOffices();
        System.out.println();

        hr.listEmployees(hr.offices[1]);
    }
}