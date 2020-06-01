package java200je;

public class AssignMain {

	public static void main(String[] args) {
		//기본 타입은 기본 타입끼리, 참조 타입은 참조 타입끼리 캐스팅과 프로모션이 발생한다.
		//박싱/언박싱은 JAVA5부터 기본 타입과 랩퍼 클래스 사이에서 발생한다. 
		
		int intNm1 = 123;
		long longNum1 = 345L; 					//long타입은 l이나 L을 숫자에 붙인다 float타입은 345.56F 처럼 f나 F를 숫자에 붙인다
		double doubleNum = 123.123;
		
		Integer intWrap1 = new Integer(187);	//랩퍼 클래스도 참조 타입이다. 랩퍼 클래스는 기본 타입을 참조 타입으로 만들 때 사용하며, 테이터 보관과 여러 메서드를 제공하는 역할
		Long longWrap1 = new Long(876);
		Double doubleWrap1 = new Double(365);
		
		String str = "Hello JAVA7"; 			//predefined 문자열은 new를 사용할 수도 있고 사용하지 않을 수도 있다.
		String newStr = new String("Hello");	//predefined
		Object obj = new Object();				//predefined
		
		Student stu = new Student();			//사용자 정의
		
		doubleNum = longNum1;					//primitive 프로모션
		intNm1=(int)doubleNum;					//primitive 캐스팅
		longNum1 = longWrap1.longValue();		//pri <--> wrap
		
		//longWrap1 = intWrap1;					//reference type mismatch
		obj = longWrap1;						//상속 관계(계층) 프로모션
		longWrap1 =(Long)obj;					//상속 관계(계층) 캐스팅
		System.out.println(longWrap1.longValue());
		obj=stu;								//상속 관계(계층) 프로모션
		stu=(Student)obj;						//상속 관계(계층) 캐스팅
		System.out.println(stu.getName());
		//str=stu;								//reference type mismatch
	}

}
