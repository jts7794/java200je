package java200je;

import java.util.Scanner;

public class NumberAn43 {

	public static void main(String[] args) {
		int toNum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력 하시오 : ");
		
		try {
			toNum = scanner.nextInt(); 
		}catch(Exception e) {
			System.out.println("예외 : 타입확인 요망");
			System.exit(1); //프로그램 끝
			
		}
		
		int sum = sumAn(toNum,2,3); 
		//첫번째 인수 n번째 까지의 합, 등차수열 An+1 = An+세번째인수, 시작값:두번째인수 
		System.out.println("sum = "+sum);
		
		int sum2 = sumBn(toNum,4,6); 
		//첫번째 인수 n번째 까지의 합, 등비수열 An+1 = An*두번째인수*세번째인수, 시작값:1
		System.out.println("sum = "+sum2);
		
		int sum3 = sumCn(toNum,5,3,-2); 
		//첫번째 인수 n번째 까지의 합, 점화식 An+1 = 세번째인수*An +네번째인수, 시작값:두번째인수
		System.out.println("sum = "+sum3);
		
	}
	
	public static int numAn(int start, int n, int d) {
		return (start+n*d);
		//첫번째 값은 start의 값이 된다 numAn(start,i,d)로부터 두번째 인수 i가 0이기 때문에 *사칙연산은 괄호가 없으면 곱셉,나눗셈이 먼저 
	}
	
	public static int sumAn(int n, int start, int d) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("["+numAn(start,i,d)+"]");
			sum += numAn(start,i,d);
		}
		return sum;
	}
	
	public static int numBn(int start, int n , int r) {
		int nums = 1;
		for(int i = 0; i < n; i++) {
			
			nums *= start*r;
			
		}
		return nums;
	}
	
	public static int sumBn(int n, int start, int r) {
		int sum = 0;
		for(int i=0; i <n; i++) {
			System.out.println("["+numBn(start,i,r)+"]");
			sum += numBn(start,i,r);
		}
		return sum;
	}
	
	public static int numCn(int n, int start, int a, int d) {
		// An+1 = a*An+d 점화식
		for(int i = 0; i < n; i++) {
			start = a*start+d;
		}
		return start;
	}
	
	public static int sumCn(int n, int start, int a, int d) {
		int sum = 0;
		for(int i = 0; i < n ; i++) {
			System.out.println("["+ numCn(i,start,a,d)+"]");
			sum += numCn(i,start,a,d);
		}
		
		return sum;
	}

}
