class Accounting{	// 서로 연관된 비슷한 성질을 가진 변수와 메소드를 Accounting 클래스로 그룹핑
	public double valueOfSupply;	// 인스턴스 변수 선언
    public static double vatRate = 0.1;	// 클래스 변수 선언 및 할당, 부가가치세율은 변하지 않는 값이기 때문에 클래스 변수로 사용
	
	public Accounting(double valueOfsupply) {	// double형의 매개 변수를 받는 생성자 생성
    	this.valueOfSupply = valueOfsupply;	// 매개 변수로 들어온 인자를 인스턴스 전역변수에 할당
    }
	    
    public double getVAT() {	// 인스턴스 메소드 생성
        return this.valueOfSupply * vatRate;	// 부가세 계산 결과를 반환
    }
    
    public double getTotal() {	// 인스턴스 메소드 생성
        return valueOfSupply + getVAT();	// 총 금액 게산 결과 반환
    }
}

public class AccountingApp {
    public static void main(String[] args) {
//      Accounting.valueOfSupply = 10000.0;	// 클래스 변수 할당
//      System.out.println("Value of supply : " + Accounting.valueOfSupply);	// 클래스 변수 호출 
//      System.out.println("VAT : " + Accounting.getVAT());	// 클래스 메소드 호출
//      System.out.println("Total : " + Accounting.getTotal());	// 클래스 메소드 호출
        
        Accounting a1 = new Accounting(10000.0);	// 생성자를 통해 공급가액을 인자로 전달하여 a1 인스턴스 생성
        Accounting a2 = new Accounting(20000.0);	// 생성자를 통해 공급가액을 인자로 전달하여 a2 인스턴스 생성
        
        System.out.println("Value of Supply : " + a1.valueOfSupply);	// a1 인스턴스 공급가액 호출
        System.out.println("Value of Supply : " + a2.valueOfSupply);	// a2 인스턴스 공급가액 호출
        
        System.out.println("VAT : " + a1.getVAT());	// a1 인스턴스 부가세 호출
        System.out.println("VAT : " + a2.getVAT());	// a2 인스턴스 부가세 호출
        
        System.out.println("Total : " + a1.getTotal());	// a1 인스턴스 총 금액 호출
        System.out.println("Total : " + a2.getTotal());	// a2 인스턴스 총 금액 호출
    }
}