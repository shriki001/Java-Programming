package less5;

public class less10 {
	public static void Printarray(int arr[]){
	
		for (int i=0;i<arr.length;i=i+1)
			System.out.print(arr[i]+",");
		
		System.out.println();
	}
	public static void reverse(int arr[]){
	
		int l=arr.length;
		for(int i=0;i<l/2;i=i+1)
			swap(arr,i,l-i-1);
		}
	public static void swap(int arr[],int i ,int j){
		
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
		}
	public static void main(String[] args) {
			int arr[]={1,2,3,4,5,6,7,8};
			Printarray(arr);
			reverse(arr);
			Printarray(arr);
			
			

		}
}
