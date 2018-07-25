package less3;
import java.util.Scanner;
public class less6 {

	public static void main(String[] args) {
	Scanner console=new Scanner (System.in);
	System.out.println("enter number: ");
	int x = console.nextInt();
	int i=0,j=0;
	
		for(i=0;i<x;i++)
		{
			for(j=0;j<x;j++){
				if(i==0||i==x-1||j==0||j==x-1)
					System.out.print("*");
				else
					System.out.print(" ");}
			
			
			System.out.println(" ");
		}	
				
		
		
	
	console.close();

	}
}


