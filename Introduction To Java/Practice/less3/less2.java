package less3;

public class less2 {

	public static void main(String[] args) {
		int n=MyConsole.readInt("enter n:");
		int sum=0;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
			
			
			
		}
System.out.println("sum= "+sum);

	}

}
