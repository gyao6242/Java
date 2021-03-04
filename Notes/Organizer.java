import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Organizer {
	private int tally = 0;
	private Node head, current, prev;
	
	public void addInfo(Information i) {
		if(head == null) {
			head = new Node(i);
			tally++;
		}
		Node add = new Node(i);
		add.setNext(head);
		head = add;
	}
	
	public void sortByLastName() {
		current = head;
		Organizer sorted = new Organizer();
		
		while(current != null){
			Node next = current.getNext();
			sorted.lastNameInsert(current.getValue());
			current = next;
		}
		head =sorted.head;
	}
	
	public void LoadInventoryFromFile(String fileName) {
		try {
			File loadFile = new File(fileName);
			Scanner s = new Scanner(loadFile);
			
			while(s.hasNextLine()) {
				String fName = s.nextLine();
				String lName = s.nextLine();
				String g = s.nextLine();
				int age = s.nextInt();
				s.nextLine();
				String nUPC = s.nextLine();
				
				Information info = new Information(fName, lName, g, age);
				addInfo(info);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}


}
