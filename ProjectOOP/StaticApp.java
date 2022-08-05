class Foo {
	public static String classVar = "I class Var";
	public String instanceVar = "I instance Var";
	
	public static void classMethod() {
		System.out.println(classVar);	// 클래스 메소드 안에서는 클래스 변수에 접근 가능
//		System.out.println(instanceVar);	// 클래스 메소드 안에서는 인스턴스 변수에 접근 불가능
	}
	
	public void instanceMethod() {
		System.out.println(classVar);	// 인스턴스 메소드 안에서는 클래스 변수에 접근 가능
		System.out.println(instanceVar);	// 인스턴스 메소드 안에서는 인스턴스 변수에 접근 가능
	}
}

public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);	// 클래스를 통해서 클래스 변수에 접근이 가능
//		System.out.println(Foo.instanceVar);	// 클래스를 통해서 인스턴스 변수에 접근이 불가능
		// 인스턴스 변수는 인스턴스를 통해서만 접근이 가능하다.
		
		Foo.classMethod();	// 클래스에서 클래스 메소드 호출 가능
//		Foo.instanceMethod();	// 클래스에서 인스턴스 메소드 호출 불가능
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar);	// 인스턴스에서는 클래스 변수 호출 가능
		System.out.println(f1.instanceVar);	// 인스턴스에서는 인스턴스 변수 호출 가능
		
		f1.classVar = "changed by f1";	// 인스턴스 f1에서 클래스 변수 classVar의 값을 변경
		System.out.println(Foo.classVar);	// changed by f1, 인스턴스는 클래스 변수를 참조하기 때문에 인스턴스나 클래스나 어느 곳에서 값을 바꾸게 되면 클래스 변수의 값은 바뀐다.
		System.out.println(f2.classVar);	// changed by f1
		
		f1.instanceVar = "changed by f1";	// 인스턴스 f1에서 인스턴스 변수 instanceVar의 값을 변경
		System.out.println(f1.instanceVar);	// changed by f1, 인스턴스는 인스턴스 변수를 복제하기 때문에 값을 바꾼 인스턴스 내에서만 인스턴스 변수의 값이 바뀌지 다른 곳에는 영향을 주지 않는다.
		System.out.println(f2.instanceVar);	// I instance Var
	}

}
