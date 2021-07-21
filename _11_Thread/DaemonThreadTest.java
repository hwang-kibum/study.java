package _11_Thread;

public class DaemonThreadTest implements Runnable {
	static boolean autoSave = false;
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(3 * 1000);  //3초마다
			}catch(InterruptedException e) { }
			if(autoSave) {
				autoSave();
			}
		}
	}
	public void autoSave() {
		System.out.println("작업 파일이 자동저장 되었습니다.");
	}
	public static void main(String[] args) {
		Thread t = new Thread(new DaemonThreadTest());
		t.setDaemon(true);  //이부분이 없으면 종료되지 않는다. //Daemon쓰레드로 지정함.
		t.start();
		
		for(int i =1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {}
			System.out.println(i);
			
			if(i==5) {
				autoSave=true;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
