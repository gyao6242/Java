
public class BubbleSort {

	public static void bubbleSort(int[] a) {
		boolean sorted = false;
		int temp;
		System.out.println("Unsorted array:");
		printArray(a);
		while(!sorted) {
			sorted = true;
			for(int i = 0; i < a.length - 1; i++) {
				if(a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					sorted = false;
				}
			}
		}
		System.out.println("\nSorted array:");
		printArray(a);
	}
	
	public static void printArray(int [] a){
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i] + " ");
    }
	
	public static void main(String[] args) {
		int[] a = {9,2,6,8,1,3,7,4,5,0};
		bubbleSort(a);
	}
}
