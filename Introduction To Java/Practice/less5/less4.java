package less5;

public class less4 {
	public static int sum(int x) {
		int sum=0;
		while(x>0){
			sum=x+sum;
				x--;}
		return sum;
	}


	public static void main(String[] args) {
		int a=sum(6);
		System.out.println(a);
	}

}
