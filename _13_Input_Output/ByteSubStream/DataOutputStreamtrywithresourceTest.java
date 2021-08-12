package _13_Input_Output.ByteSubStream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataOutputStreamtrywithresourceTest {

	public static void main(String[] args) {
		int sum=0;
		int score=0;
		
		//try-with-resource  
		try(FileInputStream fis = new FileInputStream("score.dat");
			DataInputStream dis = new DataInputStream(fis)){
			
			while(true) {
				score=dis.readInt();
				System.out.println(score);
				sum += score;
			}
		}catch(EOFException eofe) {
			System.out.println("점수의 총합은 : " + sum + "입니다.");
		}catch(IOException ie) {
			ie.printStackTrace();
		}//END try

	}//END main

}//END class
