package java200je;

import java.util.Scanner;

public class NumberAn44 {

	public static void main(String[] args) {
		int toNum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력 하시오 : ");
		try {
			toNum = scanner.nextInt();
		}catch(Exception e) {
			System.out.println("예외:타입확인 요망");
			System.exit(1); //프로그램 끝
		}
		
		int sum = sumAn(toNum, 1,2,true);
		System.out.println("sum = "+sum);
		int sum2 = sumAn(toNum,1,2,false);
		System.out.println("sum = "+sum2);
		
	}
	
	public static int numAn(int start, int n, int d) {
		return(start+n*d); //An+1 = An + n*d
	}
	
	public static int posiNega(int start, int n , int d) {
		int oper = (n%2) == 0 ?-1:1; //n을 2로 나눈 나머지 0이면(짝수번) -1 그렇지 않으면(홀수번) 1 
		return oper*numAn(start,n,d);
	}
	
	public static int posiNega(int start, int n , int d, boolean isEvenNega) {
		int oper = isEvenNega?1:-1; //isEvenNega 가 true 면 1 false 면 -1
		return oper*posiNega(start,n,d);
	}
	
	public static int sumAn(int n, int start, int d, boolean isEvenNega) {
		int sum = 0;
		for(int i=0; i <n ; i++) {
			System.out.print("["+posiNega(start,i,d,isEvenNega)+"]");
			sum += posiNega(start,i,d,isEvenNega);
		}
		return sum;
		
	}

}

/*
숫자를 입력 하시오 : 10
[-1][3][-5][7][-9][11][-13][15][-17][19]sum = 10
[1][-3][5][-7][9][-11][13][-15][17][-19]sum = -10
*/