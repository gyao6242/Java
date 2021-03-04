
public class Node {
	private Information value;
	private Node next;
	
	public Node(Information n) {
		value = n;
		next = null;
	}
	public Node(Information n, Node next) {
		value = n;
		this.next = next;
	}

	public Information getValue() {
		return value;
	}
	public Node getNext() {
		return next;
	}
	
	public void setValue(Information n){
		value = n;
	}
	public void setNext(Node next){
		this.next = next;
	}
}
