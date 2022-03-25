package cl2;

//EJEMPLO4
//Add constructors to TwoDShape.
class TwoDShape3 {
	private double width;
	private double height;

	// Parameterized constructor.
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}

	// Accessor methods for width and height.
	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}

	void setWidth(double w) {
		width = w;
	}

	void setHeight(double h) {
		height = h;
	}

	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}