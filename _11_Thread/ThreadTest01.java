package _11_Thread;

class Thread01 extends Thread {
	public void run() {
		throwException(); //���� �߻� �޼��� ȣ��.
	}
	
	public void throwException() {
		try { 
			throw new Exception(); //���ܹ߻�
		} catch (Exception e) {
			e.printStackTrace();  
		}
	}
}
public class ThreadTest01 {
	public static void main(String[] args) {
		Thread01 t01 = new Thread01();
		t01.run();
	}
}
