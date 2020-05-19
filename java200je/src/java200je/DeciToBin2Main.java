package java200je;

import static java.lang.Integer.*;
import static java.lang.Double.*;

public class DeciToBin2Main {

	public static void main(String[] args) {
		
		int a = 123;
		String lineNum = "       01234567890123456789012345678901";
		System.out.printf("        %s%n",lineNum);
		System.out.printf("123 toBinary : %s%n",toBinaryString(a));
		for(int i=0; i<33; i++) {
			System.out.printf("%2d:right rotate : %s%n",i,toBinaryString(rotateRight(a,i)));
		}
		for(int i=0; i<33; i++) {
			System.out.printf("%2d:reft rotate :  %s%n",i,toBinaryString(rotateLeft(a,i)));
		}
	}

/*콘솔 확인
               01234567890123456789012345678901
123 toBinary : 1111011
 0:right rotate : 1111011
 1:right rotate : 10000000000000000000000000111101
 2:right rotate : 11000000000000000000000000011110
 3:right rotate : 1100000000000000000000000001111
 4:right rotate : 10110000000000000000000000000111
 5:right rotate : 11011000000000000000000000000011
 6:right rotate : 11101100000000000000000000000001
 7:right rotate : 11110110000000000000000000000000
 8:right rotate : 1111011000000000000000000000000
 9:right rotate : 111101100000000000000000000000
10:right rotate : 11110110000000000000000000000
11:right rotate : 1111011000000000000000000000
12:right rotate : 111101100000000000000000000
13:right rotate : 11110110000000000000000000
14:right rotate : 1111011000000000000000000
15:right rotate : 111101100000000000000000
16:right rotate : 11110110000000000000000
17:right rotate : 1111011000000000000000
18:right rotate : 111101100000000000000
19:right rotate : 11110110000000000000
20:right rotate : 1111011000000000000
21:right rotate : 111101100000000000
22:right rotate : 11110110000000000
23:right rotate : 1111011000000000
24:right rotate : 111101100000000
25:right rotate : 11110110000000
26:right rotate : 1111011000000
27:right rotate : 111101100000
28:right rotate : 11110110000
29:right rotate : 1111011000
30:right rotate : 111101100
31:right rotate : 11110110
32:right rotate : 1111011
 0:reft rotate :  1111011
 1:reft rotate :  11110110
 2:reft rotate :  111101100
 3:reft rotate :  1111011000
 4:reft rotate :  11110110000
 5:reft rotate :  111101100000
 6:reft rotate :  1111011000000
 7:reft rotate :  11110110000000
 8:reft rotate :  111101100000000
 9:reft rotate :  1111011000000000
10:reft rotate :  11110110000000000
11:reft rotate :  111101100000000000
12:reft rotate :  1111011000000000000
13:reft rotate :  11110110000000000000
14:reft rotate :  111101100000000000000
15:reft rotate :  1111011000000000000000
16:reft rotate :  11110110000000000000000
17:reft rotate :  111101100000000000000000
18:reft rotate :  1111011000000000000000000
19:reft rotate :  11110110000000000000000000
20:reft rotate :  111101100000000000000000000
21:reft rotate :  1111011000000000000000000000
22:reft rotate :  11110110000000000000000000000
23:reft rotate :  111101100000000000000000000000
24:reft rotate :  1111011000000000000000000000000
25:reft rotate :  11110110000000000000000000000000
26:reft rotate :  11101100000000000000000000000001
27:reft rotate :  11011000000000000000000000000011
28:reft rotate :  10110000000000000000000000000111
29:reft rotate :  1100000000000000000000000001111
30:reft rotate :  11000000000000000000000000011110
31:reft rotate :  10000000000000000000000000111101
32:reft rotate :  1111011

 */
}
