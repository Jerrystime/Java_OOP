
public class MyOOP {

	public static String delimiter;	// 클래스 변수 선언
	
	public static void main(String[] args) {
		delimiter = "----";	// 클래스 변수에 구분 문구 할당
		printA();	// 메소드 호출
		printA();
		printB();
		printB();
		
		delimiter = "****";	// 클래스 변수에 구분 문구 할당
		printA();	// 메소드 호출
		printA();
		printB();
		printB();
	}

	private static void printA() {	// 반복적으로 사용되는 코드를 메소드로 그룹핑
		//.. 일억줄의 코드
		System.out.println(delimiter);	// 클래스 변수 출력
		System.out.println("A");
		System.out.println("A");
	}
	
	private static void printB() {	// 매개 변수로 구분 문구를 받음
		//.. 일억줄의 코드
		System.out.println(delimiter);	// 클래스 변수 출력
		System.out.println("B");
		System.out.println("B");
	}

}
