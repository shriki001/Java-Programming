package less4;

import java.util.Arrays;


public class less2 {

	public static void main(String[] args) {
		int[] a = new int[5];
		for(int i=0; i<5; i++) 
			a[i]=(int)(10*Math.random());
		System.out.println(Arrays.toString(a));
		int min=a[0];
		for (int i=0;i<a.length;i++){
			
			if(a[i]<min)
				min=a[i];
		
		 }
	System.out.println("the minimum number is: "+min);
	 
	
	
	}
	}


