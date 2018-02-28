package Ch16_List;

// Simple first version of LinkedIntList with just a constructor
// and methods for add and toString.

public class LinkedIntList {

    private int counter;

    public void add(int index, int value)
    {
        ListNode current = front;
        while (true) {
            current = current.next;
            counter++;
            if (counter == index)
                break;
        }
        //current.next = new ListNode(value);
        current.data = value;
    }

    private ListNode front;  // first value in the list

    // post: constructs an empty list
    public LinkedIntList() {
        front = null;
    }

    // post: returns comma-separated, bracketed version of list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }
}