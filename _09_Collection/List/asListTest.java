package _09_Collection.List;

import java.util.Arrays;
import java.util.List;

public class asListTest {
	public static void main(String[] args) {
		List list0 = Arrays.asList(new Integer[] {1,2,3,4,5});
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);

		
		System.out.println("list0�� ������ : "+list0.size());
		for(int i = 0; i<list0.size();i++) {
			System.out.println(list0.get(i));
		}
	}

}
