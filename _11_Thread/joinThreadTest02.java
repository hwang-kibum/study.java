package _11_Thread;
class joinThreadTest_01 extends Thread {
	final static int MAX_MEMORY = 1000;
	int usedMemory=0;
	
	public void run() {
		while(true) {
			try {
//				for(int i=0; i<1000; i++) {
//					System.out.print(i+", ");
//				}
				Thread.sleep(10 * 1000);  //10�ʸ� ��ٸ���.
			} catch(InterruptedException e) {
				System.out.println("Awaken by interrupt().");
			}
			gc(); //garbage collection�� �����Ѵ�.
			System.out.println("Garbage Collected. Free Memory: " + freeMemory());		
		}
	}
	public void gc() {
		usedMemory -= 300;
		
		if(usedMemory < 0) usedMemory =0;
	}
	public int totalMemory() { return MAX_MEMORY; }
	public int freeMemory() { return MAX_MEMORY - usedMemory; }
}


class joinThreadTest02 {
	public static void main(String[] args) {
		joinThreadTest_01 gc = new joinThreadTest_01();
		gc.setDaemon(true);
		gc.start();
		
		int requiredMemory =0;
		for (int i =0; i<20; i++) {
			requiredMemory = (int) (Math.random() *10) *20;
			//�ʿ��� �޸𸮰� ����� �� �ִ� �纸�� ũ�ų� ��ü �޸��� 6%�̻��� ������� ��� gc�� �����.
			if(gc.freeMemory() < requiredMemory || gc.freeMemory() <gc.totalMemory() *0.4) {
				gc.interrupt();
				try {
					gc.join();
				}catch(InterruptedException e) {
					//
				}
			}
			gc.usedMemory += requiredMemory;
			System.out.println("usedMemomry:" + gc.usedMemory);
		}
	}

}
