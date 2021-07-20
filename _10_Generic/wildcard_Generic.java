package _10_Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


interface packageable { public boolean packaing(); }

class Box<T> implements packageable {
	public final static int MAX_SIZE = 9;
	private ArrayList<T> kind = new ArrayList<T>();
	public boolean status = false;	
	
	@Override
	public boolean packaing() { 
		return this.status = true; 
	}
	
	public <U extends Fruit> void put(U u) {

		if(this.status == true) {
			System.out.println("박스가 포장됨.");
		} else if (kind.size() == MAX_SIZE ){
			packaing();
		} else {
			System.out.println("박스에 들어갔습니다." + u.toString());
			kind.add(u);
		}
	}

	public void print() {
		Iterator i = kind.iterator();
		while(i.hasNext()) {
			i.next();
		}
	}
	public boolean change() {
		return this.status != this.status;
	}
	
	public String getStatus() {
		String str ;
		if(status==true) {
			System.out.println(str = "박스가 가득참.");
		} else {
			System.out.println(str = "박스에 공간이 있다.");
		}
		return str;
	}
	
}


class ToysBox<T extends Toys > extends Box{
	@Override public String toString() { return "ToyBoy"; }
}
class bbororoBox<T extends Toys> extends ToysBox<T> {}

class fruit0Box<T extends fruit0> extends Box<T>{}
class applesBox<T extends apples> extends Box<T>{}

class Toys { @Override public String toString() { return "Toys"; } }
class bbororo extends Toys{	@Override public String toString() { return "bbororo"; }
}

class fruit0 { @Override public String toString() { return "fruit0"; } }
class apples { @Override public String toString() { return "apples"; } }

public class wildcard_Generic {
	public static void main(String[] args) {
		Box<Object> box0 = new Box<Object>();
		ToysBox<Toys> Toysbox0 = new ToysBox<Toys>();
		fruit0Box<fruit0> fruit0box0 = new fruit0Box<fruit0>();
		bbororoBox bbororobox0 = new bbororoBox();
		applesBox applesbox0 = new applesBox();
		
		Toys t = new Toys();
		fruit0 f = new fruit0();
		bbororo b = new bbororo();
		apples a = new apples();
		
		box0.<Object>put(new Object());
		box0.put(new Toys());
		box0.put(new fruit0());
		box0.put(new bbororo());
		box0.put(new bbororo());
		box0.put(new bbororo());
		box0.put(new bbororo());
		box0.put(new bbororo());
		box0.put(new bbororo());
		box0.put(new bbororo());
		box0.put(new bbororo());
		box0.put(new bbororo());
		box0.put(new bbororo());
		box0.print();
		box0.getStatus();
		
		
		Toysbox0.put(new Object());
		Toysbox0.put(new apples());
		Toysbox0.put(new Toys());
		Toysbox0.put(new Toys());
		Toysbox0.put(new Toys());
		Toysbox0.put(new Toys());
		Toysbox0.put(new Toys());
		Toysbox0.put(new Toys());
		Toysbox0.put(new Toys());
		Toysbox0.put(new Toys());
		Toysbox0.put(new Toys());

	}

}
