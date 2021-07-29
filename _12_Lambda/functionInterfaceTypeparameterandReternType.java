package _12_Lambda;
@FunctionalInterface
interface MyFunction0 {
	void MyFunction0();

}
public class functionInterfaceTypeparameterandReternType {
	
	static void Method(MyFunction0 mf) { //매개변수의 타입이 MyFunction0인 메서드
		mf.MyFunction0();
	}	
	
	static MyFunction0 getMyFunction0() { //반환타입이 MyFunction0인 메서드
		MyFunction0 f = () -> System.out.println("반환타입으로 구현.");
		return f;
	}
	
	public static void main(String[] args) {
		MyFunction0 f1 = () -> System.out.println("람다식으로 구현.");
		
		MyFunction0 f2 = new MyFunction0() {
			public void MyFunction0() {
				System.out.println("익명으로 구현함.");
			}
		};
		
		MyFunction0 f3 = getMyFunction0();
		
		
		f1.MyFunction0();
		f2.MyFunction0();
		f3.MyFunction0();
		
		Method(f1);
		Method(f2);
	}
}
