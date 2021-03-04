/*
 * Gregory Yao 
 * 27 March 2018
 * Linked List Project
 * 
 * Note:never let the user use/see the node, that's the linkedlist class: make it private
 */
public class StudentList{
	private StudentNode head, current, prev;
	
	/*
	 * An insertion method that takes (Student s) and places it into the list alphabetically
	 * 	First sees if the method is empty or if the student's last name goes before the headNode
	 * 		If the student's last name is alphabetically prior than the headNode, then it goes in front of the headNode
	 * 	If neither works, it checks if the two students have the same last name
	 * 		If so, the one with their first name being alphabetically higher goes first
	 * 		If they don't have the same last name (headNode's last name is prior to the inserted student's)
	 * 			the student being inserted goes after the head node
	 * 	Sets prevNode's next node to headNode to check the whole list
	 */
	public void lastNameInsert(Student s) {
		StudentNode headNode = new StudentNode(s);
        StudentNode currNode = head;
        StudentNode prevNode = null;
        
        if(currNode == null) {
            head = headNode;
            return;
        }
        while(currNode != null) {
        	String cFirstName = currNode.getValue().getFirstName();
        	String cLastName = currNode.getValue().getLastName();
        	String sFirstName = s.getFirstName();
        	String sLastName = s.getLastName();
        	
            if(currNode == null || cLastName.compareToIgnoreCase(sLastName) > 0){
                headNode.setNext(currNode);
                if(currNode == head) {
                    head = headNode;
                }
                else {
                    prevNode.setNext(headNode);
                }
                return;
            }
            else 
            	if(cLastName.compareToIgnoreCase(sLastName) == 0) {
            		if(cFirstName.compareToIgnoreCase(sFirstName) > 0) {
            			headNode.setNext(currNode);
            			if(currNode == head) {
            				head = headNode;
            			}
            			else
            				prevNode.setNext(headNode);
            			return;
            		}
            	}
            	prevNode = currNode;
            	currNode = currNode.getNext();
        }
        prevNode.setNext(headNode);
    }
	/*
	 * An insertion method that takes (Student s) and places it into a list by comparing GPA
	 * 	First sees if the method is empty or if the student's GPA is higher than the headNode
	 * 		If either works, the student is inserted before the head node
	 * 	If neither works, it checks if the two students have the same GPA
	 * 		If so, then the one with their first name being alphabetically higher goes first
	 * 		If they don't have the same GPA (headNode has a higher GPA), 
	 * 			the student being inserted goes after the head node
	 * 	Sets prevNode's next node to headNode to check the whole list
	 */
	public void averageInsert(Student s) {
		StudentNode headNode = new StudentNode(s);
        StudentNode currNode = this.head;
        StudentNode prevNode = null;
        
        if(currNode == null) {
            head = headNode;
            return;
        }
        while(currNode != null) {
        	String cFirstName = currNode.getValue().getFirstName();
        	String sFirstName = s.getFirstName();
        	int cGPA = currNode.getValue().getGpa();
        	int sGPA = s.getGpa();
        	
            if(currNode == null || cGPA < sGPA){
                headNode.setNext(currNode);
                if(currNode == head) {
                    head = headNode;
                }
                else {
                    prevNode.setNext(headNode);
                }
                return;
            }
            else 
            	if(cGPA == sGPA) {
            		if(cFirstName.compareToIgnoreCase(sFirstName) > 0) {
            			headNode.setNext(currNode);
            			if(currNode == head) {
            				head = headNode;
            			}
            			else
            				prevNode.setNext(headNode);
            			return;
            		}
            	}
            	prevNode = currNode;
            	currNode = currNode.getNext();
        }
        prevNode.setNext(headNode);
    }
	//Method that checks if the list is empty by seeing if the head's next reference is null
	public boolean isEmpty() {
		return head.getNext()== null;
	}
	/*
	 * Method that gets called by removeStudent(Student s)
	 * 	Removes Student's node by replacing its spot with the node that comes after it
	 */

	private void removeStudent(StudentNode n) {
		current = head;
		prev = null;

		if(current != null && current.getValue() == n.getValue()) {
			head = head.getNext();
			return;	
		}
		while(current != null && current.getValue() != n.getValue()) {
			prev = current;
			current = current.getNext();
		}
		prev.setNext(current.getNext());
		
	}
	/*
	 * Method that calls removeStudent(StudentNode n) to remove a student from the list
	 * 		checks if the list is empty beforehand to avoid calling removeStudent(StudentNode n) on an empty list
	 */
	public void removeStudent(Student s) {
		if(isEmpty())
			throw new NoStudentsException();
		StudentNode n = new StudentNode(s);
		this.removeStudent(n);
	}
	/*
	 * Method that sorts an (inferred) unsorted list by the Student's GPA by calling the averageInsert method
	 * 	Creates a new list for the sorted nodes to be stored
	 */
	public void sortByAverage() {
		current = head;
		StudentList sorted = new StudentList();
		
		while(current != null){
			StudentNode next = current.getNext();
			sorted.averageInsert(current.getValue());
			current = next;
		}
		head =sorted.head;
	}
	/*
	 * Method that sorts an (inferred) unsorted list by the Student's last names
	 *  by calling the lastNameInsert method
	 * 	Creates a new list for the sorted nodes to be stored
	 * 	
	 */
	public void sortByLastName() {
		current = head;
		StudentList sorted = new StudentList();
		
		while(current != null){
			StudentNode next = current.getNext();
			sorted.lastNameInsert(current.getValue());
			current = next;
		}
		head =sorted.head;
	}
	/*
	 * toString method to print/view the linked list
	 */
	public String toString() {
		String s = "";
        current = head;
        while(current.getNext() != null){
        	s += current.getValue().toString() + "\n";
            current = current.getNext();
        }
        return s + current.getValue().toString();
	}
	//Testing chambers
	public static void main(String args[]) {
		Student a = new Student("Thomas", "Edgars", 89);
		Student b = new Student("Jennifer", "Smith", 86);
		Student c = new Student("Harold", "Umberton", 78);
		Student d = new Student("Frank", "Martin", 60);
		Student e = new Student("Jeremy", "Andrews", 83);
		Student f = new Student("Laura", "Roberts", 93);
		Student g = new Student("Adele", "Lincoln", 85);
		Student h = new Student("Peter", "Smith", 91);
		Student i = new Student("Larry", "Peterson", 72);
		Student j = new Student("Alice", "Henderson", 96);
		
		StudentList list = new StudentList();
		
		list.averageInsert(a);
		list.averageInsert(b);
		list.averageInsert(c);
		list.averageInsert(d);
		list.averageInsert(e);
		list.averageInsert(f);
		list.averageInsert(g);
		list.averageInsert(h);
		list.averageInsert(i);
		list.averageInsert(j);
		System.out.println();
//		list.lastNameInsert(b);
//		list.lastNameInsert(c);
//		list.lastNameInsert(d);
//		list.lastNameInsert(e);
//		list.lastNameInsert(f);
//		list.lastNameInsert(g);
//		list.lastNameInsert(h);
//		list.lastNameInsert(i);
//		list.lastNameInsert(j);
		
		System.out.println("Print List");
		System.out.println(list.toString());
		System.out.println();
		System.out.println("Remove Students");
		list.removeStudent(a);
		list.removeStudent(e);
		list.removeStudent(h);
		list.removeStudent(f);
		list.removeStudent(j);
		System.out.println(list.toString());
		System.out.println();
		System.out.println("Sort by last name");
		list.averageInsert(a);
		list.averageInsert(e);
		list.averageInsert(h);
		list.averageInsert(f);
		list.averageInsert(j);
		list.sortByLastName();
		System.out.println(list.toString());
		System.out.println();
		System.out.println("Sort by GPA");
		list.sortByAverage();
		System.out.println(list.toString());
		
	}
}

