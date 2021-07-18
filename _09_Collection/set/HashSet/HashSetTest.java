package _09_Collection.set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class fruit implements Comparable<fruit> {
	int count ;
	
	fruit(int c){
		this.count = c;
	}

	@Override
	public int compareTo(fruit f) {
		return this.count - f.count;
	}

	@Override
	public boolean equals (Object obj) {
		if(obj instanceof fruit) {
			fruit tmp = (fruit)obj;
			return count == tmp.count ? true : false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		Integer tmp = count;
		return tmp.hashCode();
	}
	@Override
	public String toString() {
		return "count: "+count;
	}

}

public class HashSetTest {

	public static void main(String[] args) {
		
		List al = new ArrayList();
		Set hs0 = new HashSet();
		Set hs1 = new HashSet(al);
		Set hs2 = new HashSet(5);
		
		//HashSet(int initialCapacity, float loadFactor) loadfactor : 해시맵의 부하 계수
		// 해당 용량이 0.8f(80%)차면 두배로 늘린다. 
		Set<fruit> hs3 = new HashSet<fruit>(10, 0.8f); 
		hs3.add(new fruit(3));
		hs3.add(new fruit(4));
		hs3.add(new fruit(5));
		hs3.add(new fruit(2));
		hs3.add(new fruit(1));
		hs3.add(new fruit(5));
		System.out.println("HashSet : "+hs3.size());
		System.out.println("HashSet: " +hs3);  //객체에 toString을 했을 경우
		Iterator it = hs3.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		it = hs3.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		
		System.out.println(hs1.equals(hs1));
		
	}

}
