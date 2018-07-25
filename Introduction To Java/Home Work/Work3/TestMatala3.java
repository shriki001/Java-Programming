package Work3;
import java.util.Arrays;
public class TestMatala3 {

	public static int[] PHI(int from, int to){
		int[] arr = new int[to - from];
		for (int i = from, j = 0; i < to; i++, j++) {
			arr[j] = TestPHI.phi(i);
		}
		return arr;
	}

	public static void checkFi(){
		long start = System.currentTimeMillis();
		int []ans1 = PHI(1, 12);
		int []ans2 = PHI(999990, 1000004);
		long end = System.currentTimeMillis();
		double diff = (end - start)/1000.0;
		System.out.println("Euler's totient function: \ntime = "+diff+" seconds");
		System.out.println("Some values of Function phi(i) (i=1,...,11): ");
		for (int i = 0; i < ans1.length; i++) {
			System.out.print(ans1[i] + ", ");
		}
		System.out.println();
		System.out.println("Some values of Function phi(i) (i=999990,...,1000003): ");
		for (int i = 0; i < ans2.length; i++) {
			System.out.print(ans2[i] + ", ");
		}
		System.out.println();
	}

	public static void checkPrimeDividers(){
long n1=33333331, n2 = 33333333, n3 = Integer.MAX_VALUE-4, 
     n4 = 26111*26111, n5 = 300690390;
		long start = System.currentTimeMillis();
		long ans1[] = TestPrimeDividers.primeDividers(n1);
		long ans2[] = TestPrimeDividers.primeDividers(n2);
		long ans3[] = TestPrimeDividers.primeDividers(n3);
		long ans4[] = TestPrimeDividers.primeDividers(n4);
		long ans5[] = TestPrimeDividers.primeDividers(n5);
		long end = System.currentTimeMillis();
		double diff = (end - start)/1000.0;
		System.out.println("Prime Dividers: \ntime = "+diff+" seconds");
		String s = ans1.length==0 ? n1+"  is prime " : "";
		System.out.println(s + ", Prime Dividers of " + n1 + ": " + Arrays.toString(ans1));
		System.out.println("Prime Dividers of " + n2 + ": " + Arrays.toString(ans2));
		System.out.println("Prime Dividers of " + n3 + ": " + Arrays.toString(ans3));
		System.out.println("Prime Dividers of " + n4 + ": " + Arrays.toString(ans4));
		System.out.println("Prime Dividers of " + n5 + ": " + Arrays.toString(ans5));
		
	}
	public static void checkBinaryTest(){
		System.out.println("Binary Test:");
		long start = System.currentTimeMillis();
		System.out.println("isBinaryString()? " + BinaryTest.isBinaryString(""));
		System.out.println("isBinaryString(1011)? " + BinaryTest.isBinaryString("1011"));
		System.out.println("isBinaryString(120)? " + BinaryTest.isBinaryString("120"));
		System.out.println("Binary2Int(Int2Binary(100)) = " +
                                 BinaryTest.Binary2Int(BinaryTest.Int2Binary(100)));  
		System.out.println("Int2Binary(Binary2Int(1100100))" + 
                                 BinaryTest.Int2Binary(BinaryTest.Binary2Int("1100100")));
		System.out.println("Binary2Int(1101) = " + BinaryTest.Binary2Int("1101"));
		System.out.println("Binary2Int(1110) = " + BinaryTest.Int2Binary(1001));
		long end = System.currentTimeMillis();
		double diff = (end - start)/1000.0;
		System.out.println("Bynary Test: time = "+diff+" seconds");
	}
	public static void main(String[] args) {
		checkFi();
		System.out.println();
		checkPrimeDividers();
		System.out.println();
		checkBinaryTest();
	}
}
