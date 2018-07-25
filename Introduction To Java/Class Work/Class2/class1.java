package Class2;

import java.util.Arrays;
import java.util.Scanner;
public class class1 {
	// ניחושים
		
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		int []a=new int [10];
		for (int i=0;i<a.length;i++)
			a[i]=(int)(10*Math.random());
		System.out.println("enter your guess:");
		int x = console.nextInt();
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
			if(x==a[i])
				System.out.println(x);
		
		console.close();
		
	}

}