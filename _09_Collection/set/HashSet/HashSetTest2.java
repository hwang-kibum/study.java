package _09_Collection.set.HashSet;

class human implements Comparable<human> {
	String reg;
	String name;
	int[] tmp = new int[6];
	char[] test = new char[6];
	
	human() {}
	human (String reg, String name) {
		this.name=name;
		this.reg=reg;
		int[] tmp = changeSI(reg);
	}

	protected int[] changeSI(String reg) {
		int tmp=0;
		for(int i=0; i<=5;i++) {
			test[i] = reg.charAt(i);
		}
		for(int j=0; j<=5; j++) {
			String tmp1 = test[j]+"";
			Integer tmp2 = Integer.parseInt(tmp1);
			this.tmp[j] += tmp2;
		}
		return this.tmp;
	}

	public int compareTo(human h) {
		return tmp[6] -h.tmp[6];
	}
}
public class HashSetTest2 {

	public static void main(String[] args) {
		human h =new human("8905241111111", "È²±â¹ü");
		System.out.println(h.tmp);
		
		for(int i =0; i<h.tmp.length;i++) {
			System.out.print(h.tmp[i]);
		}
	}
}
