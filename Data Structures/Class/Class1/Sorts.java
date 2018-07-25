package Class1;

import java.util.Arrays;

public class Sorts {
	
	//bucket sort
	public static void bucketsort(int[] a, int b) {
		int[] bucket = new int[b + 1];
		for (int i = 0; i < bucket.length; i++)
			bucket[i] = 0;
		for (int i = 0; i < a.length; i++)
			bucket[a[i]]++;

		int d = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				a[d++] = i;
			}
		}

	}
	
	
	

	 		//Selection Sort
	public static int arrayMinIndex(int from, int arr[]){

		int index=from;
		for (int i=from;i<arr.length; i++){
			if (arr[i] < arr[index])
				index = i;
		}
		return index;
	}

	public static void selectionSort(int[] arr){
		int i, smallestIndex;
		for (i=0; i<arr.length; i++){
			smallestIndex = arrayMinIndex(i, arr);
			swap(arr, i, smallestIndex);
		}
	}


	public static void swap(int [] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

			//Bubble Sort
	public static void bubbleSort(int[] arr){
		boolean flag = true;
		for (int i=0; flag && i <arr.length; i++){
			flag = false;
			for (int j=0; j < arr.length-1-i; j++){
				if(arr[j] > arr[j+1]){
					flag = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
                  }
            }
      } 
 

			//Insertion Sort
	public static void insertionSort(int[] arr){
		for (int i=1; i <arr.length; i++){
			int j = i;
			while (j>0 && arr[j]<arr[j-1]){
				if(arr[j-1] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				j = j-1;
			}			
		}		
	}

public static void main(String[] args) {
		int a[]=new int [10000];
		for (int i = 0; i < a.length; i++) 
			a[i]=(int)(10*Math.random());
		
		int max=10;
		
		// bubble sort

		System.out.println(Arrays.toString(a));
		long  timeBefore = System.currentTimeMillis();
		bubbleSort(a);
		long timeAfter = System.currentTimeMillis();
		System.out.println(Arrays.toString(a));
		System.out.println("bubbleSort time = " + (timeAfter-timeBefore));		
		
		//  selection sort

		timeBefore = System.currentTimeMillis();
		selectionSort(a);
		timeAfter = System.currentTimeMillis();
		System.out.println("selectionSort time = " + (timeAfter-timeBefore));
	
		// insertion sort

		timeBefore = System.currentTimeMillis();
		insertionSort(a);
		timeAfter = System.currentTimeMillis();;
		System.out.println("insertionSort time = " + (timeAfter-timeBefore));
		
		
		//bucket sort

		timeBefore = System.currentTimeMillis();
		bucketsort(a,max);
		timeAfter = System.currentTimeMillis();;
		System.out.println("bucketSort time = " + (timeAfter-timeBefore));		
				
		

}
}
