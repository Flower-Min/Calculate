package Task1;

public  class Calculate{

	/**
	 * 加法
	 * @param m
	 * @param n
	 * @return m与n的和
	 */
	public int addition(int m,int n){
		return m+n;
	}
	/**
	 * 减法
	 * @param m
	 * @param n
	 * @return
	 */
	
	public int subtraction(int m,int n){
		return m-n;
	}
	/**
	 * 乘法
	 * @param m
	 * @param n
	 * @return
	 */
	public int multiply(int m,int n){
		return m*n;
	}
	/**
	 * 除法
	 * @param m
	 * @param n
	 * @return
	 */
	public double divide(int m,int n){
		if(n!=0) {
			return m/n;
		}
		else
			return 0;
	}
	/**
	 * 阶乘
	 * @param n
	 * @return
	 */
	public int jiecheng(int n) {
		if(n==1||n==2)
			return n;
		else
		    return n*jiecheng(n-1);
	}

	/**
	 * 平方
	 * @param n
	 */
	 public int square(int n) {
		 return  n * n;
	 }
	 
}
