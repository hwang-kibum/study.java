package javaStudy._08_DateTime;

import java.text.ChoiceFormat;

public class chiceFormatTest {

	public static void main(String[] args) {
		double[] limits = {50, 60, 70, 80, 90};  //���� ������ ū ���� ������ ������Ѵ�. 
		
		int[] scores = {100, 95, 88, 70, 52, 60, 70, 40};
		
		//limits, grades���� ������ ������ ���߾�� �Ѵ�.
		String[] grades = { "E", "D", "C", "B", "A"};
		ChoiceFormat form = new ChoiceFormat(limits, grades);
		
		for(int i = 0; i<scores.length; i++) {
			System.out.println(scores[i] + ":" + form.format(scores[i]));
		}
		
	}

}
