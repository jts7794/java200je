package java200je;

public class ArrayInit {

	/*배열을 사용하려면 배열을 선언하고, 정의하고, 초기화하는 과정이 필요하다. 배열 선언에는 배열 타입(int)과 배열을 의미하는 []와 배열 이름이 필요하다.
	 * 선언은 사용할 수 있는 메모리 공간(힙 영역)에는 올라가지 않고, 이름을 보관하는 메모리 공간(스택 영역)에만 올라간다.
	 * */
	public static void main(String[] args) {
		//기본 타입의 배열 사용 방법 1 선언
		int[]a=null; //선언
		//정의
		a=new int[5];
		//초기화
		a[0]=2;
		a[1]=5;
		a[2]=3;
		a[3]=9;
		a[4]=8;
		
		//방법 2 선언 정의 초기화
		int[]b=new int[] {2,5,3,9,8};
		
		//방법 3 선언 정의 초기화
		int[]c= {2,5,3,9,8};
		
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();

		int[]d =a;	//참조에 의한 대입
		a[4]=55;	//a의 값을 변동시키면 d의 값이 바뀔까? YES!
		for(int i=0;i<a.length;i++) {
			System.out.print(d[i]+"\t");
		}
		System.out.println();
		
		int[]e = new int[5];
		System.arraycopy(d, 0, e, 0, d.length); // value assignment 0은 숫자
		//arraycopy(소스,복사될 소스가 시작하는 위치,데스티네이션,복사가 시작되는 데스티네이션의 위치, 복사할 배열의 길이)
		
		d[4]=100;	//d의 값을 변동시키면 e의 값이 바뀔까? NO!
		for(int i = 0;i<e.length;i++) {
			System.out.print(e[i]+"\t");
		}
	}

	/*콘솔 확인
2	5	3	9	8	
2	5	3	9	55	
2	5	3	9	55
	 * */
}
