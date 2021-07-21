package _11_Thread;

class Thread03_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
			for (int x =0; x < 10000000; x++);
		}
	}
	
}
class Thread03_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("|");
			for(int x=0; x < 10000000; x++);
		}
	}
}
public class ThreadPriorityTest {
	public static void main(String[] args) {
		Thread03_1 th1 = new Thread03_1();
		Thread03_2 th2 = new Thread03_2();
		
		th2.setPriority(10);
		
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
		
		th1.start();
		th2.start();
	}
}

