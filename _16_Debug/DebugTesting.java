package javaStudy._16_Debug;

public class DebugTesting {
	
	public static int add(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		int a = 12;
		int b = 3;
		int c ;
		int total=0;
		String str = "학교";
		
		String tmp = str;
		
		c = add(a, b);
		String test = new String("종이");
		
		
		System.out.println("a : " + a); System.out.println("b : " + b);
		System.out.println("c : " + c);
		 
		
		System.out.println(str+test+"어서모이자 어디로? : " + tmp);
		
		for(int i = 0 ; i < c ; i++ ) {
			System.out.println(i);
			total += i;
		}
		System.out.println(total);
		System.out.println();
	}

}
