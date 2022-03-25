package cl2;

//A subclass of TwoDShape for triangles.
class Triangle3 extends TwoDShape {
	private String style;

	// A default constructor.
	Triangle3() {
		super();
		style = "null";
	}

	// Constructor
	Triangle3(String s, double w, double h) {
		super(w, h); // call superclass constructor

		style = s;
	}

	// Construct an isosceles triangle.
	Triangle3(double x) {
		super(x); // call superclass constructor

		style = "isosceles";
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
