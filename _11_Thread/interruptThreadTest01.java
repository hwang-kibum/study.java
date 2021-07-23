package _11_Thread;

import javax.swing.JOptionPane;

class interruptThread extends Thread {
	public void run() {
		int i =10;
		
		/*
		 * while(i != 0 && !isInterrupted()) { System.out.println(i--); for(long x=0; x
		 * < 2500000000L; x++); //시간지연 } System.out.println("count End...");
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
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다."); 
		th1.interrupt();//interrupt()을 호출하면 interrupted상태가 true가 된다.
		System.out.println("isInterrupted(): " + th1.isInterrupted());   //true

	}
}
