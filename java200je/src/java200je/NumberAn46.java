package java200je;

import java.util.Scanner;

public class NumberAn46 {

	public static void main(String[] args) {

		int toNum = 0; 
		
		System.out.print("50이하의 숫자를 입력 하시오 : ");
		Scanner scanner = new Scanner(System.in);
		
		try {
			toNum = scanner.nextInt();
		}catch(Exception e) {
			System.out.println("예외: 타입확인 요망");
			System.exit(1);//프로그램 끝 
		}
		
		double sum = sumAn(1, toNum, 1);
		System.out.println("\n 1 to "+toNum+" := "+sum);
		double sum2 = sumAn(1, toNum, 2);
		System.out.println("\n 1 to "+toNum+" := "+sum2);
		
	}
	
	public static int numAn(int start, int n, int d) {
		return(start+n*d);
	}
	
	public static double divNum(int n) {
		return 1.0 / fact(n);
	}
	
	public static double fact(int m) {
		double temp = 1;
		if(m <= 0) {
			temp=1;
		}
		for(int i=m; i > 0; i--) {
			temp *=i;
		}
		return temp;
	}
	
	public static double sumAn(int start, int n, int d) {
		double sum = 0;
		for(int i=0; i <n ; i++) {
			System.out.print("["+divNum(numAn(start,i,d))+"]");
			sum += divNum(numAn(start,i,d));
		}
		return sum;
	}

}


/*Console results
50이하의 숫자를 입력 하시오 : 10
[1.0][0.5][0.16666666666666666][0.041666666666666664][0.008333333333333333][0.001388888888888889][1.984126984126984E-4][2.48015873015873E-5][2.7557319223985893E-6][2.755731922398589E-7]
 1 to 10 := 1.7182818011463847
[1.0][0.16666666666666666][0.008333333333333333][1.984126984126984E-4][2.7557319223985893E-6][2.505210838544172E-8][1.6059043836821613E-10][7.647163731819816E-13][2.8114572543455206E-15][8.22063524662433E-18]
 1 to10 := 1.1752011936438016
 */
