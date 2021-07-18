package _09_Collection.Arrays;

import java.util.Arrays;

public class ArraysFill {

	public static void main(String[] args) {
		int[] arr0 = {1,2,3,4,5};
		int[] arr1 = arr0;
		int[] arr2 = {0,1,2,3,4};
		
		System.out.println(Arrays.toString(arr0));
		System.out.println(Arrays.equals(arr0, arr1));  //true
		System.out.println(Arrays.equals(arr0, arr2));  //false

		int[][] arr3 = {{11,22},{33,44}};
		int[][] arr4 = arr3;
		int[][] arr5 = {{55,66},{77,88}};
		
		System.out.println(Arrays.deepToString(arr3));
		System.out.println(Arrays.deepEquals(arr3, arr4));  //true
		System.out.println(Arrays.deepEquals(arr3, arr5));  //false
	}

}
