package _10_Generic;

import java.util.ArrayList;
import java.util.Iterator;
//�ڽ��� �� Ŭ����
class Fruit<T, S> {
	T sweet ;
	S size;
	Fruit (T t, S s){ 
		this.sweet = sweet;
		this.size = size;
	}
	public String toString() { return "Fruit"; }

}
//Fruit�� ��ӹ��� Apple
class Apple<T, S> extends Fruit<T, S> {

	String color;
	Apple(T t, S s, String color) {
		super(t, s);
		this.color = color;
	}
	public String toString() { return "Apple"; }

}
//Fruit�� ��ӹ��� Grape
class Grape<T, S> extends Fruit<T, S> {
	String color;
	Grape(T t, S s, String color){
		super(t, s);
		this.color = color;
	}
	public String toString() { return "Grape"; }

}

class Toy<T> {
	T size;
	Toy (T t) { this.size = t; }
	public String toString() { return "Toy"; }

}
//Toy�� ��ӹ��� ��(������)
class Bears<T> extends Toy<T> {
	Bears(T t){
		super(t);
	}
	public String toString() { return "Bears"; }
}

interface packagable { public boolean Packaging(); }

class Box<T> implements  packagable {
	private final static int MAX_SIZE=9;  //�ڽ��� �ƽ��� ���
	private boolean status = false;  //�������� false�� ���� / true�� �������� �ڽ̵Ȼ���
	ArrayList list = new ArrayList();   //�ڽ��� ���빰�� ���� ����Ʈ ����.
	Box(){}
	Box(T t){ 
		if(list.size() == MAX_SIZE) {
			System.out.println("Box max...");
		} else {
			list.add(t);
			if(list.size() == MAX_SIZE) {
				System.out.println("Box limit..");
			}
		} 
	}
	@Override
	public boolean Packaging() {
		return status = true;
	}
	public <U> void put(U u) {
		if(list.size() == MAX_SIZE) {
			int i = list.size()+1;
			System.out.println(i+" Box Max...");
		} else { 
			list.add(u);
			if(list.size() == MAX_SIZE){
				int j = list.size()+1;
				System.out.println(j+" Box Limit");
			}
		}
	}
	public boolean Change() {
		return status = !status;
	}
	
	public void print() {
		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
	}
	
}

public class genericTest {
	public static void main(String[] args) {
		
		//�ڽ� �ȿ� �� ǰ��
		Fruit f = new Fruit(new Integer(10), new Double(2.1));
		Apple a = new Apple(new Integer(10), new Double(2.1), "Green");
		Grape g = new Grape(new Integer(10), new Double(2.1), "Red");
		
		Toy t = new Toy(new Integer(10));
		Bears b = new Bears(new Integer(10));
		
		//�ڽ� ��������
		Box box = new Box();
		Box<Toy> boxt = new Box<Toy>();
		Box<Fruit> boxf = new Box<Fruit>();
		Box<Apple> boxa = new Box<Apple>();
		Box<Grape> boxg = new Box<Grape>();
		
		box.put(f);
		box.put(a);
		box.put(g);
		box.put(t);
		box.put(b);
		box.<Toy>put(f);
		box.<Toy>put(a);
		box.<Toy>put(g);
		box.<Toy>put(t);
		box.<Toy>put(b);
		box.print();
		
//		boxt.<Toy>put(f);
//		boxt.<Toy>put(a);
//		boxt.<Toy>put(g);
		boxt.<Toy>put(t);
		boxt.<Toy>put(b);
		boxt.print();
		
		boxf.<Fruit>put(f);
		boxf.<Fruit>put(a);
		boxf.<Fruit>put(g);
//		boxf.<Fruit>put(t);
//		boxf.<Fruit>put(b);
		boxf.print();
		
//		boxa.<Apple>put(f);
		boxa.<Apple>put(a);
//		boxa.<Apple>put(g);
//		boxa.<Apple>put(t);
//		boxa.<Apple>put(b);
		boxa.print();
		

	}

}