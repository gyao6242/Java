
public class BinarySearchTree {
	private TreeNode root;
	
	/*
	 * Binary Search Tree default constructor setting the root to a null value
	 */
	public BinarySearchTree() {
		root = null;
	}
	/*
	 * Add method that sets up a helper method by providing an integer from its parameters
	 */
	public void add(int addVal) {
		root = addHelper(root, addVal);
	}
	/*
	 * Private helper method which takes a tree node and int
	 * 	inserts it in the appropriate place in the tree
	 * 
	 * Returns a tree node
	 */
	private TreeNode addHelper(TreeNode t, int n) {
		if(t == null)
			t = new TreeNode(n);
		else {
		    if(n <= t.getValue())
		    	t.setLeft(addHelper(t.getLeft(), n));
		    if(n > t.getValue())
		    	t.setRight(addHelper(t.getRight(), n));
		}
	    return t;
	}
	/*
	 * A remove method that calls a helper method to do the removing
	 */
	public void remove(int removeVal) {
		root = removeHelper(root, removeVal);
	}
	/*
	 * A recursive helper method that receives a tree node and an integer value
	 * 	removes the tree node in the tree that has the same value as the one listed in the parameter
	 * 	if there is no nodes in the tree node, it returns the parameter node
	 */
	private TreeNode removeHelper(TreeNode t, int n) {
		if(t == null) {
			return t;
		}
		if(t != null) {
			TreeNode tLeft = t.getLeft();
			TreeNode tRight = t.getRight();
			int tVal = t.getValue();
			
			if (n == tVal){
	            if (tLeft == null)
	                return tRight;
	            else if (tRight == null)
	                return tLeft;
	            t.setValue(findMin(tRight));
	 
	            t.setRight(removeHelper(t.getRight(), t.getValue()));
			}
			if(n < tVal)
				t.setLeft(removeHelper(tLeft, n));
			else
				t.setRight(removeHelper(tRight, n));
        }
        return t;
    }
	/*
	 * A helper method that helps find the minimum child node
	 * 	receives a root node and returns the integer value of the smallest child node
	 */
    private int findMin(TreeNode t) {
    	TreeNode tLeft = t.getLeft();
    	int tLeftVal = t.getLeft().getValue();
        int min = t.getValue();
        
        while (tLeft != null) {
           min =tLeftVal;
           root = tLeft;
        }
        return min;
    }
	/*
	 * A boolean search method that receives a tree node and integer value to search for in the Binary Tree
	 * 
	 * 	returns true if searched value is in the tree
	 * 	returns false if the searched value is not existent in the tree
	 */
	public boolean searchNode(int searchVal) {
		boolean spotted = false;
		while(root != null && !spotted) {
			int n = root.getValue();
			
			if(searchVal > n)
				root = root.getRight();
			else if(searchVal < n)
				root = root.getLeft();
			else
				return true;
		}
		return spotted;
	}
	/*
	 * toString methods that prints an in-order transversal, pre-order transversal, 
	 * 	and post-order transversal respectively
	 */
	public String toString() {
		return inOrderToString(root);
	}
	public String preOrderToString() {
		return preOrderTransversal(root);
	}
	public String postOrderToString() {
		return postOrderTransversal(root);
	}
	/*
	 * Private recursive methods that receives the root node and proceeds to transverse through the tree
	 * 	transversal methods respectively
	 * 	- in-order
	 * 	- pre-order
	 * 	- post-order 
	 */
	private String inOrderToString(TreeNode t) {
		if(t == null) 
			return "";
		return inOrderToString(t.getLeft()) + t.getValue() + " " + inOrderToString(t.getRight());
	}
	private String preOrderTransversal(TreeNode t) {
		if(t == null) 
			return "";
		return t.getValue() + " " + inOrderToString(t.getLeft()) + inOrderToString(t.getRight());
	}
	private String postOrderTransversal(TreeNode t) {
		if(t == null) 
			return "";
		return postOrderTransversal(t.getLeft()) + postOrderTransversal(t.getRight()) + t.getValue() + " ";
	}
	/*
	 * .::WARNING::.
	 * Bad testing ahead
	 * Get your sick-bags ready
	 */
	public static void main(String[] args) {
		BinarySearchTree zz = new BinarySearchTree();
		System.out.println("Adding numbers");
		zz.add(6);
		System.out.println(zz.toString());
		zz.add(10);
		System.out.println(zz.toString());
		zz.add(19);
		System.out.println(zz.toString());
		zz.add(4);
		System.out.println(zz.toString());
		System.out.println();
		System.out.println("Transversals roll out!");
		System.out.println(zz.toString());
		System.out.println(zz.preOrderToString());
		System.out.println(zz.postOrderToString());
		System.out.println();
		System.out.println("Lets remove '10'");
		zz.remove(10);
		System.out.println(zz.toString());
		System.out.println(zz.preOrderToString());
		System.out.println(zz.postOrderToString());
		System.out.println();
		System.out.println("Forgot to add the meaning of life?");
		zz.add(42);
		System.out.println(zz.toString());
		System.out.println(zz.preOrderToString());
		System.out.println(zz.postOrderToString());
		System.out.println();
		System.out.println("Is '6' in this BST? T/F: " + zz.searchNode(6));
		System.out.println("Is '11' in this BST? T/F: " + zz.searchNode(11));
		System.out.println("How about '5'? T/F: " + zz.searchNode(5));
		System.out.println();

	}
	
}
