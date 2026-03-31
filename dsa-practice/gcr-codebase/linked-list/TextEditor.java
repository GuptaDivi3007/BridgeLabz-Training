import java.util.*;

class TextState {
    String text;
    TextState prev, next;

    public TextState(String text) {
        this.text = text;
        this.prev = this.next = null;
    }
}

public class TextEditor {

	static TextState head = null;
	static TextState current = null;
	static int size = 0;
	static final int LIMIT = 10;

	public static void main(String[] args) {

		addState("Hello");
        addState("Hello World");
        addState("Hello World!");
        displayCurrent();
      
        undo();
        displayCurrent();

        undo();
        displayCurrent();

        redo();
        displayCurrent();
        
        addState("Hello World!!!");
        displayCurrent();

        redo();
	}

	public static void addState(String newText) {
        TextState newState = new TextState(newText);
        
        if (current != null && current.next != null) {
            current.next.prev = null;  
            current.next = null;
        }

        if (head == null) {
            head = newState;
            current = newState;
            size = 1;
        }
        else {
            current.next = newState;
            newState.prev = current;
            current = newState;
            size++;
        }
       
        while (size > LIMIT) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public static void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed.");
        }
        else {
            System.out.println("No more undo available!");
        }
    }
   
    public static void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed.");
        }
        else {
            System.out.println("No more redo available!");
        }
    }
   
    public static void displayCurrent() {
        if (current != null) {
            System.out.println("Current Text State: \"" + current.text + "\"");
        }
        else {
            System.out.println("Editor is empty.");
        }
    }
}
