package _09_Collection.Comparable;

import java.util.Comparator;

class human1 implements Comparable<human1> {  //�⺻���� ����.
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
		
		System.out.println("hu1.age�� hu2.age���� ����.: " + hu1.compareTo(hu2));
		System.out.println("hu1.age�� hu3.age������ �۴�.: " + hu1.compareTo(hu3));
		System.out.println("hu3.age�� hu1.age�� ���� ũ��.: " + hu3.compareTo(hu1));

	}

}
