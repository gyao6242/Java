
public class YaoGregoryRecursionPractice2 {
	
	public static void main(String[] args) {
		int[] a = {2,3,5,6};
		System.out.println("Group Product");
		System.out.println(groupProduct(a,60));
		System.out.println(groupProduct(a,45));
		System.out.println();
		
		System.out.println("String Count");
		System.out.println(strCount("lalapalooza", "al"));
		System.out.println(strCount("javaclass", "pal"));
		System.out.println();
		
		int[] b = {1,2,3,4,5,6,7,8,9};
		int[] c = {3,4,5,6,7,9};
		System.out.println("Split 3");
		System.out.println(split3(b));
		System.out.println(split3(c));
		System.out.println();
	}
	
	public static boolean groupProduct(int [] list, int target) {
		return groupProduct(0, list, target);
	}
	public static boolean groupProduct(int start, int[] list, int target) {
		if(target == 1) return true; //added
		if(start >= list.length) return false; // changed from target == 0
		if(target % list[start] == 0) {
			//vocab word: backtracking
			if (groupProduct(start + 1, list, target / list[start])) return true;
			if (groupProduct(start + 1, list, target)) return true;
		}  
		return (groupProduct(start + 1, list, target)); // if the target / start isn't a whole #
	/**
	 * groupProduct(int[] list, int target, int product, int index){
	 * if(target == product) return true;
	 * if(index >= list.length) return false;
	 * return
	 * 		if (groupProduct(list, target, product * list[start], index + 1)) ||
			if (groupProduct(list, target, product, index + 1));
	 */
	}

	public static int strCount(String str, String sub) {
	    if(str.length() < sub.length()) return 0;
	    
	    if(str.substring(0, sub.length()).equals(sub))
	      return 1 + strCount(str.substring(sub.length()), sub);

	    return strCount(str.substring(1), sub);
	}
	
	public static boolean split3(int [] list) {
		  return split3Helper(list, 0, 0, 0, 0);
	}

	public static boolean split3Helper(int[] nums, int start, int group1, int group2, int group3) {
	  if(start >= nums.length)
		  return group1 == group2 && group2 == group3;  
	  return (split3Helper(nums, start + 1, group1 + nums[start], group2, group3)) ||
			 (split3Helper(nums, start + 1, group1, group2 + nums[start], group3)) ||
			 (split3Helper(nums, start + 1, group1, group2, group3 + nums[start]));
	}

}
