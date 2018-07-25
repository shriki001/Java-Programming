package less2;
import java.util.Scanner;

public class less7 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        System.out.print("enter number: ");
        double num1 = console.nextInt();
        System.out.print("enter operation 1 for +,2 for - ,3 for *,or 4 for / ");
        double op=console.nextInt();
        System.out.print("enter number: ");
        double num2 = console.nextInt();
        if(op>=1&&op<=4)
        {
        if(op==1)
        	System.out.println(num1+"+"+num2+"="+(num1+num2));
        else if (op==2)
              	System.out.println(num1+"-"+num2+"="+(num1-num2));
        else if(op==3)
        	System.out.println(num1+"*"+num2+"="+(num1*num2));
        else if(op==4&&num2!=0)
        	System.out.println(num1+"/"+num2+"="+(num1/num2));
        else
			System.out.println("wrong operation or division in null");
        }
        else
        	System.out.println("worng choice");
        console.close();
	}

}
