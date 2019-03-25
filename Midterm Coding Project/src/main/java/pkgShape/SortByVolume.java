package pkgShape;

import java.util.Comparator;

public class SortByVolume extends Cuboid implements Comparator<Cuboid> {
	private static int iLength;
	private static int iWidth;
	private static int iDepth;

	SortByVolume() {
		super(iLength, iWidth, iDepth);
	}

	public int compare(Cuboid a, Cuboid b) {
		return (int) (a.volume() - b.volume());
	}
}
