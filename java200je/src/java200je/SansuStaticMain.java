package java200je;

public class SansuStaticMain {
	
	/* 상수를 정의한 클래스와 사용하는 클래스가 다를 경우 '클래스명.상수(ex) SansuStatic.WOMAN의 형식)'
	 * 여기서 클래스명은 상수를 선언한 클래스이다.
	 * 
	 * 클래스 내에서 선언하는 상수는 클래스명을 붙이지 않고 WOMEN, MEN과 같은 형식으로 사용한다.
	 * 선언된 상수는 API에 있으며 주로 사용하는 상수는 java.lang.Math클래스에 있다.
	 * */
	
	public final static int MEN = 3;
	public final static int WOMEN = 4;

	public static void main(String[] args) {
		int people1 = WOMEN;
		switch(people1) {
		case 3:System.out.println("남자");break;
		case 4:System.out.println("여자");break;
		}
		// int SansuStatic.WOMAN =4; <-- 상수에 대입할 수 없음
		int people2 = SansuStatic.WOMAN;
		switch(people2){
		case 1:System.out.println("남자");break;
		case 2:System.out.println("여자");break;
		}

	}

}
