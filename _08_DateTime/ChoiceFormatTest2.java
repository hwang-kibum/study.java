package javaStudy._08_DateTime;

import java.text.ChoiceFormat;

public class ChoiceFormatTest2 {
	public static void main(String[] args) {
		String patternshap = "60#D|70#C|80#B|90#A";  //#은 포함한다.
		String pattern = "60<D|70<C|80<B|90<A";  //미포함한다.
		
		int[] scores = {91, 90, 88, 70, 52, 60, 80};
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		ChoiceFormat formshp = new ChoiceFormat(patternshap);
		
		
		for (int i =0; i<scores.length; i++) {
			System.out.print(scores[i] + ":"+formshp.format(scores[i])+", ");
		}
		System.out.println();

		
		
		for (int i =0; i<scores.length; i++) {
			System.out.print(scores[i] + ":"+form.format(scores[i])+", ");
		}
		
		

	}

}
