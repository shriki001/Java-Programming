package Class1;

public class class1 {///gcd מחלק משותף מקסימאלי

	public static void main(String[] args) {
		
		int x=MyConsole.readInt("enter x:");
		int y=MyConsole.readInt("enter y:");
		int gcd=1;
		for(int i=1;i<=Math.min(x,y);i++){
			if(x%i==0 && y%i==0)
				gcd=i;
		}	
			
			System.out.println(gcd);
				
			
		
	
	
	
	}

}


