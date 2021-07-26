package _12_Lambda;
@FunctionalInterface
interface MyFunction {
	void run();
}
class fruit {
	String name;
}

class name {
	String name;
	name (String name){
		this.name = name;
	}
}

public class lambdaTest01 {
	static void execute(MyFunction f) {	f.run(); }
	static MyFunction getMyFunction () {
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	public static void main(String[] args) {
		MyFunction f1 = ()-> System.out.println("f1.run()");
		
		MyFunction f2 = new MyFunction() {
			public void run() {
				System.out.println("f2.run()");
			}
		};
		MyFunction f3 = getMyFunction();

		fruit f = new fruit();
		name n = new name(new String("Çï·Î"));
		System.out.println(f);
		System.out.println(n);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		
		
		f1.run();
		f2.run();
		f3.run();
		
		
		execute(f1);
		execute(()-> System.out.println("run()"));
		
	}
}
