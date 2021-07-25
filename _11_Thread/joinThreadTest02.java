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
				Thread.sleep(10 * 1000);  //10초를 기다린다.
			} catch(InterruptedException e) {
				System.out.println("Awaken by interrupt().");
			}
			gc(); //garbage collection을 수행한다.
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
			//필요한 메모리가 사용할 수 있는 양보다 크거나 전체 메모리의 6%이상을 사용했을 경우 gc를 깨운다.
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
