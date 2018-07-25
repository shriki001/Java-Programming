package less2;
import java.util.Scanner;

public class less2 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        System.out.print("enter number: ");
        int x = console.nextInt();
        if(x%2==0)
        System.out.println("EVEN");
        else
        	System.out.println("ODD");
        
        console.close();
	}

}
