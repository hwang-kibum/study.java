package _11_Thread.Synchronized;

class Account {
	private int balance = 1000; //잔고
	
	public int getBalance () {
		return balance;
	}
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try { 
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				//
			}
			balance -= money;
		}
	}//withdraw() END
}//Account END

class test implements Runnable {
	Account acc=new Account();
	public void run() {
		while(acc.getBalance() > 0) {
			//100, 200, 300 중 한 값을 임으로 선택해서 출금(withdraw)
			int money= (int)(Math.random() * 3 + 1) *100;
			acc.withdraw(money);
			System.out.println("balance:" + acc.getBalance());
		}
	}//run() END
}

public class SynchronizedTest01 {
	public static void main(String[] args) {
		Runnable r = new test();
		new Thread(r).start();
		new Thread(r).start();

	}//main END

}//class END
