package Task1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTestAdd{

	@Test
	public void testAdd1() {
		Calculate calculation=new Calculate();
		int sum =calculation.addition(2,5);
		int expected=7;
		System.out.println("@Test addition(): sum="+sum);
		assertEquals(sum,expected);
	}
	@Test
	public void testAdd2() {
		Calculate calculation=new Calculate();
		int sum =calculation.addition(-6,5);
		int expected=-1;
		System.out.println("@Test addition(): sum="+sum);
		assertEquals(sum,expected);
	}
}
