package javaStudy._09_Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();  //Queue인터페이스의 구현체인 LinkedList를 사용.
		Queue q2 = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");  //성공시 true, 실패시 false 
		q.offer("1");
		q.offer("2");
		q.add("3");  //실패시 IllegalStateException발생
		
		System.out.println(st.peek());  //
		System.out.println(st.search("2"));  //0이 아닌 1부터 시작한다.
		System.out.println("=Stack=");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		System.out.println();
		
		
		System.out.println(q.element());    //첫번째 요소를 읽어온다.
		System.out.println(q.peek());    //첫번째 요소를 읽어온다.
		System.out.println(q.remove("3"));  //삭제 하고 비었으면 NoSuchElementException발생. 
		System.out.println("=Queue=");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); //Queue에서 객체를 꺼내 반환 비었있으면 null반환.
		}
		System.out.println();
		
		q.add("3");
		q.add("2");
		q.add("1");
		q.add("0");
		System.out.println(q.peek());
		System.out.println(q.element());
	}

}
