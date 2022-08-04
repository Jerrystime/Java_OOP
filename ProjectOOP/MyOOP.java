
public class MyOOP {
	
	public static void main(String[] args) {
		Print.delimiter = "----";	// Print 클래스 delimiter 변수에 구분 문구 할당
		Print.A();	// Print 클래스의 A 메소드 호출
		Print.A();
		Print.B();	// Print 클래스의 B 메소드 호출
		Print.B();
		
		Print.delimiter = "****";	// Print 클래스 delimiter 변수에 구분 문구 할당
		Print.A();	// Print 클래스의 A 메소드 호출
		Print.A();
		Print.B();	// Print 클래스의 B 메소드 호출
		Print.B();
	}
}

class Print {	// Print 클래스 선언
	public static String delimiter;	// 클래스 변수 선언
	
	public static void A() {	// 반복적으로 사용되는 코드를 메소드로 그룹핑
		//.. 일억줄의 코드
		System.out.println(delimiter);	// 클래스 변수 출력
		System.out.println("A");
		System.out.println("A");
	}
	
	public static void B() {	// 매개 변수로 구분 문구를 받음
		//.. 일억줄의 코드
		System.out.println(delimiter);	// 클래스 변수 출력
		System.out.println("B");
		System.out.println("B");
	}
}
