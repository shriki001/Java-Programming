package less2;
import java.util.Scanner;

public class less5 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        System.out.print("enter age: ");
        int num1 = console.nextInt();
        if(num1<14)
        	System.out.println("you are child");
        else if(num1>=14&&num1<=20)
        	System.out.println("you are youth");
        
        else if(num1>20&&num1<=60)
        	System.out.println("you are young");
        else
        	System.out.println("you are old");
        
        console.close();
	}

}
