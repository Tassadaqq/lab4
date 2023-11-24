public class q5 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();


        Node node1 = new Node(1);
        Node node3 = new Node(3);
        Node node5 = new Node(5);
        list1.head = node1;
        node1.next = node3;
        node3.next = node5;


        Node node2 = new Node(2);
        Node node4 = new Node(4);
        Node node6 = new Node(6);
        list2.head = node2;
        node2.next = node4;
        node4.next = node6;

        LinkedList mergedList = LinkedList.mergeSortedLists(list1, list2);

        System.out.println("Merged Sorted List:");
        mergedList.display();
    }
}
