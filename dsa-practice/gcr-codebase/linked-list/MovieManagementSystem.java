package LinkedList;

import java.util.Scanner;

class Movie{
	String title;
    String director;
    int year;
    double rating;
    Movie next;
	Movie prev;

    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
public class MovieManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie head=null;
		head=addFirst(head,"Inception", "Nolan", 2010, 9.0);
		head=addLast(head,"Interstellar", "Nolan", 2014, 8.6);
		head=addAtPosition(head,"Tenet", "Nolan", 2020, 7.5, 2);
		display(head);
		System.out.println("---------------------------------");
		delete(head,"Inception");
		System.out.println("---------------------------------");
		display(head);
		System.out.println("---------------------------------");
		head=addFirst(head,"Inception", "Nolan", 2010, 9.0);
		System.out.println("---------------------------------");
		
		searchRating(head,8.6);
		System.out.println("---------------------------------");
		updateRating(head,"Inception",8.6);
		System.out.println("---------------------------------");
		displaybackward(head);
		
	}
    
	public static Movie addFirst(Movie head,String title, String director, int year, double rating) {
    	Movie newNode=new Movie(title,director,year,rating);
    	if(head==null) {
    		return newNode;
    	}
    	newNode.next=head;
    	head.prev=newNode;
    	return newNode;
    }
    public static Movie addLast(Movie head,String title, String director, int year, double rating) {
    	Movie newNode=new Movie(title,director,year,rating);
    	if(head==null) {
    		return newNode;
    	}
    	Movie temp=head;
    	while(temp.next!=null) {
    		temp=temp.next;
    	}
    	temp.next=newNode;
    	newNode.prev=temp;
    	return head;
    }
    public static Movie addAtPosition(Movie head,String title, String director, int year, double rating,int pos) {
    	Movie newNode=new Movie(title,director,year,rating);
    	if (pos == 1) {
            if (head != null) {
                head.prev = newNode;
                newNode.next = head;
            }
            return newNode;
        }
    	Movie temp = head;
        int count = 1;

        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        
        if (temp == null) {
            System.out.println("Invalid Position");
            return head;
        }

        
        Movie nextNode = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = nextNode;

        if (nextNode != null) {   
            nextNode.prev = newNode;
        }

        return head;
    }
    public static void display(Movie head) {
    	Movie temp=head;
    	while(temp!=null) {
    		System.out.println(temp.title+" "+temp.director+" "+temp.year+" "+temp.rating+" ");
    		temp=temp.next;
    	}
    }
   
    public static void delete(Movie head,String title) {
    	Movie temp=head;
    	Movie curr=null;
    	while(temp!=null) {
    		if(temp.title.equals(title)) {
    			if(curr!=null) {
    				Movie newNode=temp.next;
    				curr.next=newNode;
    				newNode.prev=curr;
    			}
    			else {
    				head=temp.next;
    			}
    			return;
    		}
    		curr=temp;
    		temp=temp.next;
    		
    	}
    }
    public static void searchRating(Movie head,double ratings) {
    	Movie temp=head;
    	while(temp!=null) {
    		if(temp.rating==ratings) {
    			System.out.println(temp.title+" "+temp.director+" "+temp.year+" "+temp.rating);
    		}
    		temp=temp.next;
    	}
    }
    public static Movie updateRating(Movie head,String title,double rating) {
    	
    	Movie temp=head;
    	while(temp!=null) {
    		if(temp.title==title) {
    			temp.rating=rating;
    			System.out.println(temp.title+" "+temp.director+" "+temp.year+" "+temp.rating);
    			return head;
    		}
    	}
    	System.out.println("Student Not Found!");
    	return head;
    }
    public static void displaybackward(Movie head) {
    	Movie temp=head;
    	while(temp.next!=null) {
    		temp=temp.next;
    	}
    	while(temp!=null) {
    		System.out.println(temp.title+" "+temp.director+" "+temp.year+" "+temp.rating);
    		temp=temp.prev;
    	}
    }
}
