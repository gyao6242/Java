
public class GCD {
	public static void calculations(int[] a, int[] b){
		int sub;
		
		if(b[2] > a[2]) {
			sub = b[2] / a[2];
			for(int col = 0; col < a.length; col++) {
				b[col] -= sub * a[col];
			}
		}
		
		if(a[2] > b[2]) {
			sub = a[2] / b[2];
			for(int col = 0; col < a.length; col++) {
				a[col] -= sub * b[col];
			}
		}
	}

	public static void printMatrix(int [] a, int[] b) {
		for(int value: a) {
			System.out.print(value + " ");
		}
		System.out.println("\t");
		for(int value: b) {
			System.out.print(value + " ");
		}
		System.out.println("\t");
	}
	
	public static void main(String[] args) {
		int[] a = {1, 0, 28};
		int[] b = {0, 1, 15};
		
		System.out.println("Step 1: Default");
		printMatrix(a, b);
		System.out.println();
		calculations(a, b);
		System.out.println("Step 2: top - bottom");
		printMatrix(a, b);
		System.out.println();
		calculations(a, b);
		System.out.println("Step 3: bottom - top");
		printMatrix(a, b);
		System.out.println();
		System.out.println("Step 4: bottom - top");
		printMatrix(a, b);
		System.out.println();

	}
}
