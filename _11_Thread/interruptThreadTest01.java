package _11_Thread;

import javax.swing.JOptionPane;

class interruptThread extends Thread {
	public void run() {
		int i =10;
		
		/*
		 * while(i != 0 && !isInterrupted()) { System.out.println(i--); for(long x=0; x
		 * < 2500000000L; x++); //�ð����� } System.out.println("count End...");
		 */
		
		while(i!= 0 && !isInterrupted()) {
			try {
				System.out.println(i--);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
//				interrupt();
			}
		}
	}
}

class interruptThreadTest01 {
	public static void main(String[] args) {
		interruptThread th1 = new interruptThread();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�."); 
		th1.interrupt();//interrupt()�� ȣ���ϸ� interrupted���°� true�� �ȴ�.
		System.out.println("isInterrupted(): " + th1.isInterrupted());   //true

	}
}
