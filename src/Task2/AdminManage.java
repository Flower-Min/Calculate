package Task2;

public class AdminManage  {

	private AdminDao dao;
	

	public AdminDao getDao() {
		return dao;
	}

	public void setDao(AdminDao dao) {
		this.dao = dao;
	}

	public Admin getAdmin(int id) {
		Admin admin = null;
        if (dao != null) {
            admin = dao.getAdmin(id);
        }
        if (admin == null) {
        	admin=new Admin(1916088,"SZ王敏");
        }
		return admin;
	}
	
}
