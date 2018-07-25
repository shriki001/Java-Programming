package less5;

public class less1 {
	public static int Num(int a) {
		int i=0;
		for(i=1;i<a;i++)
			a=a/10;
	return i;
}
	public static void main(String[] args) {
	
		int a=Num(111111);
		System.out.println(a);
	}

}
