package pkgShape;
// ensure Width and Length are positive values- if not, throw an IllegalArgumentException.
// Implement area() and perimeter()...
// you can figure out the implementation for these methods.
// Implement the compareTo(object) method to sort rectangles by area in ascending order

public class Rectangle extends Shape {

	private int iLength;
	private int iWidth;
	
	public void rectangle(){
	}

	public Rectangle(int iLength, int iWidth) {
		super();
		this.iLength = iLength;
		this.iWidth = iWidth;
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		if (iWidth <= 0)
			throw new IllegalArgumentException();
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		if (iLength <= 0)
			throw new IllegalArgumentException();
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

	public int compareTo(Object o) {
		Rectangle r = (Rectangle) o;
		return (int) (this.area() - r.area());
	}
}
