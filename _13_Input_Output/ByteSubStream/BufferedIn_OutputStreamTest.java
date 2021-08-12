package _13_Input_Output.ByteSubStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIn_OutputStreamTest {

	public static void main(String[] args) {
		try {
			//FileOutputStream fos는 123.txt를 에 쓴다.
			FileOutputStream fos = new FileOutputStream("123.txt");
			//BufferedOutputStream이 버퍼 사이즈 5로한다.
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
			//파일에 내용 1~9까지 bos에 출력한다. 
			for(int i='1'; i<='9'; i++) {
				bos.write(i);
			}
			//BufferedOutputStream을 close()하면 fos도 close()를 진행해준다.
			bos.close(); 
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
