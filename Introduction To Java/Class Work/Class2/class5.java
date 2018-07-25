package Class2;

import java.util.Arrays;

public class class5 {
	
	public static void main(String[] args) {
		int []a=new int [10];
		for (int i=0;i<a.length;i++)
			a[i]=(int)(10*Math.random());
		boolean b=true;
		for (int i=0;i<a.length-1;i++)
			if (a[i]>a[i+1])
				b=false;
			System.out.println(Arrays.toString(a));
		System.out.println(b);
		}
	

}