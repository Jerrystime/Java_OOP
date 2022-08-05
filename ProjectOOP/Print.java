
class Print {	// class (클래스 이름) {} 안에 클래스의 멤버들을 담음
	public String delimiter;	// 클래스 변수 선언
	
	public Print(String delimiter) {
		this.delimiter = delimiter;
	}
	
	public void A() {	// 반복적으로 사용되는 코드를 메소드로 그룹핑
		//.. 일억줄의 코드
		System.out.println(delimiter);	// 클래스 변수 출력
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {	// 매개 변수로 구분 문구를 받음
		//.. 일억줄의 코드
		System.out.println(delimiter);	// 클래스 변수 출력
		System.out.println("B");
		System.out.println("B");
	}
}