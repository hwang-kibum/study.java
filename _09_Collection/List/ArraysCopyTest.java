package _09_Collection.List;

import java.util.Arrays;

public class ArraysCopyTest {
	public static void main(String[] args) {

		int[] arr0 = {1,2,3,4,5,6};
		
		for (int i=0;i<arr0.length; i++) {
			System.out.print(arr0[i]+",");
		}
		System.out.println();
		
		int[] arr1 = Arrays.copyOf(arr0, arr0.length);
		for (int i=0;i<arr1.length; i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		
		
		int[] arr2 = Arrays.copyOf(arr0, 3); 
		for (int i=0;i<arr2.length; i++) {
			System.out.print(arr2[i]+",");
		}
		System.out.println();
		int[] arr3 = Arrays.copyOf(arr0, 8);
		for (int i=0;i<arr3.length; i++) {
			System.out.print(arr3[i]+",");
		}
		System.out.println();
		int[] arr4 = Arrays.copyOfRange(arr0, 2, 4);
		for (int i=0;i<arr4.length; i++) {
			System.out.print(arr4[i]+",");
		}
		System.out.println();
		int[] arr5 = Arrays.copyOfRange(arr0, 0, 7);
		for (int i=0;i<arr5.length; i++) {
			System.out.print(arr5[i]+",");
		}
		System.out.println();
		
		
	}

}
