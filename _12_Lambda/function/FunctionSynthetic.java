package _12_Lambda.function;

import java.util.function.Function;

public class FunctionSynthetic {
	public static void main(String[] args) {
	//�Լ� f1, g1�� �ִٰ� ������ f1�� ���� �� g1�� �����Ѵ�.
	Function<String, Integer> f1 = (s) -> Integer.parseInt(s, 16);
	Function<Integer, String> g1 = (i) -> Integer.toBinaryString(i);
	Function<String, String> h1 = f1.andThen(g1);
	System.out.println(h1.apply("FF"));
	
	
	//�Լ� f2, g2�� �ִٰ� ������ g2�� ���� �� f2�� �����Ѵ�.
	Function<Integer, Integer> h2 = f1.compose(g1);
	System.out.println(h2.apply(2));
	
	//�Լ��� �����ϱ� ������ ���İ� ������ '�׵� �Լ�'�� �ʿ��� �� ����Ѵ�. (1�� ������ 1�� ����)
	Function<String, String> h3 = s -> s;
	System.out.println(h3.apply("�ȳ��ϼ���"));

	}
}
