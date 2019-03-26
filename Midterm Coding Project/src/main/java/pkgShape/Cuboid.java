package pkgShape;

import java.util.Comparator;

//A cuboid is a 3D rectangle.  The shape has a third dimension, Depth. 
// Ensure that Depth is a positive number- if not, thrown an IllegalArgumentException.
// Override the area() method to compute the surface area of the object and implement
// new method volume().  The perimeter method is invalid in this context.
// The best way to handle this is to throw an exception called “UnsupportedOperationException”.
// If perimeter() is called, throw this exception 
 
public class Cuboid extends Rectangle {
	
	private int iDepth;

	public Cuboid(int iLength, int iWidth, int iDepth) {
		super(iLength, iWidth);
		if (iDepth<=0) {
			throw new IllegalArgumentException();
		}
		this.iDepth = iDepth;
		super.setiWidth(iWidth);
		super.setiLength(iLength);
		

	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		double iVolume = super.getiLength() * super.getiWidth() * this.iDepth;
		return iVolume;
	}

	@Override
	public double area() {
		double iArea = 2*((super.getiLength() * super.getiWidth()) + (super.getiLength() * this.iDepth) + (super.getiWidth() * this.iDepth));
		return iArea;
	}
	
	@Override
	public double perimeter() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	@Override
	public int compareTo(Object cuboid) {
		double compareVolume = ((Cuboid) cuboid).volume();
		return(int) (this.volume() - compareVolume);
		}
	
	class SortByArea implements Comparator<Cuboid> {
		public int compare(Cuboid a, Cuboid b) {
			return (int) (a.volume() - b.volume());
		}
	}
	class SortByVolume implements Comparator<Cuboid> {
		public int compare(Cuboid a, Cuboid b) {
			return (int) (a.volume() - b.volume());
		}
	}

}
