

class human{
	int age=0;
	String name="";
	
	human(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public void getInfo() {
		System.out.println(getClass());
	}
	public void getInfo2( ) { 
		System.out.println(getClass().getName());
	}
	
	public String toString() {
		return age +"-" +name;
	}
	
}
public class ClassTest {
	human h;
	
	ClassTest(human h){
		this.h = h;
	}
	public String toString() {
		return h.age + h.name;
	}

	public static void main(String[] args) {
		human h = new human(11, "kim");
		ClassTest ct = new ClassTest(h);
		
		ct.h.getInfo();
		ct.h.getInfo2();
		System.out.println(ct.h.toString());
		System.out.println(ct.toString());
		
	}

}
