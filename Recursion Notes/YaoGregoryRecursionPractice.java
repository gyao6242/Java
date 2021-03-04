
public class YaoGregoryRecursionPractice {
	public static void main (String[] args) {
		System.out.println(removeIt("it is a witchy little twit"));
		int[][] m = {{17},{},{},{1,2,3,4,5,6,7,8,9,10},{20,30,40,50,60,70},
				{11,13,15,17,19,21}, {10,10,10,10,10,10,20,20,20,20,20}};
		for(int[]n : m) {
		System.out.println(valueCount(n,17,0));
		}
	}

	public static String removeIt(String str) {
		if(str.length() < 2) return str;
		if(str.substring(0, 2).equals("it")) return removeIt(str.substring(2));
		return str.charAt(0) + removeIt(str.substring(1));
	}
	
	public static int valueCount(int[] list, int value, int index) {
		if(index >= list.length) return 0;
		if(list[index] == value) return 1 + valueCount(list, value, index + 1);
		return valueCount(list, value, index + 1);
	}

}
