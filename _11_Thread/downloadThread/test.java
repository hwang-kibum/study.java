package _11_Thread.downloadThread;

public class test {
	static boolean dow_can=false;
	static boolean sus =false;
	static boolean res = false;
	static boolean chdc() { return dow_can = !dow_can; }
	static boolean chsr() { return sus=!sus; }
	
	public static void main(String[] args) {
		
		chdc();
		chsr();
		download t = new download();

		while(dow_can) {
			while(sus) {
				t.start();
				if(t.isInterrupted()) {
					t.interrupt();
					chsr();
				}
				
			}
			if(sus==false) {
			} else {
				sus =true;
			}
		} 
		
		
		
	}

}
