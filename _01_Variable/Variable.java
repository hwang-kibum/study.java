package _01_Variable;

public class Variable {
	public static void main(String[] args) {
		
		int binNum = 6543;
		char c = 'a';
		
		//Integer.toBinaryString(int i); 10������ 2������ ��� 2���� ���ڿ��� ��ȯ��  ���.
		System.out.printf("binNum = %s%n", binNum);
		System.out.printf("(Integer)binNum = %d%n", (Integer)binNum);
		System.out.printf("Integer.toBinaryString(binNum) = %s%n", Integer.toBinaryString(binNum));
		System.out.printf("c = %c,(int)c = %d %n", c, (int)c);  //����ȯ�� �� �ʿ��ϴ�.
		
	}
}
