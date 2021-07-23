package _11_Thread.thisJavaThread;

public class mainThread {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		user1 u1 = new user1();
		u1.setCalculator(cal);
		u1.start();
		
		user2 u2 = new user2();
		u2.setCalculator(cal);
		u2.start();
		
	}

}
