//EJEMPLO 2
//Use accessor methods to set and get private members. 
package cl2;
//A subclass of TwoDShape for triangles. 
class Triangle extends TwoDShape {
	String style;

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}

