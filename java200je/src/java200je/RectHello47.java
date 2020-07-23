package java200je;

public class RectHello47 {

	public static void main(String[] args) {

		printRectString("Hello",true);     //영어는 공백 홀수 개 포함 영어 소문자 두 글자가 1바이트
		//printRectString("GO JAVA5", true); //영어는 공백 홀수 개 포함
		//printRectString("서울", false);		 //한글 출력 한 글자가  1바이트
		//printRectString("반갑습니다", false);
		System.out.println();
		System.out.println((int)'┐'); //9488
		System.out.println((int)'─'); //9472
		System.out.println((int)'│'); //9474
		System.out.println((int)'┌'); //9484
		System.out.println((int)'┘'); //9496
		System.out.println((int)'└'); //9492
		
	}

	
	public static void printRectString(String str, boolean isE) {
		int count = str.length();
		
		int width = count;
		if(!isE) {//한글
			width = count+1;
		}else {//영어 
			width = count;
		}
		
		// ┍━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┑ 9484 9472 9488
		// System.out.print("\1"); 			//┍ 1
		
		System.out.print((char)9484); 		// ┍ 9484
		for(int i=0; i < width; i++) {
			System.out.print((char)9472); 	// ━ 9472
			//System.out.print('\6');
		}
		
		//System.out.println('\2');			// ┑ 9488
		System.out.println((char)9488);
		// |                                   ┃ 9474
		//System.out.print('\5');			// ┃
		System.out.print((char)9474);
		if(!isE) {//한글
			System.out.print(str);	// str
		}else {//영어
			System.out.print(str);			// str
		}
		
		System.out.println((char)9474);		// ┃ 9474
		//System.out.println('\5');			// ┃ 9474
		
		// ┕━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┙ 9492 9472 9496
		//System.out.print('\3');
		System.out.print((char)9492);		// ┕ 9492
		for(int i = 0; i < width ; i ++) {
			//System.out.print('\6');
			System.out.print((char)9472);	// ━ 9472
		}
		
		//System.out.println('\4');
		System.out.println((char)9496);		// ┙ 9496
		
	}
	
/*
┌─────┐
│Hello│
└─────┘
9488
9472
9474
9484
9496
9492
 */
}
