
public class MyOOP {
	
	public static void main(String[] args) {	// Java는 java 파일명과 똑같은 클래스의 main 메소드를 실행시키기로 약속이 되어있고, main 메소드를 가지는 클래스에만 앞에 public을 붙여줘야 한다.
		Print p1 = new Print();	// Print 클래스를 데이터 타입으로 가지는 Print 인스턴스를 p1 변수에 담음
		p1.delimiter = "----";	// p1 인스턴스 변수에 구분 문구 할당
		p1.A();	// p1 인스턴스 A() 인스턴스 메소드 호출
		p1.A();
		p1.B();	// p1 인스턴스 B() 인스턴스 메소드 호출
		p1.B();
		
		Print p2 = new Print();	// Print 클래스를 데이터 타입으로 가지는 Print 인스턴스를 p1 변수에 담음
		p2.delimiter = "****";
		p2.A();	// p2 인스턴스 A() 인스턴스 메소드 호출
		p2.A();
		p2.B();	// p2 인스턴스 B() 인스턴스 메소드 호출
		p2.B();
		
		p1.A();	// 인스턴스는 상태를 유지하고 있기 때문에 상태를 따로 초기화 시켜주지 않아도 된다.
		p2.A();
		p1.A();
		p2.A();

	}
}