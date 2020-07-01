package Task1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestRide {

	
	@Test
	public void testMultiply1() {
		Calculate calculation=new Calculate();
		int result =calculation.multiply(6,3);
		int expected=18;
		System.out.println("@Test multiply(): result="+result);
		assertEquals(result,expected);
	}

	@Test
	public void testMultiply2() {
		Calculate calculation=new Calculate();
		int result =calculation.multiply(-2,3);
		int expected=-6;
		System.out.println("@Test multiply(): result="+result);
		assertEquals(result,expected);
	}
}
