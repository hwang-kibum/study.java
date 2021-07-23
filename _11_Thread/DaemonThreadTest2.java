package _11_Thread;

import java.util.Iterator;
import java.util.Map;

class DaemonThreadTest03 extends Thread {
	
	DaemonThreadTest03 (String name) {
		super(name);
	}
	
	public void run() { 
		try { 
			sleep(5 * 1000); //5초동안 기다림.
		} catch (InterruptedException e) { }
	}
}
		
class DaemonThreadTest04 extends Thread {
	
	DaemonThreadTest04 (String name){
		super(name);
	}
	
	public void run() {
		Map map = getAllStackTraces();
		Iterator it = map.keySet().iterator();
		
		int x = 0;
	
		while(it.hasNext()) {
			Object obj = it.next();
			Thread t =(Thread) obj;			
			StackTraceElement[] ste = (StackTraceElement[]) (map.get(obj));
			
			System.out.println("{" + ++x + "} name: " + t.getName() 
							+ ", group: " + t.getThreadGroup().getName()
							+ ", daemon: " + t.isDaemon());
			for(int i=0; i < ste.length ;i++) {
				System.out.println(ste[i]);
			}
			System.out.println();
		}
	}
}

class DaemonThreadTest2  {
	public static void main(String args[]) throws Exception {
		
		DaemonThreadTest03 dt1 = new DaemonThreadTest03("DaemonThread1");
		DaemonThreadTest04 dt2 = new DaemonThreadTest04("DeamonThread2");
		dt1.start();
		dt2.start();
	}
}
