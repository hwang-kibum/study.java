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
		//orElse�� Optional�� ���� null�ϰ��ɼ��� ������� ��ü���� �����Ҽ� �ִ�.
		String str3 = optStr2.orElse("Oops null!");  
		System.out.println("str3: "+str3+"\n");
		
		String str4 = optStr1.orElseGet(()->"Oops this Object is Null");  
		System.out.println("str4: "+str4+"\n");
		String str5 = optStr2.orElseGet(()->"Oops this Object is Null");  //�ش� ��ü�� null�϶� ��ȯ�ϴ� ���ٽ��� ����
		System.out.println("str5: "+str5+"\n");
		
		String str6 = optStr1.orElseThrow(()->new Exception("Oops this Exception Null!"));
		System.out.println("str6: "+str6+"\n");
		try {
			String str7 = optStr2.orElseThrow(()->new Exception("Oops this Exception Null!"));  //������ ���ܸ� ������.
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
		status = optStr1.isPresent(); //Optional��ü�� ���� null�̸� flase, �ƴϸ� true�� ��ȯ�Ѵ�.
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
