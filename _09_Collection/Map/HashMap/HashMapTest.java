package _09_Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		
		Scanner s = new Scanner(System.in); //ȭ�����κ��� ���� ������ �Է� �޴´�.
		
		while(true) {
			System.out.println("id�� password�� �Է����ּ���");
			System.out.print("id: ");
			String id = s.nextLine().trim();
			
			System.out.print("password: ");
			String pw = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�." + " �ٽ� �Է����ּ���.");
				continue;
			} else {
				if(!(map.get(id)).equals(pw)) {
					System.out.println("��й�ȣ�� ��ġ �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				} else {
					System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
					break;
				}
			}
		}//while_End
	}//main_End

}//class_End
