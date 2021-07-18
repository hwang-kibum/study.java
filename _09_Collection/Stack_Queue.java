package javaStudy._09_Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();  //Queue�������̽��� ����ü�� LinkedList�� ���.
		Queue q2 = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");  //������ true, ���н� false 
		q.offer("1");
		q.offer("2");
		q.add("3");  //���н� IllegalStateException�߻�
		
		System.out.println(st.peek());  //
		System.out.println(st.search("2"));  //0�� �ƴ� 1���� �����Ѵ�.
		System.out.println("=Stack=");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		System.out.println();
		
		
		System.out.println(q.element());    //ù��° ��Ҹ� �о�´�.
		System.out.println(q.peek());    //ù��° ��Ҹ� �о�´�.
		System.out.println(q.remove("3"));  //���� �ϰ� ������� NoSuchElementException�߻�. 
		System.out.println("=Queue=");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); //Queue���� ��ü�� ���� ��ȯ ��������� null��ȯ.
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
