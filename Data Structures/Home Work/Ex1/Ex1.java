package Ex1;

import java.util.Arrays;


public class Ex1 {
	
//********************** 1) byte sort*************************************************************************** 
	
	public static void byteSort(byte[] a) {

		int min = a[0];
		int max = a[0];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
			else if (a[i] < min)
				min = a[i];
		}
		int[] newarr = new int[max - min + 1];
		for (int i = 0; i < a.length; i++) {
			newarr[a[i] - min]++;
		}
		for (int i = 0; i < newarr.length; i++) {
			for (int j = 0; j < newarr[i]; j++) {
				a[k++] = (byte) (i + min);
			}
		}
	}
	
//***************************** 2) kSort ***********************************************************************
	
		public static void kSort(int[] a, int k) {
			
			int[] arry = new int[k]; // array for every single digit from the main array
			int[] counter = new int[k]; // array for the counters
			int index = 0;
			int tar = 0;
		
			for (int i = 0; i < a.length; i++) {
				if (a[i] != Integer.MIN_VALUE) { // "Integer.MIN_VALUE" we have some base (dump) number 
					arry[index] = a[i];
					int t = a[i];
					tar = counter(a, t);
					a[i] = Integer.MIN_VALUE;
					counter[index] = tar;
					index++;
				}
			}
			
			quickSort(arry, counter);// sorting the 2 arrays together
			
			int i = 0, j = 0;
			for (i = 0; i < a.length;) { // read data from counter array 
				while (counter[j] > 0) {
					a[i++] = arry[j]; // write data to main array from arry no. times that counter array says 
					counter[j]--;
				}
				j++;
			}

		}

			// building the counter array

		public static int counter(int a[], int b) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == b) {
					a[i] = Integer.MIN_VALUE;
					count++;
				}
			}
			return count;
		}
		
			// sorting the arrays
		
		public static void quickSort(int a[], int b[]) {
			quickSort(a,b,0,a.length-1);
			}
		private static void quickSort(int a[], int b[], int low, int high) {
			if(low<high) {
				int pivot = partition(a,b, low, high);
				quickSort(a,b, low, pivot-1);
				quickSort(a,b, pivot+1, high);
				}
			}
		private static int partition(int[] a, int b[], int low, int high) {
			int pivot = low++;
			while (low<=high){
				if (a[low] <= a[pivot]) low++;
				else if (a[high] > a[pivot]) high--;
				else swap(a,b, low, high);
			}
			swap(a,b, high, pivot);
			return high;
		}		

		// swap for 2 arrays (arry & counter) together

		public static void swap(int f[], int g[], int i, int j) {
			
			int temp1 = f[i];
			f[i] = f[j];
			f[j] = temp1;
			int temp2 = g[i];
			g[i] = g[j];
			g[j] = temp2;
		}

//************* 3) boolean indexEqual *************************************************************************
		
		public static boolean indexEqual(int[] A) {

			int F = 0; // first index
			int L = A.length - 1; // last index 
			int M = (F + L) / 2; // middle index
			while (F <= L) {
				
				if (A[M]==M)
					return true;
				
				else if (A[M] < M) {
					F = M + 1;
					M = (F + L) / 2;
				}
				 else{
					L = M - 1;
				M = (F + L) / 2;
				 }
			}
			return false;
		}
		
//*************** void main ********************************************************************************
		
		public static void main(String[] args) {
			
			
//****************** (1) *************************************
			
			byte[] a = new byte[255];
			for (int i = 0; i < a.length; i++){
				a[i] = (byte) (255 * Math.random() - 127);
			}
			System.out.println("byte sort: ");
			System.out.println("Before: " + Arrays.toString(a));
			long start_time = System.currentTimeMillis();
			byteSort(a);
			long end_time = System.currentTimeMillis();
			System.out.println("After:  " + Arrays.toString(a));
			System.out.println("Time: " + (end_time - start_time));
			System.out.println(" ");
			
//***************** (2) ***************************************
			
			int[] b = { 8, -100, 25, 3, 5, 5, 8, -100 };
			System.out.println("kSort: ");
			System.out.println("Before: " + Arrays.toString(b));
			start_time = System.currentTimeMillis();
			kSort(b, 5);
			end_time = System.currentTimeMillis();
			System.out.println("After:  " + Arrays.toString(b));
			System.out.println("Time: " + (end_time - start_time));
			System.out.println(" ");
			
//***************** (3) ****************************************
			
			System.out.println("boolean indexEqual: ");
			int test1[] = { -5, 0, 5, 6 };
			int test2[] = { -2, 0, 1, 3 };
			int test3[] = { 0, 1, 2, 3, 4 };
			
			start_time = System.currentTimeMillis();
			System.out.println(indexEqual(test1));
			System.out.println(indexEqual(test2));
			System.out.println(indexEqual(test3));
			end_time = System.currentTimeMillis();
			System.out.println("Time: " + (end_time - start_time));
		}
	}
