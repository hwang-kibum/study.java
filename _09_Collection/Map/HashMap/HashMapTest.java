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
		
		
		Scanner s = new Scanner(System.in); //화면으로부터 라인 단위로 입력 받는다.
		
		while(true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.print("id: ");
			String id = s.nextLine().trim();
			
			System.out.print("password: ");
			String pw = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다." + " 다시 입력해주세요.");
				continue;
			} else {
				if(!(map.get(id)).equals(pw)) {
					System.out.println("비밀번호가 일치 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
		}//while_End
	}//main_End

}//class_End
