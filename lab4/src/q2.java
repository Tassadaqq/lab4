public class q2 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(1);

        System.out.println("Original Linked List:");
        linkedList.display();  // Output: 1 -> 2 -> 3 -> null

        linkedList.reverseIterative();
        System.out.println("Reversed Linked List:");
        linkedList.display();


        // Output: 3 -> 2 -> 1 -> null

        linkedList.reverseRecursive();

        System.out.println("Reversed Linked List:");
        linkedList.display();

    }

}