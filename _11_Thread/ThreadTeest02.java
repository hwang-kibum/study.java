package _11_Thread;

class Thread02 extends Thread {
	public void run() {
		throwException(); //예외 발생 메서드 호출.
	}
	
	public void throwException() {
		try { 
			throw new Exception(); //예외발생
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
