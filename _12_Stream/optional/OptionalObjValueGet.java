package _12_Stream.optional;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalObjValueGet {

	public static void main(String[] args) throws Exception{

		Optional<String> optStr1 = Optional.of("abc");
		Optional<String> optStr2 = Optional.empty();
		
		String str1 = optStr1.get();
		System.out.println("str1: "+str1+"\n");
		
		String str2 = optStr1.orElse("hello");   
		System.out.println("str2: "+str2+"\n");
		//orElse는 Optional의 값이 null일가능성이 있을경우 대체값을 지정할수 있다.
		String str3 = optStr2.orElse("Oops null!");  
		System.out.println("str3: "+str3+"\n");
		
		String str4 = optStr1.orElseGet(()->"Oops this Object is Null");  
		System.out.println("str4: "+str4+"\n");
		String str5 = optStr2.orElseGet(()->"Oops this Object is Null");  //해당 객체가 null일때 반환하는 람다식을 지정
		System.out.println("str5: "+str5+"\n");
		
		String str6 = optStr1.orElseThrow(()->new Exception("Oops this Exception Null!"));
		System.out.println("str6: "+str6+"\n");
		try {
			String str7 = optStr2.orElseThrow(()->new Exception("Oops this Exception Null!"));  //지정된 예외를 던진다.
			System.out.println("str7: "+str7+"\n");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception Message : "+e.getMessage());
		}finally {
			System.out.println("\n");
		}
		try { 
			String st7 = optStr2.orElseThrow(NullPointerException::new);
		} catch(NullPointerException npe) {
			System.out.println("NullPointException : " + npe.getMessage());
		}
		
		
		boolean status;
		status = optStr1.isPresent(); //Optional객체의 값이 null이면 flase, 아니면 true를 반환한다.
		System.out.println(status);   //true

		status = optStr2.isPresent();
		System.out.println(status);  //false
		
		if(Optional.ofNullable(optStr1).isPresent()){
			System.out.println(optStr1+"true");
		} else {
			System.out.println(optStr1+"false");
		}
		
		Optional.ofNullable(optStr1).ifPresent(System.out::println);  //Optional[abc]
		Optional.ofNullable(optStr2).ifPresent(System.out::println);  //Optional.empty
		
		
		IntStream intStrm = IntStream.of(1,2,3,4,5);
		OptionalInt optInt1 = intStrm.findAny();
		System.out.println(optInt1);
		
		intStrm = IntStream.of(1,2,3,4,5);
		OptionalInt optInt2 = intStrm.findFirst();
		System.out.println(optInt2);
		
	}

}
