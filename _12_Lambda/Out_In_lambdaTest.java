package _12_Lambda;
@FunctionalInterface 
interface MyFunction02 {
	void myMethod();
}
class Outer {
	int val = 10 ;  //Outer.this.val
	class Inner {
		int val = 20;  //this.val
		
		void method(int i) {  //void method(final int i){
			int val = 30;   // final int val=30;
//			i = 10;  //����. ����� ���� ������ �� ����.
			MyFunction02  f = () -> {
				System.out.println("             i: " +i);
				System.out.println("           val: " +val);
				System.out.println("      this.val: " + ++this.val);
				System.out.println("Outer.this.val: " + ++Outer.this.val);

			};
			f.myMethod();
		}
	}//Inner END
}//Outer END


public class Out_In_lambdaTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner inn = out.new Inner();
		inn.method(100);
	}

}
