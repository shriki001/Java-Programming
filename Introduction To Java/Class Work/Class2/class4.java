package Class2;

import java.util.Arrays;

public class class4 {
	
	public static void main(String[] args) {
		int []a=new int [10];
		int p=0;
		for (int i=2;p<a.length;i++)
		{
			boolean prime=true;
			for (int j=0;j<p&& prime;j++)
				if(i%a[j]==0)
					prime=false;
			if (prime)
			{
				a[p]=i;
				p++;
			}	
		}
		System.out.println(Arrays.toString(a));
	
		
	}

}