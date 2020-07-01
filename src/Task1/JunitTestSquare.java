package Task1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestSquare {

	@Test
	public void testSquare1() {
		Calculate calculation=new Calculate();
		int result =calculation.square(5);
		int expected=25;
		System.out.println("@Test square(): result="+result);
		assertEquals(result,expected);
	}

	@Test
	public void testSquare2() {
		Calculate calculation=new Calculate();
		int result =calculation.square(-3);
		int expected=9;
		System.out.println("@Test square(): result="+result);
		assertEquals(result,expected);
	}
}
