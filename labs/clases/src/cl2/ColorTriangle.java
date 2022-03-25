package cl2;

//Extend Triangle.
class ColorTriangle extends Triangle4 {
	private String color;

	ColorTriangle(String c, String s, double w, double h) {
		super(s, w, h);

		color = c;
	}

	String getColor() {
		return color;
	}

	void showColor() {
		System.out.println("Color is " + color);
	}
}