package cl2;

	class Triangle4 extends TwoDShape5 {
		private String style;

		// A default constructor.
		Triangle4() {
			super();
			style = "null";
		}

		Triangle4(String s, double w, double h) {
			super(w, h); // call superclass constructor

			style = s;
		}

		// Construct an isosceles triangle.
		Triangle4(double x) {
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

