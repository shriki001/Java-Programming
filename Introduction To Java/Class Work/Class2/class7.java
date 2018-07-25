package Class2;

import java.util.Arrays;

import Class1.MyConsole;

public class class7 {
	
	public static void main(String[] args) {
		
		int x=MyConsole.readInt("tou wont to play? enter 1 for yes or 2 for no ");
		if(x==1){
		int count=0;
		int []a= new int [6];
		for (int i=0;i<a.length;i++){
			a[i]=(int)(6*Math.random());
		if(a[i]==0)
			System.out.println("no");
		count++;
		}
			System.out.println(count);
			
		
		
			System.out.println(Arrays.toString(a));
		
		}
	}

}