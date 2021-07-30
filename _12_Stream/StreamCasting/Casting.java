package _12_Stream.StreamCasting;

import java.util.stream.Stream;

public class Casting {

	public static void main(String[] args) {
		String[] StringArray = { "12", "34", "56", "67" };
		//String배열을 int배열로 변환
		int[] intArray = Stream.of(StringArray).mapToInt(Integer::parseInt).toArray();
		
		//Integer배열을 String 배열로
		String[] StringArray2 = Stream.of(intArray).map(String::valueOf).toArray(String[]::new);
//		                                                                                                                문자를 Integer로      
		
		
		
		Integer I = Integer.valueOf("24");
		System.out.println(I);
		
		
	}

}
