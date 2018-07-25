package less5;

public class less5 {
	public static boolean checkprime(int num){
		boolean p=true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				p=false;
		}}
		return p;
	}


	public static void main(String[] args) {
		boolean a=checkprime(7);
		System.out.println(a);
	}

}
