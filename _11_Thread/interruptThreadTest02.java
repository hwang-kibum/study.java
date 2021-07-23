package _11_Thread;

import javax.swing.JOptionPane;

class interruptThread01 extends Thread {
	public void run() {
		int i =10;
		
		while(i != 0 && !isInterrupted()) {
			System.out.println(i--);
			try { 
				System.out.print("sleep...");
				Thread.sleep(1000);  //1초 지연
			}catch(InterruptedException e) {
				System.out.println("interrupted!" + isInterrupted());
				interrupt(); //입력이 안되면 종료된다.
			}
		}
		System.out.println("count End...");
	}
}

class interruptThreadTest02 {
	public static void main(String[] args) {
		interruptThread01 th1 = new interruptThread01();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다."); 
		th1.interrupt();//interrupt()을 호출하면 interrupted상태가 true가 된다.
		System.out.println("isInterrupted(): " + th1.isInterrupted());   //true
	}

}
