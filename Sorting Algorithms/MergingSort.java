
public class MergingSort {
	public static void mergeSort (int[] nums, int low, int high) {
		if(high <= low) return;
		
		int mid = (low + high) / 2;

		mergeSort(nums, low, mid);
		mergeSort(nums, mid + 1, high);
		merge(nums, low, mid, high);
	}
	public static void merge(int[] nums, int left, int mid, int right){
		//Calculate the lengths
		int lengthLeft = mid - left + 1;
		int lengthRight = right - mid;
		//Creating temp subarrays
		int[] leftArr = new int [lengthLeft];
		int[] rightArr = new int [lengthRight];
		for(int i = 0; i < lengthLeft; i++) {
			leftArr[i] = nums[left + i];
		}
		for(int i = 0; i < lengthRight; i++) {
			rightArr[i] = nums[mid + 1 + i];
		}
		//Create traversing indeces
		int leftIndex = 0;
		int rightIndex = 0;
		
	    // copying from leftArr and rightArr back into nums
	    for (int i = left; i < right + 1; i++) {
	        // if there are still uncopied elements in R and L, copy minimum of the two
	        if (leftIndex < lengthLeft && rightIndex < lengthRight) {
	            if (leftArr[leftIndex] < rightArr[rightIndex]) {
	                nums[i] = leftArr[leftIndex];
	                leftIndex++;
	            }
	            else {
	                nums[i] = rightArr[rightIndex];
	                rightIndex++;
	            }
	        }
	        // if all the elements have been copied from rightArray, copy the rest of leftArray
	        else if (leftIndex < lengthLeft) {
	            nums[i] = leftArr[leftIndex];
	            leftIndex++;
	        }
	        // if all the elements have been copied from leftArray, copy the rest of rightArray
	        else if (rightIndex < lengthRight) {
	            nums[i] = rightArr[rightIndex];
	            rightIndex++;
	        }
	    }
	}

}
