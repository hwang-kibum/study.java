package _12_Lambda;
@FunctionalInterface
interface MyFunction01{
	void myMethod();  //public abstaract void myMethod();
}
class lambdaTest02 {
	public static void main(String[] args) {
		MyFunction01 f = ()->{}; //MyFunction01 f=(MyFunction01) (() -> {});
		Object obj = (MyFunction01)(() -> {}); //Object타입으로 형변환이 생략.
		String str = ((Object)(MyFunction01)(()-> {})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
//		System.out.println(()->{});   //람다식은 Object타입으로 형변환 안됨.
		System.out.println((MyFunction01)(()->{}));
//		System.out.println((MyFunction01)(()->{}).toString());  
		System.out.println(((Object)(MyFunction01)(()->{})).toString());
	}

}
