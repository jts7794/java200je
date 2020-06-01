package java200je;

public class EasyBoxingMain {

	public static void main(String[] args) {
		//기본 타입은 기본 타입끼리, 참조 타입은 참조 타입끼리 캐스팅과 프로모션이 발생한다.
		//박싱/언박싱은 JAVA5부터 기본 타입과 랩퍼 클래스 사이에서 발생한다. 
		
		int intNm1 = 123;
		long longNum1 = 345L;
		double doubleNum=123.123;
		
		Integer intWrap1 = new Integer(187);
		Long longWrap1 = new Long(876);
		Double doubleWrap1 = new Double(365);
		
		Object obj = new Object(); 		//predefined
		
		Integer intWrap2 = intNm1;		//박싱
		intNm1 = intWrap2;				//언박싱 intNm1 = (int)Int Wrap2;
		
		obj = longWrap1;				//상속 관계(계층) 프로모션
		longWrap1 = (Long)obj;			//상속 관계(계층) 캐스팅
		obj = intNm1; 					//박싱 -> obj = new new Integer(intNm1);
		intNm1 = (Integer)obj;			//언박싱 -> ((Integer)obj).intValue();
		System.out.println(intNm1);
	}

}
