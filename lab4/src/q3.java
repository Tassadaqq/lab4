public class q3 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(1);

        Node node1 = linkedList.head;
        Node node2 = linkedList.head.next;
        Node node3 = linkedList.head.next.next;

        node3.next = node1;

        Node startingNode = linkedList.detectCycle();

        if (startingNode != null) {
            System.out.println("Cycle detected. Starting node of the cycle is: " + startingNode.data);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
