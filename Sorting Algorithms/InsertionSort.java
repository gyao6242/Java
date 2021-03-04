
public class InsertionSort {
	public static void insertionSort (int [] nums) {
		System.out.println("Unsorted array:");
		printArray(nums);
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			int j = i - 1;
			for(;j >= 0 && nums[j] > temp; j--) {
				nums[j + 1] = nums[j];
			}
            nums[j + 1] = temp;
		}
		System.out.println("\nSorted array:");
		printArray(nums);
	}
	
	public static void printArray(int[] a) {
		for(int value: a) 
			System.out.print(value + " ");
	}
    public static void main(String[] args){
        int[] a = {-721, 190, 5, 134, 336, 310};
        int[] b = {-1,2,3,4,5,6,7,8,9,10};
        insertionSort(a);
        System.out.println("\n");
        insertionSort(b);
        }
}

