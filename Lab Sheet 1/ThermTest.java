// Student Name 	: Oisin Cawley
// Student Id Number: 
// Date 			: Nov-2015
// Purpose 			: My first class implementation

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer  Aclass
		Thermometer thermB = new Thermometer();		// Create an instance of our Thermometer  Bclass
		
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermB.setCelsius(10.0);
		System.out.println("Temp. of Thermometer B is " + thermB.getCelsius() );
		
	} // end main
} // end class ThermTest
