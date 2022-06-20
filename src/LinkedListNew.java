public class LinkedListNew {
    public static void main(String[] args) {

        //Linked list implementation
        LinkedListFunctions linkedListFunctions = new LinkedListFunctions();
        System.out.println("Linked list is :");
        linkedListFunctions.insertFirstNode(56);
        linkedListFunctions.insertLast(70);
        linkedListFunctions.toPrint();
        System.out.println("List after adding element in middle of the list is: ");
        linkedListFunctions.insertInBetween(56, 70, 30);
        linkedListFunctions.toPrint();
        System.out.println("Searching element found or not is displayed ");
        linkedListFunctions.findNode(30);
        System.out.println("Element 40 added after node 30 in the list");
        linkedListFunctions.appendingNode(30, 40);
        linkedListFunctions.toPrint();
        System.out.println("Ordered linked list is as follows");
        linkedListFunctions.ascendingOrder();
        linkedListFunctions.toPrint();
    }
}
