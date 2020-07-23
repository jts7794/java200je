package java200je;

public class GuGuDan48 {

	public static void main(String[] args) {
		printGuGu();
		//같은 클래스안의 스테텍 메서드 호출
		System.out.println("------------------------------------");
		
		GuGu gu  = new GuGu();
		//GuGu클래스의 멤버 메서드를 사용하기 위해 객체 생성
		gu.PrintGu();
		System.out.println("------------------------------------");
		
		GuGu.printGuGu();
		//다른 클래스의 스테틱 메서드를 사용할 때 '클래스명.메서드'
	}
	
	public static void printGuGu() {
		for(int i = 1; i <=9; i ++) {
			for(int j =1 ; j <= 9; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
				//System.out.printf("%d*%d=%d\t",j,i,i*j);
			}
			System.out.println();
		}
	}

}
