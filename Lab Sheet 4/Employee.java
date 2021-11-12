public class Employee
{
	public static int numberOfEmployees = 0;;
	private int employeeNumber = 1000;
	private int type = -1;
	private Address address = new Address();
	//private int recordNumber = 0;
	//private String records[] = new String[5];
	private String carDetails = "Details not specified";
	private int roomNumber = 0;
	
	public Employee()
	{
		employeeNumber += numberOfEmployees++;
	}
	public void setType(int type)
	{
		this.type = ((type == 1 || type == 0) ? type : -1);
	}

	public void setAddress(String street, String city, String county)
	{
		address.setAddress(street, city, county);
	}

	public void setCar(String description)
	{
		if(type == 1)
		{
			carDetails = description;
		}
	}	

	public void setOffice(Office office)
	{
		office.setEmployee(employeeNumber);
		roomNumber = office.getRoomNumber();
	}

	public int getEmployeeNumber()
	{
		return(employeeNumber);
	}

	public String getType()
	{
		String role;
		if(type == -1)
		{
			role = "No type specified";
		}
		else
		{
		    role = ((this.type == 1) ? "Manager" : "Employee");
		}
		return(role);
	}
	public String getAddress()
	{
		return(address.addressToString());
	}

	public String getCar()
	{
		carDetails = ((type == 1) ? carDetails : "Only managers are entitled to a company car");
		return(carDetails);
	}

	public String getOffice()
	{
		return(((roomNumber != 0) ? String.valueOf(roomNumber) : "This employeee doesn't have an assigned room"));
	}

	public String[] employeeToString()
	{
		String employee[] = new String[5];
		employee[0] = "Employee number: ".concat(String.valueOf(employeeNumber));
		employee[1] = "Employee type: ".concat(getType());
		employee[2] = "Employee address: ".concat(getAddress());
		employee[3] = "Employee car: ".concat(getCar());
		employee[4] = "Employee's assigned office: ".concat(getOffice());
		return(employee);
	}
}
