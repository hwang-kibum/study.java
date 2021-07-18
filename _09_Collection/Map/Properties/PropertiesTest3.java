package _09_Collection.Map.Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest3 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");  //지정된 키와 값을 저장한다.
		prop.setProperty("language", "한글");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		try {
			prop.store(new FileOutputStream("output.txt"), "Properties Example"); //저장된 목록을 지정된 OutputStream에 출력(저장)
			prop.storeToXML(new FileOutputStream("output.xml"), "Preperties Example"); //저장된 목록을 지정된 XML문서에 출력(저장)
		} catch(IOException e) {
			e.printStackTrace();
		}
	}//End main
} //End class 
