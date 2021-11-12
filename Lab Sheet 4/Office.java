public class Office
{
	public static int numberOfOffices = 0;
	private int roomNumber = 100;
	public int numberOfEmployees = 0;
	private int employees[] = new int[2];
	
	public Office()
	{
		roomNumber += numberOfOffices++;
		for(int i = 0; i < employees.length; i++)
		{
			employees[i] = 0;
		}
	}

	public int getRoomNumber()
	{
		return(roomNumber);
	}
	
	public void setEmployee(int employeeNumber)
	{
		if(employees[employees.length - 1] == 0)
		{
			for(int i = 0; i < employees.length; i++)
			{
				if(employees[i] == 0)
				{
					employees[i] = employeeNumber;
					numberOfEmployees++;
					break;
				}
			}
		}
		else
		{
		    System.out.println("This room is at capacity");
		}
	}

	public int getNumberOfEmployees()
	{
		return(numberOfEmployees);
	}

	public String getEmployees()
	{
		return(((numberOfEmployees != 0) ? String.valueOf(employees[0]).concat(", ").concat(String.valueOf(employees[1])) : "There is no people in this room"));
	}

	public String[] officeToString()
	{
		String[] office = new String[3];
		office[0] = "Room Number: ".concat(String.valueOf(roomNumber));
		office[1] = "Number of employees: ".concat(String.valueOf(numberOfEmployees));
		office[2] = "Employee numbers: ".concat(getEmployees());
		return(office);
	}
}
