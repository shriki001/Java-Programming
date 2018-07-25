package Class2;

import java.util.Arrays;

public class class2 {// מינימום של איבר

	public static void main(String[] args) {
		int []a=new int [10];
			for (int i=0;i<a.length;i++)
				a[i]=(int)(10*Math.random());
		int min=a[0];
		for(int i=0;i<a.length;i++)
			if(a[i]<min)
				min=a[i];
				System.out.println(Arrays.toString(a));
				System.out.println(min);
	}

}