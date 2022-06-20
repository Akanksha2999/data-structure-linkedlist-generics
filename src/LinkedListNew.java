public class LinkedListNew {
    public static void main(String[] args) {

        //Linked list created
        LinkedListFunctions linkedListFunctions = new LinkedListFunctions();
        System.out.println("Linked list is :");
        linkedListFunctions.insertFirstNode(56);
        linkedListFunctions.insertLast(70);
        linkedListFunctions.toPrint();
        System.out.println("List after adding element in middle of the list is");
        linkedListFunctions.insertInBetween(56, 70, 30);
        linkedListFunctions.toPrint();
    }
}
