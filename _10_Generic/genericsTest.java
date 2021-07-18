package _10_Generic;

//Generic Class
class Box0<T> {  // 모드 타입 허용.
	T item;
	
	void setItem (T item) { this.item = item; }
	T getItem() { return item; }
}
class Box1<T> {    //모든 Parameter만 받는 Box1
	T item;
	
	Box1 (){}
	Box1 (T item){
		this.item = item;
	}
	void setItem (T item) { this.item = item; }
	T getItem() { return item; }
}
class Box2<String> {   //String parameter만 받는 Box2
	String item;
//	Box(){}   만들수 없다. 
	Box2(String item){
		this.item = item;
	}
	void setItem(String item) { this.item = item; }
	String getItem() { return item; }
}

class Box3<K, S> {
	K wight;
	S size;
	Box3(){}
	Box3(K wight, S size){
		this.wight = wight;
		this.size=size;
	}
	void setWight(K wight) { this.wight=wight; }
	void setSize(S size) { this.size=size; }
	public K getWight() { return wight; }
	public S getSize() { return size; }
	
}

class Box4<T> {
	T[] itemArr;
	Box4(){}
	Box4(T[] itemArr){
		this.itemArr = itemArr;
	}
	
	void setItem(T itemArr, int n) { this.itemArr[n] = itemArr; }
	public T getItem(int n) { return itemArr[n]; }
}

//Generic parameter 
public class genericsTest {
	public static void main(String[] args) {
		
		Box0 b0 = new Box0();
		Box2 b2 = new Box2("사과");
		
		Box1 B1 = new Box1();

		
		b0.setItem(b2);
		System.out.println(b0.getItem());
		b2.setItem(b2);
		System.out.println(b2.getItem());
		
		
		Box1<String> b5 = new Box1<String>("포도");
		Box1<Integer> b6 = new Box1<Integer>(12);
		System.out.println(b5.getItem());
		System.out.println(b6.getItem());
		
		Integer[] IntArr = {2, 4, 6, 7};
		Box4<Integer> b7 = new Box4<Integer>(IntArr);
		System.out.println(b7);
		b7.setItem(IntArr, 2);

		
	}
}
