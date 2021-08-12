package _09_Collection.List;

import java.util.Comparator;
import java.util.LinkedList;

public class test {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		System.out.println(list);   //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10] 
		
		//리스트의 첫번쨰 데이터를 출력한다.
		int num = list.element();  
		System.out.println(num);  //1
		
		//요소 값을 검색시 해당 요소값의 인덱스를 출력한다.
		System.out.println(list.indexOf(3));   //2
		
		//리스트 내에 해당 요소값이 존재유무를 확인한다.
		System.out.println(list.contains(11));   //false
		System.out.println(list.contains(10));  //true
		
		//list의 지정한 인덱스에 요소값을 삽입한다. 
		list.add(3, 40);  
		System.out.println(list);  // [1, 2, 3, 40, 4, 5, 6, 7, 8, 9, 10]
		
		//데이터가 들어간 갯수를 카운트해준다. 
		System.out.println(list.size());   //11
		
		 //리스트가 비어있는 유무를 확인하며 true: 요소가 없다. false: 요소가 있다.
		System.out.println(list.isEmpty()); //false
	
		list.clear();
		System.out.println(list.size()); 
		System.out.println(list.isEmpty()); //true

	}

}
