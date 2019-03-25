//package pkgTestShape;
//
//import static org.junit.Assert.*;
//import org.junit.Test;
//import java.util.*;
//import java.util.concurrent.ThreadLocalRandom;
//import pkgShape.Cuboid;
//import pkgShape.Rectangle;
//import pkgShape.SortByArea;
//import pkgShape.SortByVolume;
//
//
//
//public class ShapeTest {
//
//	
//		@Test
//		public void RectangleAreaSort()
//		{
//			ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
//			
//			for (int i = 0; i<10; i++)
//			{
//				int iWidth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
//				int iLength = ThreadLocalRandom.current().nextInt(1, 10 + 1);
//				
//				recs.add(new Rectangle(iWidth, iLength));
//				
//			}
//			
//			System.out.println("*****************************************");
//			System.out.println("Unsorted rectangles");
//			PrintRectangles(recs);
//			Collections.sort(recs, new SortByArea()); 
//			System.out.println("Sorted rectangles");
//			PrintRectangles(recs);
//			System.out.println("*****************************************");
//		}
//		
//		
//
//		
//		@Test
//		public void CuboidAreaSort()
//		{
//			ArrayList<Cuboid> recs = new ArrayList<Cuboid>();
//			
//			for (int i = 0; i<10; i++)
//			{
//				int iWidth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
//				int iLength = ThreadLocalRandom.current().nextInt(1, 10 + 1);
//				
//				cubs.add(new Cuboid(iWidth, iLength, iDepth));
//				
//			}
//			
//			System.out.println("*****************************************");
//			System.out.println("Unsorted cuboids");
//			PrintCuboids.area(cubs);
//			Collections.sort(recs, new SortByArea()); 
//			System.out.println("Sorted cuboids");
//			PrintCuboids.area(cubs);
//			System.out.println("*****************************************");
//		}
//		
//		private static void PrintCuboids_area(ArrayList<Cuboid> cubs)
//		{
//			for (Cuboid c: cubs)
//			{
//				System.out.println(c.area());
//			}
//		}
//		
//		@Test
//		public void CuboidVoumeSort()
//		{
//			ArrayList<Cuboid> cubs = new ArrayList<Cuboid>();
//			
//			for (int i = 0; i<10; i++)
//			{
//				int iWidth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
//				int iLength = ThreadLocalRandom.current().nextInt(1, 10 + 1);
//				
//				cubs.add(new Rectangle(iWidth, iLength, iDepth));
//				
//			}
//			
//			System.out.println("*****************************************");
//			System.out.println("Unsorted cuboids");
//			PrintCuboids_volume(cubs);
//			Collections.sort(cubs, new SortByVolume()); 
//			System.out.println("Sorted cuboids");
//			PrintCuboids_volume(cubs);
//			System.out.println("*****************************************");
//		}
//		
//
//		
//		private static void PrintCuboids_volume(ArrayList<Cuboid> cubs)
//		{
//			for (Cuboid c: cubs)
//			{
//				System.out.println(c.volume());
//			}
//		}
//}
//
