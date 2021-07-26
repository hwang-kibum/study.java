package _11_Thread.Synchronized.wait_notify;

import java.util.ArrayList;

class customer implements Runnable {
	private table table;
	private String food;
	
	customer(table t, String f){
		this.table = t;
		this.food = f;
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				//
			}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + "ate a" + food);
		}//while END
	}
}

class cook implements Runnable {
	private table table;
	cook(table t){ this.table = t; }
	
	public void run() {
		while(true) {
			//������ �丮�� �ϳ� �����ؼ� table�� �߰��Ѵ�.
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishName[idx]);
			try { 
				Thread.sleep(1);
			}catch(InterruptedException e) { }
		}//while
	}
}
class table {
	String[] dishName = { "donut", "donut", "burger" }; //donut�� �� ���� ���´�.
	final int MAX_FOOD = 6;  //���̺� ���� �� �ִ� �ִ� ������ ����
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name+"is wating.");
			try { 
				wait(); //COOK�����带 ��ٸ��� �Ѵ�.
				Thread.sleep(500);
			} catch (InterruptedException e) {
				//
			}
		}
		dishes.add(dish);
		notify();  //��ٸ��� �ִ� CUST�� �ƿ�� ����
		System.out.println("Dishes: " + dishes.toString());
	}
	public void remove(String dishName) {
		synchronized(this) {
			String name = Thread.currentThread().getName();
			
			while(dishes.size() == 0) {
				System.out.println(name+" is waiting.");
				try {
					wait();
					Thread.sleep(500);
				}catch(InterruptedException e) { 
					//
				}
			}
			while(true) {
				for(int i=0; i<dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify();
						return;
					}//END if
				}//END for
				try {
					System.out.println(name+"is waiting .");
					wait();  //���ϴ� ������ ���� cust�����带 ��ٸ��� �Ѵ�.
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					//
				}
			}//END while
		}//END synchronized block
	}
	public int dishNum() { return dishName.length; }
}


public class Restaurant {
	public static void main(String[] args) throws Exception {
		table table = new table();  //���� �����尡 �����ϴ� ��ü
		
		new Thread(new cook(table), "cook1").start();
		new Thread(new customer(table, "donut"), "CUST1").start();
		new Thread(new customer(table, "burger"), "CUST2").start();
		
		Thread.sleep(2000);
		System.exit(0);
	}

}
