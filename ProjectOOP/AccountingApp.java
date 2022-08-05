class Accounting{
    public static double valueOfSupply;	// 클래스 변수 선언
    public static double vatRate = 0.1;	// 클래스 변수 선언 및 호출
    public static double getVAT() {	// 클래스 메소드 생성
        return valueOfSupply * vatRate;	// 부가세 계산 결과 반환
    }
    public static double getTotal() {	// 클래스 메소드 생성
        return valueOfSupply + getVAT();	// 총 금액 계산 결과 반환
    }
}
public class AccountingApp {
    public static void main(String[] args) {
        Accounting.valueOfSupply = 10000.0;	// 클래스 변수 공급가액 할당
        System.out.println("Value of supply : " + Accounting.valueOfSupply);	// 클래스 변수 공급가액 호출
        System.out.println("VAT : " + Accounting.getVAT());	// 클래스 변수 부가세 호출
        System.out.println("Total : " + Accounting.getTotal());	// 클래스 변수 총 금액 호출
  
    }
}