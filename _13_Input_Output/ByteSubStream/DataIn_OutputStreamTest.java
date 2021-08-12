package _13_Input_Output.ByteSubStream;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIn_OutputStreamTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("sample.dat");
			dos = new DataOutputStream(fos);

			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);

			dos.close();
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("end");
		}
	}//END main
}//END Class
