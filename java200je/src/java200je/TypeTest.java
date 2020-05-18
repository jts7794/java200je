package java200je;

public class TypeTest {

	public static void main(String[] args) {
		
		byte ba = 10;
		byte bb = 20;
		byte bc = 10+20;
		//byte bd = ba + bb; 			//타입 캐스팅 에러
		byte be = (byte)(ba+bb);		//(byte)(int+int)
		System.out.println("01 :" +bc);
		System.out.println("02 :" +be);
		
		short sa = 30;
		short sb = 50;
		short sc = 30+50;
		//short sd = sa + sb;			//타입 캐스팅 에러
		short se = (short)(sa+sb);		//(short)(int+int)
		System.out.println("03 : "+sc);
		System.out.println("04 : "+se);
		
		int ia = 20;
		int ib = 30;
		int ic = 20+30;
		int id = ic+sa;					//sa는 변수이므로 int가 된다.
		System.out.println("05 :"+ic);
		
		long la = 40l;
		long lb = 50L;
		long lba =50+Integer.MAX_VALUE; //(int+int) -> 음수가 된다.
		long lbb =50L+Integer.MAX_VALUE;//(long+int)-> 양수가 된다.
		long lc = la+lb;				//int를 기준
		System.out.println("06 :" + lba);
		System.out.println("07 :" + lbb);
		System.out.println("08 :" + lc);
		
		float fa = 45.0f;
		float fb = 46.67F;
		//float fc = 30.4;				//F가 없으면 long타입이 된다.
		float fd = 30;					//int는 자동으로 float이 된다.
		float fe = fa + fb;
		
		double da = 12;
		double db = 45+Float.MAX_VALUE;
		double dc = da+db;
		System.out.println("09 :" + dc);

		System.out.println("10 : "+"byte범위:"+Byte.MIN_VALUE+" ~ "+Byte.MAX_VALUE);
		System.out.println("11 : "+"short범위:"+Short.MIN_VALUE+" ~ "+Short.MAX_VALUE);
		System.out.println("12 : "+"int범위:"+Integer.MIN_VALUE+" ~ "+Integer.MAX_VALUE);
		System.out.println("13 : "+"long범위:"+Long.MIN_VALUE+" ~ "+Long.MAX_VALUE);
		System.out.println("14 : "+"float범위:"+Float.MIN_VALUE+" ~ "+Float.MAX_VALUE);
		System.out.println("15 : "+"double범위:"+Double.MIN_VALUE+" ~ "+Double.MAX_VALUE);
	}

}

/*
01 :30
02 :30
03 : 80
04 : 80
05 :50
06 :-2147483599
07 :2147483697
08 :90
09 :3.4028234663852886E38
10 : byte범위:-128 ~ 127
11 : short범위:-32768 ~ 32767
12 : int범위:-2147483648 ~ 2147483647
13 : long범위:-9223372036854775808 ~ 9223372036854775807
14 : float범위:1.4E-45 ~ 3.4028235E38
15 : double범위:4.9E-324 ~ 1.7976931348623157E308
 */