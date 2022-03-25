package EJEMPLO_4_CLASE3;

//Use a return value. 

public class Vehicle {
	int passengers; // number of passengers
	int fuelcap; // fuel capacity in gallons
	int mpg; // fuel consumption in miles per gallon

	// Return the range.
	int range() {
		return mpg * fuelcap;
	}
}
