package _11_Thread.downloadThread;

class download extends Thread{
	static boolean cancle;
	public void run() {
		int i =0;
		while(i !=100 && !isInterrupted()) {
			try {
				System.out.println(++i + "%");
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				this.interrupt();
			}
		}
	}
}
