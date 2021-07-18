package javaStudy._01_Variable;

public class Variable {
	public static void main(String[] args) {
		
		int binNum = 6543;
		char c = 'a';
		
		//Integer.toBinaryString(int i); 10진수를 2진수로 출력 2진수 문자열로 변환해  사용.
		System.out.printf("binNum = %s%n", binNum);
		System.out.printf("(Integer)binNum = %d%n", (Integer)binNum);
		System.out.printf("Integer.toBinaryString(binNum) = %s%n", Integer.toBinaryString(binNum));
		System.out.printf("c = %c,(int)c = %d %n", c, (int)c);  //형변환이 꼭 필요하다.
		
	}
}
