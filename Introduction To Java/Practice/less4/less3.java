package less4;

import java.util.Arrays;

public class less3 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		for (int i=0;i<a.length;i++)
		a[i]=(int)(10*Math.random());
		System.out.println(Arrays.toString(a));
	//	boolean p=false;
		for(int i=0; i<a.length; i++) 
		if (a[i]==a[a.length]&&a[i+1]==a[a.length-1]&&a[i+2]==a[a.length-2]&&a[i+3]==a[a.length-3]&&a[i+4]==a[a.length-4])
			//{p=true;
			System.out.println("array is simmetry");
			//if(p=false)
				System.out.println("array is not simmetry");
			}
	
		
		
		
		
		
		
		
		}
		


	//}


