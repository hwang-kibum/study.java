package _09_Collection.Map.Properties;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties prop = new Properties();
	
//		prop.setProperty(key, value)을 저장한다.
		prop.setProperty("timeout",  "30");
		prop.setProperty("language",  "kr");
		prop.setProperty("size",  "10");
		prop.setProperty("capacity",  "10");

//		prop에 저장된 요소들을 Enumeration을 이용해서 출력한다.
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + "=" + prop.getProperty(element));
		}
		System.out.println();
		
		prop.setProperty("size",  "20"); //size의 값을 20으로 변경.
		System.out.println("size=" + prop.getProperty("size")); //지정된 Key의 Value 반환.
		System.out.println("capacity=" + prop.getProperty("capacity", "20"));   //지정된 key 의 Value를 반환하고, 키를 못차으면 defalutvalue를 반환한다.
		System.out.println("loadfactor="+prop.getProperty("loadfactor", "0.75"));
		
		System.out.println(prop); //prop에 저장된 요소를 출력한다.
		prop.list(System.out);  //prop에 저장된 요소들은 화면 (System.out)에 출력한다.
		
		
		
	}//End main

	
	
}//End class

