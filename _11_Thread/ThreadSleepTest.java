package _11_Thread;
class sleepThread01 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("<<th1 END>>");
	}//run()END
}
class sleepThread02 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("|");
		} 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.print("<<th2 END>>");
	}//run()END
}


class ThreadSleepTest {
	public static void main(String[] args) {
		sleepThread01 th1 = new sleepThread01();
		sleepThread02 th2 = new sleepThread02();
		th1.start();
		th2.start();
		for(int i=0; i<300; i++) {
			System.out.print("\\");
		}
		try {
			th1.sleep(2000); //sleep은 현재 스레드만 자신에게 호출할수 있고 다른스레드를 관여할수 없다.
		}catch (InterruptedException e) {}
		System.out.println("<<main END>>");
	} //mainEND

}//public class END
