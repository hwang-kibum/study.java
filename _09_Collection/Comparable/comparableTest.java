package _09_Collection.Comparable;

import java.util.Comparator;

class human1 implements Comparable<human1> {  //기본정렬 기준.
	int age;
	@Override
	public int compareTo(human1 h) {
		return (h.age-this.age);
	}
}

public class comparableTest {
	public static void main(String[] args) {

		human1 hu1 = new human1();
		hu1.age =12;
		human1 hu2 = new human1();
		hu2.age =12;
		human1 hu3 = new human1();
		hu3.age =23;
		
		System.out.println("hu1.age는 hu2.age값과 같다.: " + hu1.compareTo(hu2));
		System.out.println("hu1.age는 hu3.age값보다 작다.: " + hu1.compareTo(hu3));
		System.out.println("hu3.age는 hu1.age값 보다 크다.: " + hu3.compareTo(hu1));

	}

}
