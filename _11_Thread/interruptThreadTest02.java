package _11_Thread;

import javax.swing.JOptionPane;

class interruptThread01 extends Thread {
	public void run() {
		int i =10;
		
		while(i != 0 && !isInterrupted()) {
			System.out.println(i--);
			try { 
				System.out.print("sleep...");
				Thread.sleep(1000);  //1�� ����
			}catch(InterruptedException e) {
				System.out.println("interrupted!" + isInterrupted());
				interrupt(); //�Է��� �ȵǸ� ����ȴ�.
			}
		}
		System.out.println("count End...");
	}
}

class interruptThreadTest02 {
	public static void main(String[] args) {
		interruptThread01 th1 = new interruptThread01();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�."); 
		th1.interrupt();//interrupt()�� ȣ���ϸ� interrupted���°� true�� �ȴ�.
		System.out.println("isInterrupted(): " + th1.isInterrupted());   //true
	}

}
