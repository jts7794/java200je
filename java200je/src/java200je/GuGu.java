package java200je;

public class GuGu {

	public void PrintGu() {
		for(int i = 1; i <=9; i++) {
			for(int j = 1; j <= 9 ; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
				//System.out.printf("%d*%d=%d\t",j,i,i*j);
			}
			System.out.println();
		}
	}
	
	public static void printGuGu() {
		for(int i =1 ; i <=9 ; i++) {
			for(int j=1 ;j <=9; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
				//System.out.printf("%d*%d=%d\t",j,i,i*j);
			}
			System.out.println();
		}
	}
}
