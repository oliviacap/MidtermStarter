package pkgShape;

//A cuboid is a 3D rectangle.  The shape has a third dimension, Depth. 
// Ensure that Depth is a positive number- if not, thrown an IllegalArgumentException.
// Override the area() method to compute the surface area of the object and implement
// new method volume().  The perimeter method is invalid in this context.
// The best way to handle this is to throw an exception called “UnsupportedOperationException”.
// If perimeter() is called, throw this exception

public class Cuboid extends Rectangle {
	
	private int iLength;
	private int iWidth;
	private int iDepth;

	public Cuboid(int iLength, int iWidth, int iDepth) {
		super(iLength, iWidth);
		this.iLength = iLength;
		this.iWidth = iWidth;
		this.iDepth = iDepth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		if (iDepth <= 0)
			throw new IllegalArgumentException();
		this.iDepth = iDepth;
	}
	
	public double volume() {
		double iVolume = this.iLength * this.iWidth * this.iDepth;
		return iVolume;
	}

	@Override
	public double area() {
		double iArea = 2*((this.iLength * this.iWidth) + (this.iLength * this.iDepth) + (this.iWidth * this.iDepth));
		return iArea;
	}
	@Override
	public double perimeter() {
		double iPerimeter = 4 * (this.iLength + this.iWidth + this.iDepth);
		return iPerimeter;
	}
	
	@Override
	public int compareTo(Object o) {
		Cuboid c = (Cuboid) o;
		return (int) (this.area() - c.area());
	}

}
