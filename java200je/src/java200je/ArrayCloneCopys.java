package java200je;

public class ArrayCloneCopys {

	/* clone 메서드를 이용한 배열 복사 방법 
	 * clone메서드는 섹션 74,75의 System.arraycopy처럼 1차원 배열에 대해 값에 의한 대입 복사를, 2차원 배열 이상에 대해서는 참조에 의한 대입 복사 
	 * */
	
	public static void main(String[] args) {
		int[]a = {8,5,2,4,6,3,7,9};
		int[]b = {8,5,2,4,6,3,7,9};
		int[]c = a; 
		// reference assignment copy
		// int[]c =a; 는 참조에 의한 대입 복사이다. 같은 타입의 배열을 대입할 때는 int[]c=a;와 같이 배열을 선언만 해도 된다.
		int[]d = new int[b.length];
		System.arraycopy(b, 0, d, 0, b.length); 
		// value assignment copy
		// 힙 영역에 {2,5,3,9,8}의 주소를 d에 대입 
		
		//clone을 지원하지 않으면 CloneNotSupportException 발생
		int[]e = (int[])b.clone(); 
		//배열 b를 복사할 때 b.clone메서드를 사용할 수 있다. b.clone메서드는 멤버 메서드로 b의 배열을 얕은 복사(shallow copy)하여 Object로 리턴한다.
		//이때 필요한 타입은 1차원 배열이므로 캐스팅(int[])하여 (int[])b.clone()으로 사용한다.
		print(e);
		b[4]=-2;
		//1차원 배열의 clone은 값에 의한 대입 복사이므로 배열 b의 값을 바꿔도 클론(clone, 복제)된 배열 e에는 영향이 없다.
		print(e);
		
		int[][] fa= {{4,5,6,7},{6,7,8,9}};
		int[][] fb=(int[][])fa.clone();
		// 2차원 배열의 clone은 참조에 의한 대입 복사이므로 배열 fa의 값을 바꾸면 클론된 배열 fb는 영향을 받는다.
		
		fa[0][0] =-1;
		print(fb); 	//1차원 배열 clone -> value assignment copy
					//2차원 배열 clone -> reference assignment copy
		//2차원 배열을 value assignment copy 시키기 위해서
		int[][]fc = new int[fa.length][fa[0].length];
		for(int i= 0; i< fa.length; i++) {
			fc[i] =(int[])fa[i].clone();
			// 2차원 배열을 1차원 배열 단위로 클론하면 값에 의한 대입 복사가 된다. 
		}
	
	fa[0][0] = -5;
	print(fc); //fc는 fa 변화에 영향을 받지 않는다.
	
}
public static void print(int[]p) {
	for(int i=0; i<p.length; i++) {
		System.out.print("["+p[i]+"]");
	}
	System.out.println();
}
public static void print(int[][]p) {
	for(int i=0; i<p.length;i++) {
		for(int j =0 ; j<p[i].length;j++) {
			System.out.print("["+p[i][j]+"]");
		}
		System.out.println();
	}
	}



}

/*
 * 콘솔
[8][5][2][4][6][3][7][9]
[8][5][2][4][6][3][7][9]
[-1][5][6][7]
[6][7][8][9]
[-1][5][6][7]
[6][7][8][9]

 * */
