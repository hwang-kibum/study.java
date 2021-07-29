package _12_Lambda;
@FunctionalInterface 
interface functionadd {
	public abstract int add(int a, int b);
}

public class testlambda {

	public static void main(String[] args) {
		functionadd f1 = (int a, int b) -> { return a + b; };
		int addnum1 = f1.add(10,  20);
		
		System.out.println(addnum1);
		
		functionadd f2 = (a, b) -> { return a + b; };
		testlambda tl = new testlambda();
		int addnum2 = tl.aMethod(f2, 4,  5);
		System.out.println(addnum2);
		
	}
	int aMethod(functionadd f, int a, int b) {
		return f.add(a, b);
	}

}
