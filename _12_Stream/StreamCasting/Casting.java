package _12_Stream.StreamCasting;

import java.util.stream.Stream;

public class Casting {

	public static void main(String[] args) {
		String[] StringArray = { "12", "34", "56", "67" };
		//String�迭�� int�迭�� ��ȯ
		int[] intArray = Stream.of(StringArray).mapToInt(Integer::parseInt).toArray();
		
		//Integer�迭�� String �迭��
		String[] StringArray2 = Stream.of(intArray).map(String::valueOf).toArray(String[]::new);
//		                                                                                                                ���ڸ� Integer��      
		
		
		
		Integer I = Integer.valueOf("24");
		System.out.println(I);
		
		
	}

}
