public class Address
{
	private String street = "";
	private String city = "";
	private String county = "";

	public void setAddress(String street, String city, String county)
	{
		if(street != "" && city != "" && county != "")
		{
			this.street = street;
		    this.city = city;
		    this.county = county;
		}
		else
		{
			System.out.println("Invalid address");
		}
	}
	
	public String addressToString()
	{
		String address;
		if(street != "" && city != "" && county != "")
		{
			address = street.concat(", ").concat(city).concat(", ").concat(county);
		}
		else
		{
			address = "No address specified";
		}
		return(address);
	}
}
