import java.util.Random;

public class QuickSort {
	/* This function takes last element as pivot, 
	   places the pivot element at its correct 
	   position in sorted array, and places all 
	   smaller (smaller than pivot) to left of 
	   pivot and all greater elements to right 
	   of pivot */
	static int tally = 0;
	static int tally2 = 0;
	
	//First element pivot
	 public static int partition(int[] arr,int start,int end){

		 int pivot = arr[start],p1 = start + 1;

		 for(int i = start + 1; i <= end; i++){

			 if(arr[i] < pivot){
				 if(i != p1){  
					 int temp = arr[p1];
					 arr[p1] = arr[i];
					 arr[i] = temp;
				 }    
			 p1++;
			 }
		 }

	     arr[start] = arr[p1 - 1];
	     arr[p1 - 1] = pivot;

	 return p1 - 1;
	 }
	   
	public static void sort(int arr[], int start, int end) { 
		if (start < end) {
			/* pi is partitioning index, arr[pi] is now at right place */
			int pi = partition(arr, start, end); 
	  
			// Recursively sort elements before 
	        // partition and after partition 
			sort(arr, start, pi-1);
			tally++;
			sort(arr, pi+1, end); 
			tally++;
		} 
	}
	public static int medianPart(int[] arr,int start,int end) {
		int p1 = start + 1;
		int pivot = 0, temp = 0;

		if(pivot == arr[end / 2]) {
			temp = arr[start];
			arr[start] = arr[end / 2];
			arr[end / 2] = temp;
		}
		else if(pivot == arr[end]) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		
		pivot = arr[start];
		for(int i = start + 1; i <= end; i++){

			 if(arr[i] < pivot){
				 if(i != p1){  
					 temp = arr[p1];
					 arr[p1] = arr[i];
					 arr[i] = temp;
				 }    
			 p1++;
			 }
		 }
	     arr[start] = arr[p1 - 1];
	     arr[p1 - 1] = pivot;
		return p1 - 1;
		
	
		
	}
	public static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int medPi = medianPart(arr, low, high);
			quickSort(arr, low, medPi - 1);
	    	tally2++;
	    	quickSort(arr, medPi + 1, high);
	    	tally2++;
		}
	}
	  
	    /* A utility function to print array of size n */
	public static void printArray(int arr[]){ 
	    int n = arr.length; 
	    for (int i=0; i<n; ++i) 
	        System.out.print(arr[i]+" "); 
	        System.out.println(); 
	} 
	  
	    // Driver program 
	public static void main(String args[]){ 
		Random rd = new Random(); // creating Random object
		int low = 1;
		int high = 100;

	    int[] arr = new int[20];
	    int[] bArr = new int[20];
	    for (int i = 0; i < arr.length; i++) {
	    	arr[i] = rd.nextInt(high - low) + low;
	    	bArr[i] = rd.nextInt(high - low) + low;
	    }
	    
	   int n = arr.length; 
	        
	        System.out.println("First element pivot:\nUnsorted Array:");
	        printArray(arr);
	        sort(arr, 0, n-1); 
	  
	        System.out.println("\nSorted Array:"); 
	        printArray(arr); 
	        System.out.println( tally + " total recursive calls\n");
	        
	        System.out.println("Median pivot:\nUnsorted Array:");
	        printArray(bArr);
	        quickSort(bArr, 0, n - 1); 
	        System.out.println("\nSorted Array (Median pivot):"); 
	        printArray(bArr); 
	        System.out.println( tally2 + " total recursive calls");
	}
}
