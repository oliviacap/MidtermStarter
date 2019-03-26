package pkgShape;
 
/// abstract class with two abstract methods, area and perimeter.

public abstract class Shape {
	
	/**
	 * This abstract method will compel any class that inherits this class to
	 * implement this method
	 */
	
	public Shape() {
	}
	public abstract double area(); 
	public abstract double perimeter();
	
}
