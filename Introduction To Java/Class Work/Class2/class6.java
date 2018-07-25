package Class2;

import java.util.Arrays;

public class class6 {
	
	public static void main(String[] args) {
		int []a= new int [10];
		a[0]=1;
		a[1]=1;
		for (int i=2;i<a.length;i++){
			a[i]=a[i-2]+a[i-1];
			
		
		}
			System.out.println(Arrays.toString(a));
		
		
	}

}