package medianSortedArrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Tester {
	
	@Test
	public void test1()
	{
		int [] a = {7,9,11,32};
		int [] b = {2,3,99};
		assertEquals(9.0, Main.findMedian(a, b));
	}
		
	

}
