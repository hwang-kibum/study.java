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
		String str = "�б�";
		
		String tmp = str;
		
		c = add(a, b);
		String test = new String("����");
		
		
		System.out.println("a : " + a); System.out.println("b : " + b);
		System.out.println("c : " + c);
		 
		
		System.out.println(str+test+"������� ����? : " + tmp);
		
		for(int i = 0 ; i < c ; i++ ) {
			System.out.println(i);
			total += i;
		}
		System.out.println(total);
		System.out.println();
	}

}
