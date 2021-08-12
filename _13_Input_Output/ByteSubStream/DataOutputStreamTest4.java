package _13_Input_Output.ByteSubStream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataOutputStreamTest4 {

	public static void main(String[] args) {
		int sum = 0;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("score.dat");
			dis = new DataInputStream(fis);
			
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		}catch(EOFException e){
			System.out.println("점수의 총합은 : " + sum +"입니다.");
		}catch(IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				//dis가 null일때 close()를 호출하면 NullPointerException이 발생해 if문으로 null을 체크함.
				if(dis != null) {  
					dis.close();
				}
			}catch(IOException ie) {
				ie.printStackTrace();
			}//END try2
		}//END try1
	}//END main

}//END class
