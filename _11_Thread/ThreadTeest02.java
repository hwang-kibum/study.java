package _11_Thread;

class Thread02 extends Thread {
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
public class ThreadTeest02 {
	public static void main(String[] args) {
		Thread02 t01 = new Thread02();
		t01.start();
	}

}
