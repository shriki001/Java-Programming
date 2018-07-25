package less2;
import java.util.Scanner;

public class less6 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        System.out.print("enter number: ");
        int num1 = console.nextInt();
        System.out.print("enter number: ");
        int num2 = console.nextInt();
        System.out.print("enter number: ");
        int num3 = console.nextInt();
        
        if(num1<num2&&num1<num3&&num2<num3)
        	System.out.println(num1+","+num2+","+num3);
        
        else if(num2<num1&&num2<num3&&num1<num3)
        	System.out.println(num2+","+num1+","+num3);
      
        else if(num1<num2&&num1<num3&&num3<num2)
        	System.out.println(num1+","+num3+","+num2);
        
        else if(num2<num3&&num2<num1&&num3<num1)
        	System.out.println(num2+","+num3+","+num1);
        
        else if(num3<num2&&num3<num1&&num2<num1)
        	System.out.println(num3+","+num2+","+num1);
        
        else if(num3<num1&&num3<num2&&num1<num2)
        	System.out.println(num3+","+num1+","+num2);
        console.close();
	}

}
