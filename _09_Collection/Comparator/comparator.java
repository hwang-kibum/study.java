package _09_Collection.Comparator;

import java.util.Comparator;

class human2 implements Comparator<human2> {  //기본정렬기준 외 다른 기준으로 정렬하고자 할때 사용.
	int age;
	@Override
	public int compare(human2 h1, human2 h2) {
		return (h1.age - h2.age) *(-1);
	}
}
public class comparator {

	public static void main(String[] args) {
		human2 h1 = new human2();
		h1.age = 12;
		human2 h2 = new human2();
		h2.age = 12;
		human2 h3 = new human2();
		h3.age = 23;
		
		System.out.println("h1.age는 h2.age값과 같다.: " + h1.compare(h1,h2));
		System.out.println("h1.age는 h3.age값보다 작다.: " + h1.compare(h1,h3));
		System.out.println("h3.age는 h1.age값 보다 크다.: " + h3.compare(h3,h1));

	}
}
