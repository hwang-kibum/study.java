package _12_Lambda.function;

import java.util.*;
import java.util.function.*;


public class functaionalInterfaceTest {

	public static void main(String[] args) {
		IntSupplier s =() -> (int) (Math.random()*100)+1;
		IntConsumer c = i -> System.out.print(i+",");
		IntPredicate p = i -> i%2==0;
		IntUnaryOperator op = i -> i/10*10; 
		
		int[] arr= new int[10];
		
		makeRandomList(s, arr);
		System.out.println(Arrays.toString(arr));
		
		printEvenNum(p, c, arr);
		int[] newArr = doSomething(op, arr);
		System.out.println(Arrays.toString(newArr));
	}
	
	static void makeRandomList(IntSupplier s, int[] arr) {
		for(int i =0; i<arr.length; i++) {
			arr[i] = s.getAsInt();   //get()�� �ƴ϶� getAsInt()�ӿ� ����
		}
	}
	static void printEvenNum(IntPredicate p, IntConsumer c, int[] arr) {
		System.out.print("[");
		for(int i : arr) { //arr�ȿ� ������ �ϳ��� i�� ����
			if(p.test(i)) {  //IntPredicate�� ������ i���� ��ġ�ϸ� 
				c.accept(i);  //IntConsumer c�� �����Ѵ�. ����Ѵ�.
			}
		}
		System.out.println("]");
	}
	static int[] doSomething(IntUnaryOperator op, int[] arr) {
		int[] newArr = new int[arr.length];
		
		for(int i=0; i<newArr.length;i++) {
			newArr[i] = op.applyAsInt(arr[i]);  //apply�� �ƴԿ� ����
		}
		return newArr;
	}

}
