package Class5;

public class class2 {

	public static void main(String[] args) {
		char[] test = {'D','E','A','G','C','B','F',};
		System.out.println(test);
		long start_time = System.currentTimeMillis();		
		selection_sort(test);
		long end_time = System.currentTimeMillis();		

		System.out.println("selection sort: " + (end_time - start_time));
	}

	public static void selection_sort(char[] a) {
		for(int i=0; i<a.length-1; i++) {
			int j = min(a,i);
			swap(a,i,j);
			System.out.println(a);
		}
	}
	
	public static int min(char[] a, int start) {
		int p = start;
		for(int i=start; i<a.length; i++) {
			if(a[i] < a[p])
				p=i;
		}
		return p;
	}
	
	public static void swap(char[] a, int i, int j) {
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
