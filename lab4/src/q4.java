public class q4 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtBeginning(5);
        linkedList.insertAtBeginning(4);
        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(1);

        Node middleNode = linkedList.findMiddleNode();

        if (middleNode != null) {
            System.out.println("Middle node value: " + middleNode.data);
        } else {
            System.out.println("List is empty.");
        }
    }

}
