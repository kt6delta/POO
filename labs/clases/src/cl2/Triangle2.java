package cl2;

//A subclass of TwoDShape for triangles.
class Triangle2 extends TwoDShape3 {
	private String style;

	Triangle2(String s, double w, double h) {
		super(w, h); // call superclass constructor

		style = s;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}