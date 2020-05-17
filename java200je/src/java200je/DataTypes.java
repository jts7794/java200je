package java200je;

public class DataTypes {


	public static void main(String[] args) {
		// 기본 타입
		int primitiveInt = 19;
		double primitiveLong = 3.1453;
		
		// 참조 타입
		String refStr = "안녕하세요";
		Object refObj = new Object();
		
		// 랩퍼 클래스(참고)
		Integer wrapInt = new Integer(19);
		Double wrapDouble = new Double(3.1453);
		/*
		 * 랩퍼 클래스란 기본 타입의 데이터를 포장하여 참조 타입으로 변화시킨 클래스로,
		 * 데이터를 보호하면서 관련 정보도 전달한다.
		 * 
		 * 기본 타입	랩퍼 클래스	기본 타입	랩퍼 클래스
		 * byte		Byte		short	Short
		 * char		Character	int		Integer
		 * long		Long		float	Float
		 * double	Double		boolean	Boolean
		 * */
		
		// 배열(참고)
		int[]a= {1,2,3};
		
		System.out.println("1:"+primitiveInt);
		System.out.println("2:"+primitiveLong);
		System.out.println("3:"+refStr);
		System.out.println("4:"+refStr.indexOf('녕'));
		System.out.println("5:"+refStr.hashCode());
		System.out.println("6:"+refObj);
		System.out.println("7:"+refObj.getClass());
		System.out.println("8:"+refObj.hashCode());
		System.out.println("9:"+wrapInt);
		System.out.println("10:"+wrapInt.intValue());
		System.out.println("11:"+wrapDouble);
		System.out.println("12:"+wrapDouble.doubleValue());
		System.out.println("13:"+a);
		System.out.println("14:"+a.length);
		System.out.println("15:"+a[1]);		

	}
	
}

/* 콘솔 결과
1:19
2:3.1453
3:안녕하세요
4:1
5:803356551
6:java.lang.Object@7852e922
7:class java.lang.Object
8:2018699554
9:19
10:19
11:3.1453
12:3.1453
13:[I@4e25154f
14:3
15:2
 * */
