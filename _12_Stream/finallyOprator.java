package _12_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class finallyOprator {
	public static void main(String[] args) {
		
		IntStream intStrm = IntStream.of(1,3,5,6,7,8,2,4,9);
		intStrm.forEach(System.out::println);
		
		//조건검사
		intStrm = IntStream.of(1,3,5,6,7,8,2,4,9);
		boolean stat = intStrm.distinct().sorted().allMatch((s)-> 2%s == 0);  // 모든 요소가 해당 조건에 맞아야 true
		System.out.println(stat);  //false
		
		intStrm = IntStream.of(1,3,5,6,7,8,2,4,9);
		stat = intStrm.distinct().sorted().anyMatch((s)->s%2 == 0);  //요소가 해당 조건에 하나로도 맞으면 true
		System.out.println(stat);   //true
		
		intStrm = IntStream.of(1,3,5,6,7,8,2,4,9);
		stat = intStrm.distinct().sorted().noneMatch((s)->s == 0);  //noneMatch 모든 조건에 안맞으면 true
		System.out.println(stat);
		
		
		List<String> list1= Arrays.asList("kim", "pack", "lee", "hwang", "kyu", "Lim", "hong");
		Optional<String> strStrm1 = list1.stream().filter(s->s.startsWith("k")).findFirst(); //조건에 첫번째 요소를 동일한 결과를 반환함.
		System.out.println(strStrm1.get());
		
		
		List<String> list2= Arrays.asList("kim", "pack", "lee", "hwang", "kyu", "Lim", "hong");
		Optional<String> strStrm2 = list2.parallelStream().filter(s->s.startsWith("h")).findAny();  //병렬작업시 findAny를 호출하며 결과가 동일하지 않을 수 있다.
		System.out.println(strStrm2.get());

		intStrm = IntStream.of(1,3,5,6,7,8,2,4,9);
		OptionalInt result1 = intStrm.filter(s->s%2 == 0).findFirst();
		System.out.println(result1);  //2
		
		intStrm = IntStream.of(1,3,5,6,7,8,2,4,9);
		OptionalInt result2 = intStrm.filter(s->s%2 ==  0).findAny();
		System.out.println(result2);
		
		
		//통계
		intStrm = IntStream.of(1,3,5,6,7,8,2,4,9);
		long num = intStrm.count();
		System.out.println(num);
		
		intStrm = IntStream.of(1,3,5,6,7,8,2,4,9);
		OptionalInt optInt = intStrm.max(); //제일 큰 숫자
		System.out.println("max" +optInt);
		
		
		intStrm = IntStream.of(1,3,5,6,7,8,2,4,9);
		optInt = intStrm.min();  //제일 작은 숫자
		System.out.println("min" + optInt);
		
		intStrm = IntStream.of(1,3,5,6,7,8,2,4,9);
		optInt = intStrm.min();  //제일 작은 숫자
		
		intStrm = IntStream.of(1,3,5,6,7,8,2,4,9);
		OptionalInt optInt1 = intStrm.reduce((s1, s2)->{return s1+s2;});
		System.out.println(optInt1);
		
		intStrm = IntStream.of(1,3,5,6,7,8,2,4,9);
		int count = intStrm.reduce(0, (a, b)->a + 1);
		System.out.println(count);
		
		intStrm = IntStream.of(1,3,5,6,7,8,2,4,9);
		int sum = intStrm.reduce(0, (a,b)->a+b);
		System.out.println(sum);
		
		intStrm = IntStream.of(1,3,5,6,7,8,2,4,9);
		OptionalInt optIntMax = intStrm.reduce((a, b) -> a > b ? a:b);
		System.out.println(optIntMax);
		
		
		intStrm = IntStream.of(1,3,5,6,7,8,2,4,9);
		OptionalInt optIntMin = intStrm.reduce((a, b) -> a < b ? a:b);
		System.out.println(optIntMin);
		int maxValue = optIntMin.getAsInt();
		System.out.println(maxValue);   //OptionalInt에 저장된 값을 꺼낼때
		
	

	}

}
