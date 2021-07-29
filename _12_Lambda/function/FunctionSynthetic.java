package _12_Lambda.function;

import java.util.function.Function;

public class FunctionSynthetic {
	public static void main(String[] args) {
	//함수 f1, g1가 있다고 했을때 f1을 적용 후 g1를 적용한다.
	Function<String, Integer> f1 = (s) -> Integer.parseInt(s, 16);
	Function<Integer, String> g1 = (i) -> Integer.toBinaryString(i);
	Function<String, String> h1 = f1.andThen(g1);
	System.out.println(h1.apply("FF"));
	
	
	//함수 f2, g2가 있다고 했을때 g2를 적용 후 f2를 적용한다.
	Function<Integer, Integer> h2 = f1.compose(g1);
	System.out.println(h2.apply(2));
	
	//함수를 적용하기 이전과 이후가 동일한 '항등 함수'가 필요할 때 사용한다. (1을 넣으면 1이 나옴)
	Function<String, String> h3 = s -> s;
	System.out.println(h3.apply("안녕하세요"));

	}
}
