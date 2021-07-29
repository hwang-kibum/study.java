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
			arr[i] = s.getAsInt();   //get()이 아니라 getAsInt()임에 주의
		}
	}
	static void printEvenNum(IntPredicate p, IntConsumer c, int[] arr) {
		System.out.print("[");
		for(int i : arr) { //arr안에 난수가 하나씩 i에 대입
			if(p.test(i)) {  //IntPredicate의 조건이 i값과 일치하면 
				c.accept(i);  //IntConsumer c에 저장한다. 출력한다.
			}
		}
		System.out.println("]");
	}
	static int[] doSomething(IntUnaryOperator op, int[] arr) {
		int[] newArr = new int[arr.length];
		
		for(int i=0; i<newArr.length;i++) {
			newArr[i] = op.applyAsInt(arr[i]);  //apply가 아님에 주의
		}
		return newArr;
	}

}
