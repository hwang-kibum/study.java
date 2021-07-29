package _12_Lambda.MethodReference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface TriFunction<T, U, V, R> {
	R apply(T t , U u , V v);
}

class Myclass {
	String name;
	Integer age;
	boolean status;
	
	Myclass(){}
	Myclass(String name){ this.name=name; }
	Myclass(String name, Integer age){ this(name); this.age = age; }
	Myclass(String name, Integer age, boolean status){ this(name, age); this.status = status; }
	
	public String toString() { return name+", "+age+", "+status; }
}

public class MethodReferenceTest {
	public static void main(String[] args) {

		
		Myclass my1 = new Myclass("kim", 10);
		Myclass my2 = new Myclass("pack", 20);
		Myclass my3 = my1;
		
		//람다 및 메서드 활용을 이용한 객체 생성방법.
		Supplier<Myclass> s1 = ()-> new Myclass();
		Supplier<Myclass> s2 = Myclass::new;
		
		Function<String, Myclass> s3 = s -> new Myclass(s);
		s3.apply("아이오에스");
		Function<String, Myclass> s4 =  Myclass::new;
		s4.apply("안드로이드");
		
		
		
		BiFunction<String, Integer, Myclass> s5 = (s, i) -> new Myclass(s, i);
		s5.apply("안녕", 24);
		BiFunction<String, Integer, Myclass> s6 = Myclass::new;
		s5.apply("하세요", 13);
		
		TriFunction<String, Integer, Boolean, Myclass> s7 =(s, i, b) -> new Myclass(s, i, b);
		Myclass test = s7.apply("테스트7", 7, true);
		System.out.println(test.toString());
		
		TriFunction<String, Integer, Boolean, Myclass> s8 = Myclass::new;
		s8.apply("테스트8", 8, false);
		
		
		Function<Myclass, Boolean> f1 = x -> { return my1.equals(x); } ;
		System.out.println(f1.apply(my2));

		Function<Myclass, Boolean> f2 = x -> { return my1.equals(my3); };
		System.out.println(f1.apply(my2));

		
		
		
	}

}
