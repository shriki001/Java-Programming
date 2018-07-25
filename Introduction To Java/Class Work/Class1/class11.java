package Class1;

public class class11 {

	public static void main(String[] args) {
		
		int x=MyConsole.readInt("enter your number: ");
		 int  counter = 0;
	        for(int i = 0;i<x;i++){
	        	
	        	for (int c = x;c>i;c--){
	        	    System.out.print(" ");
	        	}
	        	
	        	for(int j=0;j<=i;j++){
	        		counter++;
	        		System.out.print(counter);
	        	}
	        	
	        	System.out.println();
	        }   
		}

	}