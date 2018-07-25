package Class1;

public class class4 {

	public static void main(String[] args) {
		
		int x=MyConsole.readInt("enter your number: ");
		int y=0;
		while(x>0){
			y=y*10;
			y+=x%10;
			x=x/10;}

		
	System.out.println(y);

	}}
