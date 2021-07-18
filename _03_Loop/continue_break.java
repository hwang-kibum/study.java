package javaStudy._03_Loop;

public class continue_break {
	
	public static void main(String[] args) {
		
		String[] str = { "1", "2", "3", "4", "5"};
		
		for(int i =0; i<str.length; i++) {
			if(str[i] == "3") {
				continue;
			}
			System.out.println("str" + i + ": " + str[i]);
		}
	}
}
