
public class SelectionSort {
/*
 * nested loops i & j
 * -set min to i 
 * -if j < i, set min to j
 * 
 * standard swap
 */
	public static void selectionSort (int [] nums) {
		System.out.println("Unsorted array:");
		printArray(nums);
		for (int i = 0; i < nums.length - 1; i++){
			int min = i;
	            for (int j = i + 1; j < nums.length; j++)
	            	if (nums[j] < nums[min]) min = j;
	 
	            int temp = nums[min];
	            nums[min] = nums[i];
	            nums[i] = temp;
	        }
		System.out.println("\nSorted array:");
		printArray(nums);
	    }

	public static void printArray(int [] a){
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i] + " ");
    }
	public static void main(String args[]){

        int [][] a = {{64,25,12,22,11},{2,1},{2,5,4,6,7,9,2,5,0,9,2,4}};
        for(int[] b : a) {
        selectionSort(b);
        System.out.println("\n");
        }
    }
}
