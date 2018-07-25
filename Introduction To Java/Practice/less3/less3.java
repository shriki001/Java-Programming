package less3;
import java.util.Scanner;
public class less3 {

	public static void main(String[] args) {
	Scanner console=new Scanner (System.in);
	System.out.println("enter number: ");
	int x = console.nextInt();
	int sum=0;
	while(x>0){
		sum=x+sum;
			x--;}
	System.out.println(sum);
	console.close();

	}

}
