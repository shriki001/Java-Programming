package Class1;

public class class12 {

	public static void main(String[] args) {
		
		int x=MyConsole.readInt("enter your number: ");
		int y=MyConsole.readInt("enter your number: ");
		int a=MyConsole.readInt("enter operation: 1 foe +. 2 for -. 3 for *. 4 for % ");
		switch(a){
		case 1:
			System.out.println(x+y);
			break;
		case 2:
			System.out.println(x-y);
			break;
		case 3:
			System.out.println(x*y);
			break;
		case 4:
			System.out.println(x%y);
			break;
			default:
				System.out.println("not a number!!");
				break;
		}

	}}