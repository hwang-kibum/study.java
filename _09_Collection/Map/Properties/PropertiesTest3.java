package _09_Collection.Map.Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest3 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");  //������ Ű�� ���� �����Ѵ�.
		prop.setProperty("language", "�ѱ�");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		try {
			prop.store(new FileOutputStream("output.txt"), "Properties Example"); //����� ����� ������ OutputStream�� ���(����)
			prop.storeToXML(new FileOutputStream("output.xml"), "Preperties Example"); //����� ����� ������ XML������ ���(����)
		} catch(IOException e) {
			e.printStackTrace();
		}
	}//End main
} //End class 
