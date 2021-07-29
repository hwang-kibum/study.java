package _12_Lambda.function;

import java.util.function.Predicate;

public class PredicateCombination {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i <200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate();  //i >= 100
		
		Predicate<Integer> all = notP.and(q).or(r);
		Predicate<Integer> all2 = notP.and(q);
		System.out.println(all2.test(150));
		System.out.println(all.test(150));
		
		String str1 = "abc";
		String str2 = "abc";
		
		//str1과 str2가 같은지 비교한 결과를 반환.
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println(result);
		

		
	}
}
