class CustomHashMap {

    private static class Entry {
        int key, value;
        Entry next;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 10;
    private Entry[] table = new Entry[capacity];

    private int hash(int key) {
        return key % capacity;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Entry head = table[index];

        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Entry newEntry = new Entry(key, value);
        newEntry.next = table[index];
        table[index] = newEntry;
    }

    public Integer get(int key) {
        int index = hash(key);
        Entry head = table[index];

        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        Entry head = table[index];
        Entry prev = null;

        while (head != null) {
            if (head.key == key) {
                if (prev == null) {
                    table[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }
}

public class CustomHashMapDemo {
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put(1, 100);
        map.put(11, 200);

        System.out.println(map.get(1));
        map.remove(1);
        System.out.println(map.get(1));
    }
}