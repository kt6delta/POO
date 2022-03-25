package EJEMPLO_7_CLASE3;

/* 
 Add a parameterized method that computes the  
 fuel required for a given distince. 
 */

public class Vehicle {
	int passengers; // number of passengers
	int fuelcap; // fuel capacity in gallons
	int mpg; // fuel consumption in miles per gallon

	// Return the range.
	int range() {
		return mpg * fuelcap;
	}

	// Compute fuel needed for a given distance.
	double fuelneeded(int miles) {
		return miles / mpg;
	}
}