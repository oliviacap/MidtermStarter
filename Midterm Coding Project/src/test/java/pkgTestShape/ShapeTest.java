package pkgTestShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

//import java.util.*;
//import java.util.concurrent.ThreadLocalRandom;
import pkgShape.Cuboid;
import pkgShape.Rectangle;



public class ShapeTest {
	
	@Test
	public void RectangleConstructorAndGetterTest() {
		int expectediLength = 10;
		int expectediWidth = 5;
	
		Rectangle r = new Rectangle(10,5);
		int resultiWidth = r.getiWidth();
		int resultiLength = r.getiLength();
		
		assertEquals(expectediWidth, resultiWidth);
		assertEquals(expectediLength, resultiLength);
	}
	
	@Test
	public void RectangleSetterTest() {
		int expectediLength = 10;
		int expectediWidth = 5;		
		Rectangle r = new Rectangle(15,25);
		r.setiLength(10);
		r.setiWidth(5);
		int resultiWidth = r.getiWidth();
		int resultiLength = r.getiLength();
		
		assertEquals(expectediWidth, resultiWidth);
		assertEquals(expectediLength, resultiLength);
	}
	
	
	@Test
	public void RectangleAreaTest() {
		double expectedArea = 20;
		Rectangle r = new Rectangle(2,10);
		double resultArea = r.area();
		assertEquals( expectedArea,resultArea,0);
	}
	
	@Test
	public void RectanglePerimeterTest() {
		double expectedPerimeter = 14;
		Rectangle r = new Rectangle(2, 5);
		double resultPerimeter = r.perimeter();
		assertEquals(expectedPerimeter, resultPerimeter, 0);
	}
	
	@Test
	public void RectangleExceptionTest1() {
		boolean thrown = false;
		try {
			Rectangle r = new Rectangle(-10,15);
		}
		catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void RectangleExceptionTest2() {
		boolean thrown = false;
		try {
			Rectangle r = new Rectangle(10,-15);
		}
		catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void RectangleCompareToTest() {
		int test = -100;
		Rectangle r1 = new Rectangle(5,10);
		Rectangle r2 = new Rectangle(10,15);
		int result = r1.compareTo(r2);
		assertEquals(test,result);
	}

	@Test
	public void CuboidConstructorAndGetterTest() {
		int expectediLength = 10;
		int expectediWidth = 5;
		int expectediDepth = 15;
		Cuboid c = new Cuboid(10,5,15);
		int resultiWidth = c.getiWidth();
		int resultiLength = c.getiLength();
		int resultiDepth = c.getiDepth();
		
		assertEquals(expectediWidth, resultiWidth);
		assertEquals(expectediLength, resultiLength);
		assertEquals(expectediDepth, resultiDepth);
	}
	
	@Test
	public void CuboidSetterTest() {
		int expectediLength = 10;
		int expectediWidth = 5;
		int expectediDepth = 15;
		Cuboid c = new Cuboid(10,5,25);
		c.setiDepth(15);
		int resultiWidth = c.getiWidth();
		int resultiLength = c.getiLength();
		int resultiDepth = c.getiDepth();
		
		assertEquals(expectediWidth, resultiWidth);
		assertEquals(expectediLength, resultiLength);
		assertEquals(expectediDepth, resultiDepth);
	}
	
	@Test
	public void CuboidPerimeterTest() {
		boolean thrown = false;
		try {
			Cuboid c = new Cuboid(10,15,5);
			c.perimeter();
		}
		catch(UnsupportedOperationException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void CuboidExceptionTest1() {
		boolean thrown = false;
		try {
			Cuboid c = new Cuboid(10,15,-5);
		}
		catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	
	@Test
	public void CuboidExceptionTest2() {
		boolean thrown = false;
		try {
			Cuboid c = new Cuboid(10,15,0);
		}
		catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void CuboidCompareToTest() {
		int test = -2250;
		Cuboid c1 = new Cuboid(5,10,15);
		Cuboid c2 = new Cuboid(10,15,20);
		int result = c1.compareTo(c2);
		assertEquals(test,result);
	}
	
	@Test
	public void CuboidAreaTest() {
		double expectedArea = 62;
		Cuboid c = new Cuboid(3,2,5);
		double resultArea = c.area();
		assertEquals(expectedArea,resultArea,0);
	}
	
	@Test
	public void CuboidVolumeTest() {
		double expectedArea = 30;
		Cuboid c = new Cuboid(3,2,5);
		double resultVolume = c.volume();
		assertEquals(expectedArea,resultVolume,0);
	}
	

	@Test
	public void SortByAreaTest() {
	ArrayList<Cuboid> ModifiedList = new ArrayList<Cuboid>();
	ArrayList<Cuboid> ControlledList = new ArrayList<Cuboid>();
	
	ModifiedList.add(new Cuboid(4,4,4));
	ModifiedList.add(new Cuboid(2,2,2));
	ModifiedList.add(new Cuboid(1,1,1));
	
	ControlledList.add(new Cuboid(4,4,4));
	ControlledList.add(new Cuboid(2,2,2));
	ControlledList.add(new Cuboid(1,1,1));
	
	SortByArea sorter = new SortByArea();
	Collections.checkedSorted(ModifiedList,sorter);
	
	assertTrue(ModifiedList == ControlledList);
	}
	
	@Test
	public void SortByVolumeTest() {
	ArrayList<Cuboid> ModifiedList = new ArrayList<Cuboid>();
	ArrayList<Cuboid> ControlledList = new ArrayList<Cuboid>();
	
	ModifiedList.add(new Cuboid(4,4,4));
	ModifiedList.add(new Cuboid(2,2,2));
	ModifiedList.add(new Cuboid(1,1,1));
	
	ControlledList.add(new Cuboid(4,4,4));
	ControlledList.add(new Cuboid(2,2,2));
	ControlledList.add(new Cuboid(1,1,1));
	
	SortByVolume sorter = new SortByVolume();
	Collections.checkedSorted(ModifiedList,sorter);
	
	assertTrue(ModifiedList == ControlledList);
	}
}

	

