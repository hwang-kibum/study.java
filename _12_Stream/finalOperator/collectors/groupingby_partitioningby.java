package _12_Stream.finalOperator.collectors;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class company {
	int number;
	String name;
	String department;
	String position;
	boolean sex;
	int age;
	int score;
//	생성자
	company(){}
	company(int number,String name, String department, String position, boolean sex, int age, int score){
		this.number = number;
		this.name = name;
		this.department = department;
		this.position = position;
		this.sex = sex;
		this.age = age;
		this.score = score;
	}
//	Getter, Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getAge() {
		return 2021-age;
	}
	public int getA() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	//Method
	public String toString() {
		return String.format("[ %s, %s, %s, %s, %d, %d ]", name, department,  position, sex ? "남" : "여", 2021-age, score );
	}
	enum level { HIGH, MID, LOW }
}
public class groupingby_partitioningby {
	public static void main(String[] args) {
		company[] comArr1 = { new company(1,"홍길동", "영업부", "대리", true, 1990, 89),
							new company(2, "신사임당", "마케팅", "사원", false, 1993, 92),
							new company(3, "안중근", "영업부", "사원", true, 1992, 90),
							new company(4, "선덕", "디자인부", "대리", false, 1992, 40),
							new company(5, "이혜원", "개발부", "사원", false, 1998, 70),
							new company(6, "정규식", "개발부", "대리", true, 1989, 60),
							new company(7, "김선달", "영업부", "과장", true, 1988, 59)};
		
		//partitioningBy  Stream을 2분할한다.
		List<company> comList = Arrays.asList(comArr1);
		Stream<company> strmCom =  comList.stream();
		
		
		Map<Boolean, List<company>> comSex = strmCom.collect(Collectors.partitioningBy(company::isSex));
		List<company> maleCompany = comSex.get(true);
		maleCompany.forEach(out::println);
		System.out.println();
		maleCompany = comSex.get(true);
		Map<Boolean, Map<Boolean, List<company>>> companyHighOfficer = strmCom.collect(Collectors.partitioningBy(company::isSex, Collectors.partitioningBy(s->s.getScore() > 70)));
		List<company> companymaletrue = companyHighOfficer.get(true).get(true);
		System.out.println(companymaletrue);
		
		Stream<company> c = maleCompany.stream();
		long count = c.collect(Collectors.counting());
		out.println(count);
		
		List<company> femaleCompany = comSex.get(false);
		femaleCompany.forEach(out::println);
		out.println();

		
		//groupingBy Stream n분할한다.
		company[] comArr2 = { 
				new company(1, "홍길동", "영업부", "대리", true, 1990, 89),
				new company(2, "신사임당", "마케팅", "사원", false, 1993, 92),
				new company(3, "안중근", "영업부", "사원", true, 1992, 90),
				new company(4, "선덕", "디자인부", "대리", false, 1992, 40),
				new company(5, "이혜원", "개발부", "사원", false, 1998, 70),
				new company(6, "정규식", "개발부", "대리", true, 1989, 60),
				new company(7, "김선달", "영업부", "과장", true, 1988, 59)};
		
		List<company> listCompany = Arrays.asList(comArr2);
		Stream<company> strmCompany = listCompany.stream();
		strmCompany.forEach(System.out::println);
		
		strmCompany = listCompany.stream();
		Map<company.level, List<company>> maplevListScore = strmCompany.collect(Collectors.groupingBy(s->{
			if(s.getScore() > 80) 		return company.level.HIGH;
			else if(s.getScore() > 60) 	return company.level.MID;
			else 						return company.level.LOW;
		}));
		System.out.println(maplevListScore);
		
		strmCompany = listCompany.stream();
		Map<Integer, List<company>> mapIntLisAge = strmCompany.collect(Collectors.groupingBy(s-> {
			if((s.getA()-1980)<10 ) 			return 80;
			else if((s.getA()-1990) < 10 )		return 90;
			else 								return 70; 
			}));
		System.out.println(mapIntLisAge);		
		strmCompany = listCompany.stream();
		/*
		 * Map<Boolean, List<company>> mapIntLisAge2 =
		 * strmCompany.collect(Collectors.groupingBy(s-> { if((s.getA()-1980)<10 )
		 * return 80; else if((s.getA()-1990) < 10 ) return 90; else return 70; },
		 * Collectors.collectingAndThen(reduce(0, company::isSex, ))));
		 */

	}

}
