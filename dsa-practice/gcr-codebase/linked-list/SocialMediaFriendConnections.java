package LinkedList;
import java.util.*;
class User {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friends;
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}
public class SocialMediaFriendConnections {
    static User head=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addUser(1, "Alice", 21);
        addUser(2, "Bob", 23);
        addUser(3, "Charlie", 20);
        addUser(4, "David", 24);

        
        addFriendConnection(1, 2);
        addFriendConnection(1, 3);
        addFriendConnection(2, 3);

        System.out.println();
        displayFriends(1);

        System.out.println();
        findMutualFriends(1, 2);

        System.out.println();
        countFriends();

        System.out.println();
        removeFriendConnection(1, 2);

        System.out.println();
        displayFriends(1);
        displayFriends(2);
	}
	public static void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);

        if (head == null) {
            head = newUser;
            return;
        }

        User temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newUser;
    }

   
    public static User findUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

   
    public static User searchByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

  
    public static void addFriendConnection(int userId1, int userId2) {
        User u1 = findUserById(userId1);
        User u2 = findUserById(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found!");
            return;
        }

        if (!u1.friends.contains(userId2)) u1.friends.add(userId2);
        if (!u2.friends.contains(userId1)) u2.friends.add(userId1);

        System.out.println(u1.name + " and " + u2.name + " are now friends.");
    }

  
    public static void removeFriendConnection(int userId1, int userId2) {
        User u1 = findUserById(userId1);
        User u2 = findUserById(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found!");
            return;
        }

        u1.friends.remove(Integer.valueOf(userId2));
        u2.friends.remove(Integer.valueOf(userId1));

        System.out.println(u1.name + " and " + u2.name + " are no longer friends.");
    }

    
    public static void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        if (user.friends.isEmpty()) {
            System.out.println("No friends yet.");
            return;
        }

        for (int fid : user.friends) {
            User f = findUserById(fid);
            System.out.println("- " + f.userId + " | " + f.name + " | Age: " + f.age);
        }
    }

  
    public static void findMutualFriends(int userId1, int userId2) {
        User u1 = findUserById(userId1);
        User u2 = findUserById(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.println("Mutual Friends of " + u1.name + " and " + u2.name + ":");

        boolean found = false;
        for (int fid : u1.friends) {
            if (u2.friends.contains(fid)) {
                User mutual = findUserById(fid);
                System.out.println("- " + mutual.userId + " | " + mutual.name);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No mutual friends.");
        }
    }

   
    public static void countFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friends.size() + " friends.");
            temp = temp.next;
        }
    }
}
