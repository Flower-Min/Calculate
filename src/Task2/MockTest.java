package Task2;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
public class MockTest {
	AdminManage manage;
	AdminDao dao;

    @Before
    public void setUp() throws Exception {
        
        dao = mock(AdminDao.class);
        manage = new AdminManage();
        manage.setDao(dao);
    }

	@Test
	public void mocktestsquare() {
		Admin admin=new Admin(1916088,"王敏");
		when(dao.getAdmin(anyInt())).thenReturn(admin);
		Admin a=dao.getAdmin(11);
		
		System.out.println("id:"+ a.getId() +"; 姓名" + a.getName());
		assertEquals(1916088,a.getId()); 
		assertEquals("王敏",a.getName()); 
      }
}
