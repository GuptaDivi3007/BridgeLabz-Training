import java.util.*;

class Node{
	int rollNumber;
	String name;
	int age;
	String grade;
	Node next;

	Node(int rollNumber, String name, int age, String grade){
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}
}

public class StudentRecordMangement {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a student details: ");
		int detailsCount = sc.nextInt();
		Node head = null;

		while(detailsCount > 0) {
			System.out.println("run");
			int rollNumber = sc.nextInt();
			String name = sc.next();
			int age = sc.nextInt();
			String grade = sc.next();
			System.out.println("enter what you choose you want to store the data at the end ,begining or at specific area:");
			System.out.println("enter 1 for end, enter 2 for start, enter 0 for specific position");
			int choose = sc.nextInt();
			switch(choose) {
			case 0: {
				head = addStudent(head, rollNumber, name, age, grade);
				break;
			}
			case 1: {
				head = addStudentAtStart(head, rollNumber, name, age, grade);
				break;
			}
			case 2: {
				int pos = sc.nextInt();
				head = addStudentAtPlace(head, rollNumber, name, age, grade, pos);
				break;
			}
			}
			
			detailsCount--;
		}

		display(head);
		int rollNum = sc.nextInt();
		head = delete(head, rollNum);
		display(head);
		int rollNum1 = sc.nextInt();
		searchStudent(head, rollNum1);
		head = updateGrade(head, rollNum, sc);
		display(head);

	}
	public static Node addStudentAtStart(Node temp, int rollNumber, String name, int age, String grade) {
		Node head = new Node(rollNumber, name, age, grade);
		if(head == null) {
			head=temp;
		}
		else {
			head.next = temp;
		}
		
		return head;
	}
	public static Node addStudent(Node head, int rollNumber, String name, int age, String grade) {
		Node temp = new Node(rollNumber, name, age, grade);
		if(head == null) {
			return temp;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		return head;
	}
	public static Node addStudentAtPlace(Node head, int rollNumber, String name, int age, String grade, int pos) {
		Node newNode = new Node(rollNumber, name, age, grade);
		if(pos == 1) {
			newNode.next = head;
			return newNode;
		}
		Node temp = head;
        int count = 1;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of range!");
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
	} 
    public static void display(Node head) {
    	Node temp = head;
    	while(temp != null) {
    		System.out.println("value of each node: ");
    		System.out.print(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade + " ");
    		System.out.println();
    		temp = temp.next;
    	}
    }
    public static Node delete(Node head, int rollNum) {
    	Node curr = head;
    	Node prev = null;
    	
    	while(curr != null) {
    		if(curr.rollNumber == rollNum) {
    			if(prev != null) {
    				prev.next = curr.next;
    				break;
    			}
    			else {
    				head = curr.next;
    			}
    		}
    		prev = curr;
            curr = curr.next;
    	}
    	return head;
    }
    public static void searchStudent(Node head, int rollNum) {
    	Node temp = head;
    	while(temp != null) {
    		if(temp.rollNumber == rollNum) {
    			System.out.println(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade + " ");
    			return;
    		}
    	}
    	System.out.println("Student Not Found!");
    	return;
    }
    public static Node updateGrade(Node head, int rollNum, Scanner sc) {
    	String updateGrade = sc.nextLine();
    	Node temp = head;
    	while(temp != null) {
    		if(temp.rollNumber == rollNum) {
    			temp.grade = updateGrade;
    			System.out.println(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade + " ");
    			return head;
    		}
    	}
    	System.out.println("Student Not Found!");
    	return head;
    }
}
