package _13_Input_Output.ByteSubStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.Vector;

public class SequenceInputStreamTest00 {
	public static void main(String[] args) {
//		byte배열 4개 생성 하나는 모든내용을 담을 byte 배열
		byte[] arr1 = {1,2,3};
		byte[] arr2 = {3,4,5};
		byte[] arr3 = {4,5,6};
		byte[] outSrc = null;
		
//		벡터 생성
		Vector v = new Vector();
		
//		ByteArrayInputStream에 3개의 byte배열 을 넣고 스트림을 생성하고 Vector의 요소로 넣는다.
		v.add(new ByteArrayInputStream(arr1));
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));
		
//		SequenceInputStream을 생성해 Vector에 담긴 요소들(ByteArrayStream)을 Enumaration해 담는다.
		SequenceInputStream input = new SequenceInputStream(v.elements());
		
//		ByteArrayOutputStream을 생성해 ByteArrayInputStream을 읽어드릴 스트림을 생성한다.
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		
		try {
			while((data = input.read()) != -1) {
				output.write(data);  //void write(int b);
			}
		}catch(IOException e) {
			e.printStackTrace();
		} 
		
		outSrc = output.toByteArray();
		
		System.out.println("Input Source1 : " + Arrays.toString(arr1));;
		System.out.println("Input Source2 : " + Arrays.toString(arr2));;
		System.out.println("Input Source3 : " + Arrays.toString(arr3));;
		System.out.println("Output Source : " + Arrays.toString(outSrc));;
		
		
		int i = 65;
		
		System.out.println();
		System.out.printf("%d %n", i);   //10진수  : 65
		System.out.printf("%o %n", i);    //8진수  : 101 
		System.out.printf("%o %n", i);    //16진수  : 41 
		System.out.printf("%c %n", i);    //문자  : A 
		System.out.printf("%s %n", i);    //문자열 : 65
		System.out.printf("%5d %n", i);    //5자리 숫자, 빈자리는 공백으로 채운다. :   65
		System.out.printf("%-5d %n", i);   //5자리 숫자, 빈자리는 공백으로 채운다. (왼쪽정렬) :65     
		System.out.printf("%05d %n", i);   //5자리는 0는 채운다. : 00065
		System.out.println();

		
		String str = "ABC";
		
		System.out.printf("%s %n",  str);  //문자열  : ABC
		System.out.printf("%5s %n",  str);  //5자리 문자열, 빈자리는 공백으로 채움. :   ABC
		System.out.printf("%-5s %n",  str);  //5자리 문자열, 빈자리는 공백으로 채운다. (왼쪽정렬) : ABC
		System.out.println();

		float f = 1234.56789f;
		
		System.out.println();
		System.out.printf("%e %n", f);   //지수형태로 표현.  : 1.2345678e+03
		System.out.printf("%f %n", f);   //10진수 : 1234.567871;
		System.out.printf("%3.1f %n", f);  //출력된 자리수를 최소 3자리(소주점포함), 소수점 이하 1자리 2번째 짜리에서 반올림. : 1234.6
		System.out.printf("%8.1f %n", f);   //소수점이상 최소 6자리, 소수점이하 1자리, 출력될 자리수를 최소 8자리 (소수점포함)를 확보 빈자리는 공백으로 채워짐(오른쪽 정렬) :    1234.6
		System.out.printf("%08.1f %n", f);  //소수점 이상 최소6자리, 소수점 이하 1자리, 출력될 자리수를 최소 8자리(소수점 포함)를 확보함. 빈자리는 0으로 채우짐  : 001234.6
		System.out.printf("%-8.1f %n", f);  //소수점이상 최소 6자리, 소수점 이하 1자리 출력될 자리수를 최소 8자리(소수점포함)를 확보한ㄴ다. 빈자리는 공백으로 채워진다.(왼쪽 정렬)  :1234.6
		System.out.println();
		
		System.out.printf("\\t 는 탭 \t 이다. %%n은 개행 %n 이다.%%%%은 %% 하나로 보여준다. ");
		
		
		Date d = new Date();
		System.out.println();
		System.out.printf("%tR %n", d);  								// 21:04 
		System.out.printf("%tH 시  %tM 분 %n", d, d);  					// 21 시  04 분 
		System.out.printf("%tT %n", d); 								// 21:04:53 
		System.out.printf("%tH 시  %tM 분 %tS 초 %n", d, d, d);				// 21 시  04 분 53 초 
		System.out.printf("%tD %n", d);  								// 08/11/21 
		System.out.printf("%ty 년    %tm 월       %td 일 %n", d, d, d);			// 21 년    08 월       11 일 
		System.out.printf("%tF %n", d); 								// 2021-08-11 
		System.out.printf("%tY 년    %tm 월       %td 일 %n", d, d, d);			// 2021 년    08 월       11 일 
		System.out.printf("%tY 년    %1$tm 월       %1$td 일 %n", d);			// 2021 년    08 월       11 일  

		

	}

}
