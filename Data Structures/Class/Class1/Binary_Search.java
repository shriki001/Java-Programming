package Class1;

public class Binary_Search {
	
	public static int binarySearchRecursive(int a[], int b){
		if (b<a[0] || b>a[a.length-1]){
			return -1;
		}
		return binary_search_recurs(a, 0, a.length-1,b);
	}
	public static int binary_search_recurs(int a[],int low,int high,int b){
		if (low <= high){
			int mid = (low+high)/2;
			if (b==a[mid])   return mid;
			
			else if (b<a[mid]) return binary_search_recurs(a, low, mid-1,b);
			
			else return binary_search_recurs(a, mid+1, high,b);
		}
		
		
		else return -1;
		
	}
 

	public static int binarySearchInducion(int []a,int b){
		if (b<a[0] || b>a[a.length-1]){
			return -1;
		}
		int low = 0, high = a.length-1;
		while (low <=high){
			int middle = (low + high)/2;
			if (a[middle] == b)
				return middle;
			
		
			if (b < a[middle])
				high = middle-1;
			
			
			else
				low = middle+1;
			
		}
		return -1;
	}


	public static int binarySearchBetween(int []a, int b){

		int low = 0, end = a.length - 1, high = end;
		if (b<a[0]) return 0;
		if (b>a[end])  return end+1;
		while (low <=high){
			int middle = (low + high)/2;
			if (low == high) {
				return low;
			}
			else {
				if (a[middle] == b)
					return middle;
				
				if (b < a[middle])
					high = middle;
				
				else
					low = middle+1;
				
			}
		}
		return -1;
	}
	public static void main(String []s){
	int []a={4,5,2,1,4,8,7,1,3,2,4,1,1111,25,4,5,4,8,7,64,6,468,7468,468,4};
	int b=64;
	System.out.println(binarySearchBetween(a,b));
	System.out.println(binarySearchInducion(a,b));
	System.out.println(binarySearchRecursive(a,b));
	
}

}
