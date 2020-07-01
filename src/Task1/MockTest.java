package Task1;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MockTest {
	
	Calculate cal;
	Calculator c;
	
	@Before
	    public void setUp() throws Exception {
	        
	        cal = Mockito.mock(Calculate.class);
	        c=new Calculator();
	        c.setCal(cal);
	    }
	
	@Test
	public void mocktestsquare() {
		when(cal.square(anyInt())).thenReturn(0);
		int result=c.square(6);
		assertEquals(0,result); 			 
      }

	// 返回多个值
	@Test
	public void testValue()  {
	    when(cal.jiecheng(0)).thenReturn(0).thenReturn(1);
	        String result=cal.jiecheng(0)+" "+cal.jiecheng(0);
	        // 断言
	        assertEquals("0 1", result);
	}
	
	@Test
	public void mocktestadd() {
		
		when(cal.addition(3,5)).thenReturn(0);
		assertEquals(0,cal.addition(3,5)); 			 
      }
}
