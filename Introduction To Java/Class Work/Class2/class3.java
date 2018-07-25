package Class2;

import java.util.Arrays;
public class class3 {
	// חציון 

	public static void main(String[] args) {
		int []a=new int [10];
		for (int i=0;i<a.length;i++)
			a[i]=(int)(10*Math.random());
			System.out.println(Arrays.toString(a));
			int count=0;
		for(int i=0;i<a.length;i++)
			if(a[i]>=0)
				count++;
				System.out.println(count);
		
		
		
	}

}