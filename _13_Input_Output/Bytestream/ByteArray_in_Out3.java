package _13_Input_Output.Bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArray_in_Out3 {
	static void printArray(byte[] temp, byte[] outSrc) {
		System.out.println("temp2         : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}
	public static void main(String[] args) {
//		byte[] 입력, 출력, 임시배열 생성.
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc =null;
		byte[] temp = new byte[4];
		
//		input, output 스트림생성
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
//		input의 경우 데이터를 전달해 byte[] 배열 매개변수로 생성, 출력은 빈 객체생성.
		input =new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source  : " + Arrays.toString(inSrc));
		int num = input.available();
		System.out.println("inputStream Size : "+ num);
		System.out.println();

		
		try {
			//output스트림에서  temp내용을 읽어 가면 input.available의 값이 떨어진다 10 - 4 - 4 - 2
			while(input.available()> 0) {
				int len = input.read(temp);  //읽어온 데이터의 개수를 반환.
				output.write(temp, 0, len);  //output스트림은 temp에 있는 데이터를 가져와 쓴다.
				System.out.println("temp1         : " + Arrays.toString(temp));
					
				outSrc = output.toByteArray();  //output에 현재 내용을 바이트배열로 지정.
				printArray(temp, outSrc);
			}			
		}catch(IOException e) { 
			//
		}
		
		System.out.println();
		System.out.println("Input Source  : " +Arrays.toString(inSrc));
		System.out.println("Temp          : " +Arrays.toString(temp));
		System.out.println("Output        : " +Arrays.toString(outSrc));
//		이럴경우 temp에서 덮어써진 부문만 가져와 inSrc의 값과 똑같이 가져온다.
	}

}

