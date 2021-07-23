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
			th1.join();   //main�����尡 th1�� �۾��� ���������� ��ٸ���.
			th2.join();  //main�����尡 th2�� �۾��� ������ ���� ��ٸ���.
		} catch(InterruptedException e) {} 
		
		System.out.println("�ҿ�ð�: " + (System.currentTimeMillis() - joinThreadTest.startTime));
	}

}
