
public class MyOOP {
	
	public static void main(String[] args) {	// Java는 java 파일명과 똑같은 클래스의 main 메소드를 실행시키기로 약속이 되어있고, main 메소드를 가지는 클래스에만 앞에 public을 붙여줘야 한다.
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

// java 파일을 컴파일하면 각각의 클래스가 파일 형태로 만들어진다.
