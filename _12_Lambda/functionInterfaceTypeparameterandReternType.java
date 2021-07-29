package _12_Lambda;
@FunctionalInterface
interface MyFunction0 {
	void MyFunction0();

}
public class functionInterfaceTypeparameterandReternType {
	
	static void Method(MyFunction0 mf) { //�Ű������� Ÿ���� MyFunction0�� �޼���
		mf.MyFunction0();
	}	
	
	static MyFunction0 getMyFunction0() { //��ȯŸ���� MyFunction0�� �޼���
		MyFunction0 f = () -> System.out.println("��ȯŸ������ ����.");
		return f;
	}
	
	public static void main(String[] args) {
		MyFunction0 f1 = () -> System.out.println("���ٽ����� ����.");
		
		MyFunction0 f2 = new MyFunction0() {
			public void MyFunction0() {
				System.out.println("�͸����� ������.");
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
