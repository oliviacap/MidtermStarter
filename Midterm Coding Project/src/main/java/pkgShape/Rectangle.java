package pkgShape;
// ensure Width and Length are positive values- if not, throw an IllegalArgumentException.
// Implement area() and perimeter()...
// you can figure out the implementation for these methods.
// Implement the compareTo(object) method to sort rectangles by area in ascending order 

public class Rectangle extends Shape {

	private int iLength;
	private int iWidth;
	
	public Rectangle(int iLength, int iWidth) {
		super();
		if (iLength<=0 || iWidth<=0) {
			throw new IllegalArgumentException();
		}
		this.iLength = iLength;
		this.iWidth = iWidth;
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {

		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	public double area() {
		double iArea = this.iLength * this.iWidth;
		return iArea;
	}

	public double perimeter() {
		double iPerimeter = 2 * (this.iLength + this.iWidth);
		return iPerimeter;
	}

	public int compareTo(Object rectangle) {
	double compareArea = ((Rectangle) rectangle).area();
	return(int) (this.area() - compareArea);
	}
}
