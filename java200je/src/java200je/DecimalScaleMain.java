package java200je;


public class DecimalScaleMain {

	public static void main(String[] args) {
		int deciNUm = 123;		//양수만 정의
		System.out.print("1: ");
		for(int i=0;i<32;i++) {
			System.out.print((int)(deciNUm/Math.pow(2, 31-i)));
			deciNUm=(int)(deciNUm%Math.pow(2, 31-i));
		}
		System.out.println();
		System.out.println("2: "+toBinal(123));	//2진수
		System.out.println("3: "+0173);			//8진수
		System.out.println("4: "+toOctal(123));	//8진수
		System.out.println("5: "+0x7b); 		//0x7B 16진수

	}
	
	public static String toBinal(int num) {
		int temp=num;
		String sToOct="";	//String 초기화
		for(int i=0;i<32;i++) { 
			sToOct=(temp%2)+sToOct;
			temp=temp/2;
		}
		return sToOct;
	}
	
	public static String toOctal(int num) {
		int temp=num;
		String sToOct=""; //String 초기화
		for(int i=0;i<32/3;i++) {
			sToOct=(temp%8)+sToOct;
			temp=temp/8;
		}
		return sToOct;
	}

	/* 콘솔 확인
1: 00000000000000000000000001111011
2: 00000000000000000000000001111011
3: 123
4: 0000000173
5: 123
	 * */
}
