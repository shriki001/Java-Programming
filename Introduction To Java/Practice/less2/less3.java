package less2;
import java.util.Scanner;

public class less3 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        System.out.print("enter number: ");
        int num1 = console.nextInt();
        System.out.print("enter number: ");
        int num2 = console.nextInt();
        System.out.print("enter number: ");
        int num3 = console.nextInt();
        if(num1<num2&&num2<num3)
        	System.out.println("true");
        else
        	System.out.println("false");
        
        console.close();
	}

}
