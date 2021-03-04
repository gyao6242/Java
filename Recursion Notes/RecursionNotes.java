import java.util.Arrays;

public class RecursionNotes {

	public static int sequence(int n) {
		if(n <= 1) return 8;
		return 3 + sequence(n - 1);
	}
	
	public static int factorial(int n) {
		if(n == 0) return 1;
		return n * factorial(n - 1);
	}
	
	public static int fibonacci(int n) {
		/**
		 *  inefficient to the max, simple solution: use loops instead of recursion form
		 *  	if(n <= 2) return 1;
		 *  	return fibonacci(n - 1) + fibonacci(n - 2);
		 */
		int a = 1, b = 1;
		
		for(int i = 3; i <= n; i++) {
			int temp = a + b;
			a = b;
			b = temp;
		}
		return b;
	}
	
	/**
	 * Make a method that reverses a string
	 */
	public static String reverse(String str){
//		String rev = "";
//		
//		for(int i = str.length() - 1; i >= 0; i--) {
//			rev += str.charAt(i);
//		}
//		return rev;
		
		
		/**
		 * Know about subStrings 
		 * - one starts at the given index 
		 * - another starts at the beginning index and end before the last index
		 */
//		return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1);
		if (str.length() < 2) return str;
		return reverse(str.substring(1)) + str.charAt(0);
	}
	
	/**
	 * Method returns a count of the number of 1-digit integers in the array
	 */
	public static int tallyDigit(int[] list, int index) {
		if(index >= list.length) return 0;
		if(list[index] / 10 == 0) return 1 + tallyDigit(list, index + 1);
		return tallyDigit(list, index +1);
	}
	
	public static void main(String[] args) {
//		for(int i = 1; i < 11; i++) {
//			System.out.println(sequence(i));
//		}
//		System.out.println();
//		for(int i = 1; i < 11; i++) {
//			System.out.println(factorial(i));
//		}
//		System.out.println();
//		for(int i = 1; i <= 45; i++) {
//			System.out.println("Term " + i +": " + fibonacci(i));
//		}
//		System.out.println();
//		System.out.println(reverse("Hello"));
//		System.out.println();
//		
//		int[] a = {1,3,11,7,2};
//		System.out.println(tallyDigit(a,0));
//		
//		System.out.println();
//		int[][] m = {{17},{},{},{1,2,3,4,5,6,7,8,9,10},{20,30,40,50,60,70},
//				{11,13,15,17,19,21}, {10,10,10,10,10,10,20,20,20,20,20}};
//		for(int[]n : m) {
//			System.out.println(Arrays.toString(n) + " has 17? " + contains(n,17,0));
//		}
//		System.out.println();
//		for(int[]n : m) {
//			System.out.println(Arrays.toString(n) + " has 17? " + containsSorted(n,17,0,n.length));
//		}
		System.out.println();
		int[]a = {1, 5, 10, 25};
		System.out.println(changeCount(25,a));
	}
	/**
	 * Returns whether an unsorted array contains the target value
	 * Sequential search
	 */
	public static boolean contains(int[] list, int value, int index) {
		if(index >= list.length) return false;
		if(list[index] == value) return true;
		return contains(list,value, index + 1);
	}
	/**
	 * Returns whether a sorted array contains the target value
	 * Binary search
	 */
	public static boolean containsSorted(int[] list, int value, int startIndex, int endIndex) {
		int mid = (startIndex + endIndex)/ 2;
		
		if(startIndex == endIndex) return false;
		if( list[mid] == value) return true;
		if(list[mid] < value) return containsSorted(list, value, mid + 1, endIndex);
		
		return containsSorted(list, value, startIndex, mid);
	}
	/**
	 * runtime: O(n)
	 */
	public static int mystery(int[]a, int index) {
		int n = 0;
		for(int i = 0; i < a.length;) {
			int j = i;
			n = 0;
			while(j < a.length && a[j] == a[i]) {
				n++;
				j++;
			}
			i += n;
		}
		return n;
	}
	public static int changeCount(int amount, int[] coins) {
		return changeCount(amount, coins, 0);
	}
	/**
	 * Recursive backtracking/backtracking
	 */
	public static int changeCount(int amount, int[] coins, int index) {
		if (amount < 0) return 0;
		if (amount == 0) return 1;
		if (index == coins.length && amount > 0) return 0;
		return changeCount(amount - coins[index], coins, index)
				+ changeCount(amount, coins, index + 1);
	}
	
	public int binarySearch(int[] arr, int val, int first, int last) {
		int mid = (first + last) /2;
		
		if(val == arr[mid])
			return mid;
		if(first >= last)
			return -1;
		if(val > arr[mid])
			return binarySearch(arr, val, first, mid);
		return binarySearch(arr, val, mid + 1, last);
	}

}
