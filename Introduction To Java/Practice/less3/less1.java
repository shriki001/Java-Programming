package less3;

public class less1 {

	public static void main(String[] args) {
		int num=MyConsole.readInt("enter number: ");
        int x=0;
		while(num>0){
			num=num/10;
		x++;
		}
        
        System.out.println(x);
	}

}
