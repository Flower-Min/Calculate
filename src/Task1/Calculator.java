package Task1;

public class Calculator {
	
	private Calculate cal=new Calculate();
	
		
	public Calculate getCal() {
		return cal;
	}
	public void setCal(Calculate cal) {
		this.cal = cal;
	}
	
	public int jiecheng(int n) {
		if(n==0)
			return 1;
		else
		    return cal.jiecheng(n);
	}
	public int square(int n) {
		if(n==0)
			return 0;
		else
		    return cal.square(n);
	}

}
