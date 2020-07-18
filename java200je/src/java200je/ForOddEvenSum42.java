package java200je;

import java.util.Scanner;

public class ForOddEvenSum42 {

	public static void main(String[] args) {

		int toNum = 0;
		System.out.print("숫자를 입력");
		Scanner scanner = new Scanner(System.in);
		try { //키보드로 입력 
			toNum = scanner.nextInt();
		}catch(Exception e){
			System.out.println("예외:타입확인 요망");
			System.exit(1); //프로그램 끝
		}
		int sumOdd = 0;
		int sumEven = 0;
		
		sumEven = summEven(1,toNum);
		System.out.println("1 to "+toNum+" 짝수들의 sum "+sumEven);
		
		sumOdd = summOdd(1,toNum);
		System.out.println("1 to "+toNum+" 홀수들의 sum "+sumOdd);

	}

	public static int summEven(int start, int end) {
		int sumEven = 0;
		//짝수합
		for(int i = 1; i <= end; i++) {
			if(i%2 != 0) {
				continue;
			}
			sumEven+=i;
		}
		return sumEven;
	}
	
	public static int summOdd(int start, int end) {
		int sumOdd = 0;
		//홀수합
		for(int i = 1; i <= end; i++) {
			if(i%2 == 0) {
				continue;
			}
			sumOdd += i;
		}
		return sumOdd;
	}
}
