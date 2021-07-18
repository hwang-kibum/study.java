package _09_Collection.Map.Properties;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties prop = new Properties();
	
//		prop.setProperty(key, value)�� �����Ѵ�.
		prop.setProperty("timeout",  "30");
		prop.setProperty("language",  "kr");
		prop.setProperty("size",  "10");
		prop.setProperty("capacity",  "10");

//		prop�� ����� ��ҵ��� Enumeration�� �̿��ؼ� ����Ѵ�.
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + "=" + prop.getProperty(element));
		}
		System.out.println();
		
		prop.setProperty("size",  "20"); //size�� ���� 20���� ����.
		System.out.println("size=" + prop.getProperty("size")); //������ Key�� Value ��ȯ.
		System.out.println("capacity=" + prop.getProperty("capacity", "20"));   //������ key �� Value�� ��ȯ�ϰ�, Ű�� �������� defalutvalue�� ��ȯ�Ѵ�.
		System.out.println("loadfactor="+prop.getProperty("loadfactor", "0.75"));
		
		System.out.println(prop); //prop�� ����� ��Ҹ� ����Ѵ�.
		prop.list(System.out);  //prop�� ����� ��ҵ��� ȭ�� (System.out)�� ����Ѵ�.
		
		
		
	}//End main

	
	
}//End class

