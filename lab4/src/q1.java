class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    public void reverseRecursive() {
        head = reverseRecursiveUtil(head);
    }
    public Node detectCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
    public Node findMiddleNode() {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static LinkedList mergeSortedLists(LinkedList list1, LinkedList list2) {
        LinkedList mergedList = new LinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;

        Node current = mergedList.head; // Current node in the merged list

        while (current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                if (current == null) {
                    mergedList.head = new Node(current1.data);
                    current = mergedList.head;
                } else {
                    current.next = new Node(current1.data);
                    current = current.next;
                }
                current1 = current1.next;
            } else {
                if (current == null) {
                    mergedList.head = new Node(current2.data);
                    current = mergedList.head;
                } else {
                    current.next = new Node(current2.data);
                    current = current.next;
                }
                current2 = current2.next;
            }
        }
        while (current1 != null) {
            if (current == null) {
                mergedList.head = new Node(current1.data);
                current = mergedList.head;
            } else {
                current.next = new Node(current1.data);
                current = current.next;
            }
            current1 = current1.next;
        }

        while (current2 != null) {
            if (current == null) {
                mergedList.head = new Node(current2.data);
                current = mergedList.head;
            } else {
                current.next = new Node(current2.data);
                current = current.next;
            }
            current2 = current2.next;
        }

        return mergedList;
    }
    private Node reverseRecursiveUtil(Node current) {
        if (current == null || current.next == null) {
            return current;
        }

        Node nextNode = current.next;
        current.next = null;

        Node reversedList = reverseRecursiveUtil(nextNode);
        nextNode.next = current;

        return reversedList;
    }
    public void reverseIterative() {
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        head = prev;
    }
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteNode(int key) {
        Node current = head;
        Node prev = null;

        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        prev.next = current.next;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class q1 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(1);

        System.out.println("Linked List:");
        linkedList.display();

        linkedList.deleteNode(2);

        System.out.println("Linked List after deleting 2:");
        linkedList.display();
    }
}
