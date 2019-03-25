package pkgShape;

import java.util.Comparator;

public class SortByArea extends Cuboid implements Comparator<Cuboid> {
	private static int iLength;
	private static int iWidth;
	private static int iDepth;

	 SortByArea() {
		super(iLength, iWidth, iDepth);
	}
	public int compare(Cuboid a, Cuboid b) {
		return (int) (a.volume() - b.volume());
}
}
