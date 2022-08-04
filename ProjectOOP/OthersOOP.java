import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {	// 예외 던짐
		// Class : System, Math, FileWriter
		// Instance : f1, f2
		
		System.out.println(Math.PI);	// Math라는 클래스의 PI라는 변수를 호출 PI 변수에는 3.14...라는 값이 담겨 있음
		System.out.println(Math.floor(1.8));	// 1.0, Math라는 클래스의 floor()라는 반내림을 해주는 메소드를 호출하고, 인자로 1.8를 전달
		System.out.println(Math.ceil(1.8));	// 2.0, Math라는 클래스의 ceil()라는 반올림을 해주는 메소드를 호출하고, 인자로 1.8를 전달
		// 서로 연관된 같은 주제를 가지고 있는 변수와 메소드를 그룹핑한 것이 클래스이다.
		
		FileWriter f1 = new FileWriter("data.txt");	// FileWriter라는 클래스를 복제하여 f1이라는 변수에 담고, 이 변수는 데이터 타입을 FileWriter로 가짐. 이 복제본은 data.txt라는 파일의 내용을 저장하겠다라는 상태를 가짐
		f1.write("Hello");	// data.txt에 "Hello" 텍스트 쓰기
		f1.write(" Java");	// data.txt에 " Java" 텍스트 쓰기
		
		// 위의 Math는 클래스 자체를 사용하였지만, 밑에 FileWriter는 data.txt라는 파일의 내용을 저장하겠다라는 상태를 가지는 클래스 복제본을 사용했다.
		
		FileWriter f2 = new FileWriter("data2.txt");	// FileWriter라는 클래스를 복제하여 f2이라는 변수에 담고, 이 변수는 데이터 타입을 FileWriter로 가짐. 이 복제본은 data2.txt라는 파일의 내용을 저장하겠다라는 상태를 가짐
		f2.write("Hello");	// data2.txt에 "Hello" 텍스트 쓰기
		f2.write(" Java2");	// data2.txt에 " Java2" 텍스트 쓰기
		f2.close();	// data2.txt 닫기
		
		f1.write("!!!");	// data.txt에 "!!!" 텍스트 쓰기
		f1.close();	// data.txt 닫기

		// 위의 Math 클래스의 필드들은 1회용으로 사용하지만, 밑에 FileWriter 복제본은 여러 번 사용 가능하다.
		// Math 같은 경우 클래스에 있는 필드들을 그대로 사용하지만, FileWriter 같은 경우에는 클래스를 복제하여서 제어한다.
	}

}
