package Work3;

//import java.util.Arrays;

public class TestPrimeDividers {
	
	public static long[] primeDividers(long n) {
		long count = 0;
		long a[] = new long[(int) Math.sqrt(n)+1];
		for (int i = 2; i <= Math.sqrt(n); i++) {
			boolean p = true;
			if(n%i==0){
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					p = false;
			}
			if (p) {
					a[i] = 1;
					count++;
				}
			}
		}
		long b[] = new long[(int) count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				b[j] = i;
				j++;
			}
		}
		return b;
	}

	
//	  public static void main(String[] args) { 
//	  long[] prime = primeDividers(33333331); 
//	  System.out.println(Arrays.toString(prime));
//	  
//	  }
	 
}

