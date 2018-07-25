package Class1;

public class class3 {

	public static void main(String[] args) {
		
		for(int i=2;i<=1000;i++){
			boolean p=true;
		
		for(int j=2;j<i;j++){
			if(i%j==0)
				p=false;
		}
		if(p)
	System.out.println(i);
	
		}

}}
