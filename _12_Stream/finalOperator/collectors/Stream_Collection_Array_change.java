package _12_Stream.finalOperator.collectors;

import static java.lang.System.out;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class human implements Comparable<human>{
	String regi_number;
	String name;
	int YOB;
	int month;
	int day;
	String local;
	
	human(){}
	human(String regi_number, String name, int YOB, int month, int day, String local){
		this.regi_number = regi_number;
		this.name = name;
		this.YOB = YOB;
		this.month = month;
		this.day = day;
		this.local = local;
	}

	public String getRegi_number() {
		return regi_number;
	}
	public void setRegi_number(String regi_number) {
		this.regi_number = regi_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYOB() {
		return YOB;
	}
	public void setYOB(int yOB) {
		YOB = yOB;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public int compareTo(human h) {
		String hStr = h.regi_number.substring(0,2);
		String thisStr = this.regi_number.substring(0,2);
		int hregiId = Integer.parseInt(hStr);
		int thisregiId = Integer.parseInt(thisStr);
		return thisregiId  - hregiId;
	}

	public long chRegi_id() {
		String str = this.regi_number;
		long number = Long.parseLong(str);
		return number;
		
	}
}

public class Stream_Collection_Array_change {

	public static void main(String[] args) {
		
//		import static java.util.stream.Collectors.*; 해야 한다.
		human h1 =new human("8304221000000","둘리",1983,04,22, "Seoul");
		human h2 = new human("9004302000000", "홍길동", 1990, 56, 78, "hanyang");
		System.out.println(h1.compareTo(h2));   //-7

		human[] huArr = { new human("8304221000000","둘리",1983,04,22, "Seoul"),
						  new human("9004302000000", "홍길동", 1990, 56, 78, "hanyang"),
						  new human("8808081000000", "호돌이", 1988, 8, 8, "Korea")};
		//human 배열에서 이름정보만 추출해 String타입 리스트로 
		List<human> humanList = Stream.of(huArr)
												.collect(Collectors.toList());
		out.println(humanList); //[_12_Stream.finalOperator.collectors.human@18ef96, _12_Stream.finalOperator.collectors.human@6956de9, _12_Stream.finalOperator.collectors.human@769c9116]

		
		Stream<String> humanRegiId= Stream.of(huArr).map(human::getRegi_number);
		
		Stream<Long> strmLongRegiId = Stream.of(huArr).map(human::chRegi_id);
		strmLongRegiId.sorted()
				.forEach(System.out::println);/* 8304221000000 
											   * 8808081000000 
											   * 9004302000000 */

		strmLongRegiId = Stream.of(huArr).map(human::chRegi_id);
		long count1 = strmLongRegiId.count();
		out.println("count1: "+ count1);     //count1: 3
		
		strmLongRegiId = Stream.of(huArr).map(human::chRegi_id);
		long count2 = strmLongRegiId.collect(Collectors.counting());
		out.println("count2: " +count2);    //count2: 3
		
		strmLongRegiId = Stream.of(huArr).map(human::chRegi_id);
		long summing1  = strmLongRegiId.collect(Collectors.summingLong(s->s));
		out.println(summing1);   //26116604000000
		
		strmLongRegiId = Stream.of(huArr).map(human::chRegi_id);
		double average = strmLongRegiId.collect(Collectors.averagingLong(s->s));
		out.println(average);   //8.705534666666667E12
		
		Stream<Integer> humanyear= Stream.of(huArr).map(human::getYOB);
		average =humanyear.collect(Collectors.averagingInt(s->s));
		out.println(average);   //1987.0
		
		humanList = Stream.of(huArr).collect(Collectors.toList());
		Stream<human> humanStrm = humanList.stream();
		int YOB = humanStrm.collect(Collectors.reducing(0, human::getYOB, Integer::sum));
		out.println(YOB);  //5961
		
		Stream<String> Name = humanList.stream().map(human::getName);
		String test = Name.collect(Collectors.joining("-","<",">"));
		out.println(test);  //<둘리-홍길동-호돌이>

	}	
}
