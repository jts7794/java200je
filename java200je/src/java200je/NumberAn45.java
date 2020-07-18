package java200je;

import java.util.Scanner;

public class NumberAn45 {

	public static void main(String[] args) {

		int toNum = 0;
		System.out.print("숫자를 입력 하시오 : ");
		Scanner scanner = new Scanner(System.in);
		try {
			toNum = scanner.nextInt();
		}catch(Exception e) {
			System.out.println("예외: 타입확인 요망");
			System.exit(1); // 프로그램 끝
		}
		
		double sum = sumAn(1, toNum, 1);
		System.out.println("\n 1 to "+toNum+"summation="+sum);
		
		double sum2  = sumAn(1, toNum, 2);
		System.out.println("\n 1 to "+toNum + " 1/odd summation="+sum2);
	}
	public static int numAn(int start, int n, int d) {
		return (start+n*d);
	}
	
	public static double divNum(int start, int n, int d) {
		return 1.0/numAn(start,n,d);
	}
	
	public static double sumAn(int start, int n, int d) {
		double sum = 0;
		for(int i=0; i < n; i++) {
			System.out.print("["+divNum(start,i,d)+"]");
			sum += divNum(start,i,d);
		}
		return sum;
	}

}

/* Console results
숫자를 입력 하시오 : 10
[1.0][0.5][0.3333333333333333][0.25][0.2][0.16666666666666666][0.14285714285714285][0.125][0.1111111111111111][0.1]
 1 to 10summation=2.9289682539682538
[1.0][0.3333333333333333][0.2][0.14285714285714285][0.1111111111111111][0.09090909090909091][0.07692307692307693][0.06666666666666667][0.058823529411764705][0.05263157894736842]
 1 to 10 1/odd summation=2.1332555301595546
*/
