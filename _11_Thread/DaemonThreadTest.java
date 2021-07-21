package _11_Thread;

public class DaemonThreadTest implements Runnable {
	static boolean autoSave = false;
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(3 * 1000);  //3�ʸ���
			}catch(InterruptedException e) { }
			if(autoSave) {
				autoSave();
			}
		}
	}
	public void autoSave() {
		System.out.println("�۾� ������ �ڵ����� �Ǿ����ϴ�.");
	}
	public static void main(String[] args) {
		Thread t = new Thread(new DaemonThreadTest());
		t.setDaemon(true);  //�̺κ��� ������ ������� �ʴ´�. //Daemon������� ������.
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
		System.out.println("���α׷��� �����մϴ�.");
	}
}
