package _11_Thread;

class joinThread01 extends Thread {
	public void run() {
		for (int i=0; i <300; i++) {
			System.out.print(new String("-"));
		}
	}
}
class joinThread02 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("0"));
		}
	}
}


class joinThreadTest {
	static long startTime = 0;

	public static void main(String[] args) {
		joinThread01 th1 = new joinThread01();
		joinThread02 th2 = new joinThread02();
		
		th1.start();
		th2.start();
		
		startTime = System.currentTimeMillis();
		
		try {
			th1.join();   //main스레드가 th1의 작업이 끝날때까지 기다린다.
			th2.join();  //main스레드가 th2의 작업이 끝날때 까지 기다린다.
		} catch(InterruptedException e) {} 
		
		System.out.println("소요시간: " + (System.currentTimeMillis() - joinThreadTest.startTime));
	}

}
