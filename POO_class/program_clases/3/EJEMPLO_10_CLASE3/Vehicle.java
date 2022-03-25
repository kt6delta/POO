package EJEMPLO_10_CLASE3;

//Add a constructor.  

public class Vehicle {
	int passengers; // number of passengers
	int fuelcap; // fuel capacity in gallons
	int mpg; // fuel consumption in miles per gallon

	// This is a constructor for Vehicle.
	Vehicle() {
		System.out.println("Nos vamos... la clase terminó");
	}

	Vehicle(int p, int f) {
		passengers = p;
		fuelcap = f;

	}

	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	// Return the range.
	int range() {
		return mpg * fuelcap;
	}

	// Compute fuel needed for a given distance.
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}