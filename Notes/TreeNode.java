
public class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int n){
		this.value = n;
		this.left = this.right = null;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int n) {
		this.value = n;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode t) {
		this.left = t;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode t) {
		this.right = t;
	}
	public String toString() {
		String str = ", ";
		return str += value + ", ";
	}
}
