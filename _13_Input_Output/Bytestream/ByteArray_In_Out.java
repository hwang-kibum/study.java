package _13_Input_Output.Bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArray_In_Out {
	public static void main(String[] args) {
		
//		byte배열을 생성 
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
//		임시 byte[]배열을 size:10인 배열을 만든다.
		byte[] temp = new byte[10];
		
//		int/out 스트림 생성
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
////		데이터를 읽을때 좌표 
//		int data =0;
//		
////		-1이 아니면 읽어라 
//		while((data = input.read())!= -1) {
//			output.write(data);  //void write(int b)
//		}
//		일어온 데이터를 temp[]배열 에 담는다.
		input.read(temp,0,temp.length);
		
//		temp[5]부터 5개의 데이터를 write한다.
		output.write(temp,5,5);
//		out스트림 내용을 byte[] 배열에 로 반환.
		outSrc = output.toByteArray(); //스트림의 내용을 byte배열로 반환합니다.
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("temp         : " + Arrays.toString(temp));
		System.out.println("Output Source: " + Arrays.toString(outSrc));
		
	}

}
