package _09_Collection.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArraysEtcMethod {
	public static void main(String[] args) {
		int[] arr = {2,3,5,4,1,0};
		int[][] arr2D = {{11,12,13},{21,22,23}};
		
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D));
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr2));
		
//		Arrays.parallelPrefix();
//		Arrays.parallelSetAll();
	}

}
