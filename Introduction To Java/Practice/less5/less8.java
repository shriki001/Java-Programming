package less5;

public class less8 {
	public static int gcd(int x, int y) {
		int gcd=1;
		for(int i=1;i<=Math.min(x,y);i++){
			if(x%i==0 && y%i==0)
				gcd=i;
		}	
		
		return gcd;
	}

	public static void main(String[] args) {
		int a = gcd(4852, 222);
		System.out.println(a);
	}

}
