package _09_Collection.Comparator;

import java.util.Comparator;

class human2 implements Comparator<human2> {  //�⺻���ı��� �� �ٸ� �������� �����ϰ��� �Ҷ� ���.
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
		
		System.out.println("h1.age�� h2.age���� ����.: " + h1.compare(h1,h2));
		System.out.println("h1.age�� h3.age������ �۴�.: " + h1.compare(h1,h3));
		System.out.println("h3.age�� h1.age�� ���� ũ��.: " + h3.compare(h3,h1));

	}
}
