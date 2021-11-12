public class MyHr
{
    public Office[] offices = new Office[3];
    public Employee[] employees = new Employee[5];

    public MyHr()
    {
        for(int i = 0; i < offices.length; i++)
        {
            offices[i] = new Office();
        }
    }

    public void setEmployee(int itterations)
    {
        itterations = ((itterations > 0 && itterations <= 5) ? itterations : 1);
        for(int i = 0; i < itterations; i++)
        {
            if(Employee.numberOfEmployees != employees.length)
            {
                for(int j = 0; j < employees.length; j++)
                {
                    if(employees[j] == null)
                    {
                        employees[j] = new Employee();
                        break;
                    }
                }
            }
            else
            {
                System.out.println("You already have 5 employees");
            }
        }
    }

    public void listOffices()
    {
        for(int i = 0; i < offices.length; i++)
        {
            System.out.println("------------------------------");
            for(String string : offices[i].officeToString())
            {
                System.out.println(string);
            }
            System.out.println("------------------------------");
            System.out.println();
        }
    }

    public void listEmployees()
    {
        for(int i = 0; i < Employee.numberOfEmployees; i++)
        {
            System.out.println("------------------------------");
            for(String string : employees[i].employeeToString())
            {
                System.out.println(string);
            }
            System.out.println("------------------------------");
            System.out.println();
        }
    }

    public void listEmployees(Office office)
    {
        for(int i = 0; i < office.numberOfEmployees; i++)
        {
            System.out.println("------------------------------");
            for(String string : employees[i].employeeToString())
            {
                System.out.println(string);
            }
            System.out.println("------------------------------");
            System.out.println();
        }
    }

    public int getNumberOfOffices()
    {
        return(Office.numberOfOffices);
    }

    public int getNumberOfEmployees()
    {
        return(Employee.numberOfEmployees);
    }
}